<%-- 
    Document   : index.jsp
    Created on : 29-Apr-2012, 17:49:47
    Author     : Alexander J. Harris
    Modified   : 03-May-2012
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Searching...</title>
  </head>
  <body>
    <h1>Searching for a document identifier</h1>
    <p>If this page does not refresh click <a href="./main.jsp">here</a>.</p>
  </body>
</html>
<% 
  String queryString = request.getQueryString();
  if (queryString==null)
  {
    // There's nothing in the query string. Push the user to the main page
    response.sendRedirect("./main.jsp");
  }
  else if (queryString.contains("docId"))
  {
    // We can see that there's a docId in the query string so let's show the document details.
    response.sendRedirect("./document?" + request.getQueryString());
  }
  else
  {
    // There's something else in the query string. Push the request to the main home page
    response.sendRedirect("./main.jsp");
  }
  
%>
