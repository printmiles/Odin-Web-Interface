/* Class name: MetadataCollector
 * File name:  MetadataCollector.java
 * Project:    Open Document and Information Network (Odin)
 * Copyright:  © 2007-2012 Alexander J. Harris, all rights reserved
 * Created:    29-Apr-2012 17:49:47
 * Modified:   29-Apr-2012
 *
 * Version History:
 * ~ ~ ~ ~ ~ ~ ~ ~ ~
 * 0.001  29-Apr-2012 Initial build
 */
package odin.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import odin.odin.ws.jaxws.GetDocumentMetadataResponse;
import odin.odin.ws.jaxws.ObjectFactory;
import odin.odin.ws.jaxws.SleipnirService;

public class MetadataCollector extends HttpServlet
{
  /**
   * Processes requests for both HTTP
   * <code>GET</code> and
   * <code>POST</code> methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException
  {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    long split1 = System.currentTimeMillis();
    try
    {
      out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"");
      out.println("\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
      out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" >");
      out.println("<head>");
      out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\" />");
      out.println("<title>Open Document &amp; Information Network</title>");
      out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"Odin.css\"/>");
      out.println("</head>");
      out.println("<body>");
      out.println("<div id=\"container\">");
      out.println("<div id=\"intro\">");
      out.println("<div id=\"pageHeader\">");
      out.println("<h1><span>Odin</span></h1>");
      out.println("<h2><span>Open Document &amp; Information Network</span></h2>");
      out.println("</div>");
      out.println("<div id=\"quickSummary\">");
      out.println("<p class=\"p1\"><span>Odin allows for the curation, storage &amp; retrieval of documents over the medium to long-term.</span></p>");
      out.println("<p class=\"p2\"><span>Start the Odin <a href=\"./resources/sleipnir.jnlp\" title=\"The client application for accessing Odin servers.\">client</a> and the comprehensive<a href=\"manual.jsp\" title=\"The user manual for Odin and it's client, Sleipnir.\">user manual</a></span></p>");
      out.println("</div>");
      
      // Get the document from the repository by contacting the web-service
      String documentId = findRequestedDocId(request.getQueryString());
      GetDocumentMetadataResponse.Return repositoryDoc = contactService(documentId);
      GetDocumentMetadataResponse.Return.Metadata metadata = repositoryDoc.getMetadata();
      
      // Output the document summary
      out.println("<div id=\"metaDocSummary\">");
      out.println("<h3><span>Document Summary</span></h3>");
      out.println("<p class=\"p1\"><span><table class=\"data\">");
      out.println("<tr><td>Document ID</td><td>" + documentId + "</td></tr>");
      
      // Perform a quick check to see whether a document has been returned from the server or not
      if (metadata == null)
      {
        // Show something to the user and exit
        out.println("<tr><td>Error</td><td>Document not found in the repository</td></tr>");
        out.println("</table>");
        out.println("</span>");
        out.println("</p></div></div>");
        out.println("<div id=\"supportingText\">");
      }
      else
      {
        out.println("<tr><td>Title</td><td>" + metadata.getTitle() + "</td></tr>");
        
        GetDocumentMetadataResponse.Return.Metadata.Author author = metadata.getAuthor();
        
        out.println("<tr><td>Author</td><td>" + author.getPrefix() + "&nbsp;" + author.getFirstName() + "&nbsp;"
                + author.getSurname() + "</td></tr>");
        out.println("<tr><td>Organisation</td><td>" + author.getCompany() + "</td></tr>");
        out.println("<tr><td>Email</td><td>" + author.getEmail() + "</td></tr>");
        out.println("<tr><td>Web-site</td><td>" + author.getWebsite() + "</td></tr>");
        out.println("<tr><td>MIME Type</td><td>" + metadata.getMimetype() + "</td></tr>");
        out.println("<tr><td>File Extension</td><td>" + metadata.getFileextension() + "</td></tr>");
        
        GetDocumentMetadataResponse.Return.Metadata.Locale locale = metadata.getLocale();
        
        out.println("<tr><td>Locale</td><td>" + locale.getLanguage() + ":" + locale.getCountry().toUpperCase() + "</td></tr>");
        out.println("</table></span></p></div></div>");

        // Output the attributes

        out.println("<div id=\"supportingText\">");
        out.println("<div id=\"metaDocAttributes\">");
        out.println("<h3><span>Attributes</span></h3>");
        out.println("<p class=\"p1\"><span><table class=\"data\">");
        out.println("<caption>Attributes</caption>");
        out.println("<tr><th scope=\"col\">Key</th><th scope=\"col\">Value</th></tr>");

        GetDocumentMetadataResponse.Return.Metadata.Attributes attributes = metadata.getAttributes();
        
        for (int i=0; i< attributes.getAttribute().size(); i++)
        {
          if ((i==0) || (i%2 == 0))
          {
            // Apply normal formatting
            out.println("<tr>");
          }
          else
          {
            // Highlight alternate rows
            out.println("<tr class=\"alt\">");
          }
          out.println("<td>");
          out.println(attributes.getAttribute().get(i).getKey());
          out.println("</td><td>");
          out.println(attributes.getAttribute().get(i).getValue());
          out.println("</td></tr>");
        }

        out.println("</table></span></p></div>");

        // Output the keywords

        out.println("<div id=\"metaDocKeywords\">");
        out.println("<h3><span>Keywords</span></h3>");
        out.println("<p class=\"p1\"><span><table class=\"data\">");
        out.println("<caption>Document Keywords</caption>");

        GetDocumentMetadataResponse.Return.Metadata.Keywords keywords = metadata.getKeywords();
        
        for (int i=0; i< keywords.getKeyword().size(); i++)
        {
          if ((i==0) || (i%2 == 0))
          {
            // Apply normal formatting
            out.println("<tr>");
          }
          else
          {
            // Highlight alternate rows
            out.println("<tr class=\"alt\">");
          }
          out.println("<td>");
          out.println(keywords.getKeyword().get(i));
          out.println("</td></tr>");
        }

        out.println("</table></span></p></div>");
        
        // Output additional information
        
        out.println("<div id=\"metaDocAdditional\">");
        out.println("<h3><span>Additional Information</span></h3>");
        out.println("<p class=\"p1\"><span>");
        out.println("Page Generated at:&nbsp;" + Calendar.getInstance().getTime().toString());
        out.println("</span></p>");
        long split2 = System.currentTimeMillis();
        out.println("<p class=\"p2\"<span>Page retrieved in:&nbsp;" + (split2-split1) + "&nbsp;ms</span></p></div>");
      }
      out.println("<div id=\"footer\">");
      out.println("<span>");
      out.println("<a href=\"http://creativecommons.org/licenses/by-nc-sa/1.0/\" title=\"View details of the license of this site, courtesy of Creative Commons\">cc</a> &nbsp;|");
      out.println("<a href=\"http://www.csszengarden.com\" title=\"CSS Zen Garden\">css zen garden</a> &nbsp;|");
      out.println("<a href=\"http://www.kcl.ac.uk/nms/depts/informatics\" title=\"Department of Informatics at King&#8217;s College London\">department of informatics</a>");
      out.println("</span>");
      out.println("</div>");
      out.println("</div>");
      out.println("<div id=\"linkList\">");
      out.println("<div id=\"linkList2\">");
      out.println("<div id=\"llinks\">");
      out.println("<h3><span>Links:</span></h3>");
      out.println("<ul>");
      out.println("<li><a href=\"main.jsp\" title=\"The main home page for this repository\">Home</a>&nbsp;</li>");
      out.println("<li><a href=\"additional.jsp\" title=\"Additional information about Odin\">Additional information</a>&nbsp;</li>");
      out.println("<li><a href=\"admins.jsp\" title=\"Information about Odin and Sleipnir for administrators and advanced users\">Administrators</a>&nbsp;</li>");
      out.println("<li><a href=\"manual.jsp\" title=\"User guides for reference and offline viewing\">User guides</a>&nbsp;</li>");
      out.println("</ul>");
      out.println("</div>");
      out.println("<div id=\"lresources\">");
      out.println("<h3><span>Resources:</span></h3>");
      out.println("<ul>");
      out.println("<li><a href=\"http://get.adobe.com/reader/\" title=\"Download Adobe's Acrobat Reader to view user guides\">Adobe Acrobat</a></li>");
      out.println("<li><a href=\"http://www.java.com/download\" title=\"Download Java Virtual Machine to run Sleipnir\">Java</a></li>");
      out.println("<li><a href=\"http://www.apache.org\" title=\"View the Apache Software Foundation's website\">Apache Software Foundation</a></li>");
      out.println("<li><a href=\"http://tomcat.apache.org\" title=\"Access the project page for Apache Tomcat\">Apache Tomcat</a></li>");
      out.println("<li><a href=\"http://tika.apache.org\" title=\"Access the project page for Apache Tika\">Apache Tika</a></li>");
      out.println("</ul>");
      out.println("</div>");
      out.println("</div>");
      out.println("</div>");
      out.println("</div>");
      out.println("<div id=\"extraDiv1\">");
      out.println("<span></span>");
      out.println("</div>");
      out.println("</body>");
      out.println("</html>");
    }
    finally
    {      
      out.close();
    }
  }
  
  
  
  
  private String findRequestedDocId(String queryString)
  {
    String docId = "";
    if (!queryString.contains("docId"))
    {
      return null;
    }
    else
    {
      // We're expecting the url to be along the lines of http://something/odin?docId=abc
      String[] temp = queryString.split("=");
      // So the second item in the array will be the doc identifier.
      docId = temp[1];
    }
    return docId;
  }
  
  /**
   * This method is responsible for contacting the service on the server
   * and collecting the meta-data for the supplied identifier.
   * @param guid The unique identifier of the requested document
   * @return An instance of Document which contains the meta-data. If there's an error a blank document is returned instead.
   * @see odin.shared.xml.Document
   */
  private GetDocumentMetadataResponse.Return contactService(String guid)
  {
    String SLEIPNIR_SERVICE = "/Sleipnir";
    String SLEIPNIR_TCP_PORT = "13440";
    String SLEIPNIR_PACKAGE = "http://ws.odin.odin/";
    String hostName = "";
    
    try
    {
      hostName = InetAddress.getLocalHost().getHostAddress().toString();
    }
    catch (UnknownHostException uhX)
    {
      System.out.println("UnknownHostException caught. Using local loopback address (127.0.0.1). " + uhX);
      hostName = "127.0.0.1";
    }
    
    String sleipnirUrl = "http://" + hostName + ":" + SLEIPNIR_TCP_PORT + SLEIPNIR_SERVICE;
    
    ObjectFactory responseFactory = new ObjectFactory();
    GetDocumentMetadataResponse.Return metadata = responseFactory.createGetDocumentMetadataResponseReturn();
    
    try
    {
      URL url = new URL(sleipnirUrl);
      QName qnSleipnir = new QName(SLEIPNIR_PACKAGE,"SleipnirServiceImplService");
      Service service = Service.create(url, qnSleipnir);
      SleipnirService sleipnir = service.getPort(SleipnirService.class);
      metadata = sleipnir.getDocumentMetadata(guid);
    }
    catch (Exception e)
    {
      System.out.println("Error contacting Sleipnir service at: " + sleipnirUrl + e);
    }
    finally
    {
      return metadata;
    }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP
   * <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP
   * <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>
}
