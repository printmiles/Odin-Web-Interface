
package odin.odin.ws.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the odin.odin.ws.jaxws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BasicSearch_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "basicSearch");
    private final static QName _GetDocumentMetadataResponse_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getDocumentMetadataResponse");
    private final static QName _UploadResponse_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "uploadResponse");
    private final static QName _GetZipPolicyResponse_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getZipPolicyResponse");
    private final static QName _GetServerInfoResponse_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getServerInfoResponse");
    private final static QName _GetDocumentMetadata_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getDocumentMetadata");
    private final static QName _Search_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "search");
    private final static QName _GetBarcodeUrl_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getBarcodeUrl");
    private final static QName _BasicSearchResponse_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "basicSearchResponse");
    private final static QName _Upload_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "upload");
    private final static QName _GetXmlPolicy_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getXmlPolicy");
    private final static QName _GetDocument_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getDocument");
    private final static QName _GetServerInfo_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getServerInfo");
    private final static QName _SearchResponse_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "searchResponse");
    private final static QName _GetXmlPolicyResponse_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getXmlPolicyResponse");
    private final static QName _GetBarcodeUrlResponse_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getBarcodeUrlResponse");
    private final static QName _GetZipPolicy_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getZipPolicy");
    private final static QName _GetDocumentResponse_QNAME = new QName("http://sites.google.com/site/printmiles/Odin", "getDocumentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: odin.odin.ws.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDocumentResponse.Return }
     * 
     */
    public GetDocumentResponse.Return createGetDocumentResponseReturn() {
        return new GetDocumentResponse.Return();
    }

    /**
     * Create an instance of {@link UploadResponse.Return.Appendix.Info.Policies }
     * 
     */
    public UploadResponse.Return.Appendix.Info.Policies createUploadResponseReturnAppendixInfoPolicies() {
        return new UploadResponse.Return.Appendix.Info.Policies();
    }

    /**
     * Create an instance of {@link SearchResponse.Return.Document }
     * 
     */
    public SearchResponse.Return.Document createSearchResponseReturnDocument() {
        return new SearchResponse.Return.Document();
    }

    /**
     * Create an instance of {@link BasicSearch.Arg0 .Document }
     * 
     */
    public BasicSearch.Arg0 .Document createBasicSearchArg0Document() {
        return new BasicSearch.Arg0 .Document();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return.Appendix.Info }
     * 
     */
    public GetServerInfoResponse.Return.Appendix.Info createGetServerInfoResponseReturnAppendixInfo() {
        return new GetServerInfoResponse.Return.Appendix.Info();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link GetDocumentResponse.Return.Metadata.Keywords }
     * 
     */
    public GetDocumentResponse.Return.Metadata.Keywords createGetDocumentResponseReturnMetadataKeywords() {
        return new GetDocumentResponse.Return.Metadata.Keywords();
    }

    /**
     * Create an instance of {@link GetBarcodeUrlResponse }
     * 
     */
    public GetBarcodeUrlResponse createGetBarcodeUrlResponse() {
        return new GetBarcodeUrlResponse();
    }

    /**
     * Create an instance of {@link GetBarcodeUrl }
     * 
     */
    public GetBarcodeUrl createGetBarcodeUrl() {
        return new GetBarcodeUrl();
    }

    /**
     * Create an instance of {@link Response.Appendix.Trust }
     * 
     */
    public Response.Appendix.Trust createResponseAppendixTrust() {
        return new Response.Appendix.Trust();
    }

    /**
     * Create an instance of {@link BasicSearchResponse.Return.Document.Locale }
     * 
     */
    public BasicSearchResponse.Return.Document.Locale createBasicSearchResponseReturnDocumentLocale() {
        return new BasicSearchResponse.Return.Document.Locale();
    }

    /**
     * Create an instance of {@link GetDocumentMetadataResponse.Return.Metadata.Attributes.Attribute }
     * 
     */
    public GetDocumentMetadataResponse.Return.Metadata.Attributes.Attribute createGetDocumentMetadataResponseReturnMetadataAttributesAttribute() {
        return new GetDocumentMetadataResponse.Return.Metadata.Attributes.Attribute();
    }

    /**
     * Create an instance of {@link Results.Document.Author }
     * 
     */
    public Results.Document.Author createResultsDocumentAuthor() {
        return new Results.Document.Author();
    }

    /**
     * Create an instance of {@link odin.odin.ws.jaxws.Document.Metadata.Locale }
     * 
     */
    public odin.odin.ws.jaxws.Document.Metadata.Locale createDocumentMetadataLocale() {
        return new odin.odin.ws.jaxws.Document.Metadata.Locale();
    }

    /**
     * Create an instance of {@link SearchResponse.Return.Document.Attributes.Attribute }
     * 
     */
    public SearchResponse.Return.Document.Attributes.Attribute createSearchResponseReturnDocumentAttributesAttribute() {
        return new SearchResponse.Return.Document.Attributes.Attribute();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return.Appendix.Info.Subjects }
     * 
     */
    public GetServerInfoResponse.Return.Appendix.Info.Subjects createGetServerInfoResponseReturnAppendixInfoSubjects() {
        return new GetServerInfoResponse.Return.Appendix.Info.Subjects();
    }

    /**
     * Create an instance of {@link SearchResponse.Return.Document.Author }
     * 
     */
    public SearchResponse.Return.Document.Author createSearchResponseReturnDocumentAuthor() {
        return new SearchResponse.Return.Document.Author();
    }

    /**
     * Create an instance of {@link odin.odin.ws.jaxws.Document.Metadata.Author }
     * 
     */
    public odin.odin.ws.jaxws.Document.Metadata.Author createDocumentMetadataAuthor() {
        return new odin.odin.ws.jaxws.Document.Metadata.Author();
    }

    /**
     * Create an instance of {@link UploadResponse.Return.Appendix }
     * 
     */
    public UploadResponse.Return.Appendix createUploadResponseReturnAppendix() {
        return new UploadResponse.Return.Appendix();
    }

    /**
     * Create an instance of {@link Response.Appendix }
     * 
     */
    public Response.Appendix createResponseAppendix() {
        return new Response.Appendix();
    }

    /**
     * Create an instance of {@link Search.Arg0 .Document.Keywords }
     * 
     */
    public Search.Arg0 .Document.Keywords createSearchArg0DocumentKeywords() {
        return new Search.Arg0 .Document.Keywords();
    }

    /**
     * Create an instance of {@link Search.Arg0 .Document.Author }
     * 
     */
    public Search.Arg0 .Document.Author createSearchArg0DocumentAuthor() {
        return new Search.Arg0 .Document.Author();
    }

    /**
     * Create an instance of {@link Results.Document.Attributes.Attribute }
     * 
     */
    public Results.Document.Attributes.Attribute createResultsDocumentAttributesAttribute() {
        return new Results.Document.Attributes.Attribute();
    }

    /**
     * Create an instance of {@link Response.Appendix.Info.Policies.Xml }
     * 
     */
    public Response.Appendix.Info.Policies.Xml createResponseAppendixInfoPoliciesXml() {
        return new Response.Appendix.Info.Policies.Xml();
    }

    /**
     * Create an instance of {@link GetDocumentMetadataResponse.Return.Metadata.Locale }
     * 
     */
    public GetDocumentMetadataResponse.Return.Metadata.Locale createGetDocumentMetadataResponseReturnMetadataLocale() {
        return new GetDocumentMetadataResponse.Return.Metadata.Locale();
    }

    /**
     * Create an instance of {@link GetDocumentMetadataResponse }
     * 
     */
    public GetDocumentMetadataResponse createGetDocumentMetadataResponse() {
        return new GetDocumentMetadataResponse();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return.Appendix.Info.Policies.Zip }
     * 
     */
    public GetServerInfoResponse.Return.Appendix.Info.Policies.Zip createGetServerInfoResponseReturnAppendixInfoPoliciesZip() {
        return new GetServerInfoResponse.Return.Appendix.Info.Policies.Zip();
    }

    /**
     * Create an instance of {@link GetDocumentResponse.Return.Metadata.Author }
     * 
     */
    public GetDocumentResponse.Return.Metadata.Author createGetDocumentResponseReturnMetadataAuthor() {
        return new GetDocumentResponse.Return.Metadata.Author();
    }

    /**
     * Create an instance of {@link Results.Document.Keywords }
     * 
     */
    public Results.Document.Keywords createResultsDocumentKeywords() {
        return new Results.Document.Keywords();
    }

    /**
     * Create an instance of {@link GetDocumentMetadataResponse.Return }
     * 
     */
    public GetDocumentMetadataResponse.Return createGetDocumentMetadataResponseReturn() {
        return new GetDocumentMetadataResponse.Return();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link odin.odin.ws.jaxws.Document.Metadata.Attributes }
     * 
     */
    public odin.odin.ws.jaxws.Document.Metadata.Attributes createDocumentMetadataAttributes() {
        return new odin.odin.ws.jaxws.Document.Metadata.Attributes();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return.Appendix.Info.Policies.Trust }
     * 
     */
    public GetServerInfoResponse.Return.Appendix.Info.Policies.Trust createGetServerInfoResponseReturnAppendixInfoPoliciesTrust() {
        return new GetServerInfoResponse.Return.Appendix.Info.Policies.Trust();
    }

    /**
     * Create an instance of {@link Search.Arg0 }
     * 
     */
    public Search.Arg0 createSearchArg0() {
        return new Search.Arg0();
    }

    /**
     * Create an instance of {@link UploadResponse.Return.Appendix.Info.Policies.Xml }
     * 
     */
    public UploadResponse.Return.Appendix.Info.Policies.Xml createUploadResponseReturnAppendixInfoPoliciesXml() {
        return new UploadResponse.Return.Appendix.Info.Policies.Xml();
    }

    /**
     * Create an instance of {@link GetDocumentMetadata }
     * 
     */
    public GetDocumentMetadata createGetDocumentMetadata() {
        return new GetDocumentMetadata();
    }

    /**
     * Create an instance of {@link Upload.Arg0 .Metadata.Attributes }
     * 
     */
    public Upload.Arg0 .Metadata.Attributes createUploadArg0MetadataAttributes() {
        return new Upload.Arg0 .Metadata.Attributes();
    }

    /**
     * Create an instance of {@link Search.Arg0 .Document.Attributes.Attribute }
     * 
     */
    public Search.Arg0 .Document.Attributes.Attribute createSearchArg0DocumentAttributesAttribute() {
        return new Search.Arg0 .Document.Attributes.Attribute();
    }

    /**
     * Create an instance of {@link GetDocumentResponse.Return.Metadata.Attributes.Attribute }
     * 
     */
    public GetDocumentResponse.Return.Metadata.Attributes.Attribute createGetDocumentResponseReturnMetadataAttributesAttribute() {
        return new GetDocumentResponse.Return.Metadata.Attributes.Attribute();
    }

    /**
     * Create an instance of {@link odin.odin.ws.jaxws.Document.Metadata.Keywords }
     * 
     */
    public odin.odin.ws.jaxws.Document.Metadata.Keywords createDocumentMetadataKeywords() {
        return new odin.odin.ws.jaxws.Document.Metadata.Keywords();
    }

    /**
     * Create an instance of {@link GetDocumentMetadataResponse.Return.Metadata }
     * 
     */
    public GetDocumentMetadataResponse.Return.Metadata createGetDocumentMetadataResponseReturnMetadata() {
        return new GetDocumentMetadataResponse.Return.Metadata();
    }

    /**
     * Create an instance of {@link BasicSearchResponse.Return.Document.Attributes }
     * 
     */
    public BasicSearchResponse.Return.Document.Attributes createBasicSearchResponseReturnDocumentAttributes() {
        return new BasicSearchResponse.Return.Document.Attributes();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link GetDocument }
     * 
     */
    public GetDocument createGetDocument() {
        return new GetDocument();
    }

    /**
     * Create an instance of {@link odin.odin.ws.jaxws.Document }
     * 
     */
    public odin.odin.ws.jaxws.Document createDocument() {
        return new odin.odin.ws.jaxws.Document();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return }
     * 
     */
    public GetServerInfoResponse.Return createGetServerInfoResponseReturn() {
        return new GetServerInfoResponse.Return();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return.Appendix }
     * 
     */
    public GetServerInfoResponse.Return.Appendix createGetServerInfoResponseReturnAppendix() {
        return new GetServerInfoResponse.Return.Appendix();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return.Appendix.Trust.Alternatives }
     * 
     */
    public GetServerInfoResponse.Return.Appendix.Trust.Alternatives createGetServerInfoResponseReturnAppendixTrustAlternatives() {
        return new GetServerInfoResponse.Return.Appendix.Trust.Alternatives();
    }

    /**
     * Create an instance of {@link Upload.Arg0 .Metadata }
     * 
     */
    public Upload.Arg0 .Metadata createUploadArg0Metadata() {
        return new Upload.Arg0 .Metadata();
    }

    /**
     * Create an instance of {@link Response.Appendix.Info.Subjects }
     * 
     */
    public Response.Appendix.Info.Subjects createResponseAppendixInfoSubjects() {
        return new Response.Appendix.Info.Subjects();
    }

    /**
     * Create an instance of {@link UploadResponse.Return.Appendix.Info.Policies.Zip }
     * 
     */
    public UploadResponse.Return.Appendix.Info.Policies.Zip createUploadResponseReturnAppendixInfoPoliciesZip() {
        return new UploadResponse.Return.Appendix.Info.Policies.Zip();
    }

    /**
     * Create an instance of {@link Search.Arg0 .Document }
     * 
     */
    public Search.Arg0 .Document createSearchArg0Document() {
        return new Search.Arg0 .Document();
    }

    /**
     * Create an instance of {@link UploadResponse.Return.Status }
     * 
     */
    public UploadResponse.Return.Status createUploadResponseReturnStatus() {
        return new UploadResponse.Return.Status();
    }

    /**
     * Create an instance of {@link Upload.Arg0 }
     * 
     */
    public Upload.Arg0 createUploadArg0() {
        return new Upload.Arg0();
    }

    /**
     * Create an instance of {@link UploadResponse.Return.Appendix.Trust }
     * 
     */
    public UploadResponse.Return.Appendix.Trust createUploadResponseReturnAppendixTrust() {
        return new UploadResponse.Return.Appendix.Trust();
    }

    /**
     * Create an instance of {@link Search.Arg0 .Document.Attributes }
     * 
     */
    public Search.Arg0 .Document.Attributes createSearchArg0DocumentAttributes() {
        return new Search.Arg0 .Document.Attributes();
    }

    /**
     * Create an instance of {@link Response.Appendix.Info.Policies.Trust }
     * 
     */
    public Response.Appendix.Info.Policies.Trust createResponseAppendixInfoPoliciesTrust() {
        return new Response.Appendix.Info.Policies.Trust();
    }

    /**
     * Create an instance of {@link BasicSearch }
     * 
     */
    public BasicSearch createBasicSearch() {
        return new BasicSearch();
    }

    /**
     * Create an instance of {@link BasicSearchResponse.Return }
     * 
     */
    public BasicSearchResponse.Return createBasicSearchResponseReturn() {
        return new BasicSearchResponse.Return();
    }

    /**
     * Create an instance of {@link UploadResponse.Return.Appendix.Trust.Alternatives }
     * 
     */
    public UploadResponse.Return.Appendix.Trust.Alternatives createUploadResponseReturnAppendixTrustAlternatives() {
        return new UploadResponse.Return.Appendix.Trust.Alternatives();
    }

    /**
     * Create an instance of {@link GetDocumentResponse.Return.Metadata.Attributes }
     * 
     */
    public GetDocumentResponse.Return.Metadata.Attributes createGetDocumentResponseReturnMetadataAttributes() {
        return new GetDocumentResponse.Return.Metadata.Attributes();
    }

    /**
     * Create an instance of {@link Upload.Arg0 .Metadata.Attributes.Attribute }
     * 
     */
    public Upload.Arg0 .Metadata.Attributes.Attribute createUploadArg0MetadataAttributesAttribute() {
        return new Upload.Arg0 .Metadata.Attributes.Attribute();
    }

    /**
     * Create an instance of {@link Search.Arg0 .Document.Locale }
     * 
     */
    public Search.Arg0 .Document.Locale createSearchArg0DocumentLocale() {
        return new Search.Arg0 .Document.Locale();
    }

    /**
     * Create an instance of {@link BasicSearchResponse.Return.Document.Author }
     * 
     */
    public BasicSearchResponse.Return.Document.Author createBasicSearchResponseReturnDocumentAuthor() {
        return new BasicSearchResponse.Return.Document.Author();
    }

    /**
     * Create an instance of {@link UploadResponse.Return }
     * 
     */
    public UploadResponse.Return createUploadResponseReturn() {
        return new UploadResponse.Return();
    }

    /**
     * Create an instance of {@link GetDocumentMetadataResponse.Return.Metadata.Attributes }
     * 
     */
    public GetDocumentMetadataResponse.Return.Metadata.Attributes createGetDocumentMetadataResponseReturnMetadataAttributes() {
        return new GetDocumentMetadataResponse.Return.Metadata.Attributes();
    }

    /**
     * Create an instance of {@link Basic }
     * 
     */
    public Basic createBasic() {
        return new Basic();
    }

    /**
     * Create an instance of {@link GetServerInfo }
     * 
     */
    public GetServerInfo createGetServerInfo() {
        return new GetServerInfo();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return.Appendix.Info.Policies }
     * 
     */
    public GetServerInfoResponse.Return.Appendix.Info.Policies createGetServerInfoResponseReturnAppendixInfoPolicies() {
        return new GetServerInfoResponse.Return.Appendix.Info.Policies();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link UploadResponse.Return.Appendix.Info.Subjects }
     * 
     */
    public UploadResponse.Return.Appendix.Info.Subjects createUploadResponseReturnAppendixInfoSubjects() {
        return new UploadResponse.Return.Appendix.Info.Subjects();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse }
     * 
     */
    public GetServerInfoResponse createGetServerInfoResponse() {
        return new GetServerInfoResponse();
    }

    /**
     * Create an instance of {@link Response.Status }
     * 
     */
    public Response.Status createResponseStatus() {
        return new Response.Status();
    }

    /**
     * Create an instance of {@link GetDocumentResponse.Return.Metadata }
     * 
     */
    public GetDocumentResponse.Return.Metadata createGetDocumentResponseReturnMetadata() {
        return new GetDocumentResponse.Return.Metadata();
    }

    /**
     * Create an instance of {@link Response.Appendix.Info.Policies.Zip }
     * 
     */
    public Response.Appendix.Info.Policies.Zip createResponseAppendixInfoPoliciesZip() {
        return new Response.Appendix.Info.Policies.Zip();
    }

    /**
     * Create an instance of {@link Basic.Document.Words }
     * 
     */
    public Basic.Document.Words createBasicDocumentWords() {
        return new Basic.Document.Words();
    }

    /**
     * Create an instance of {@link BasicSearchResponse.Return.Document }
     * 
     */
    public BasicSearchResponse.Return.Document createBasicSearchResponseReturnDocument() {
        return new BasicSearchResponse.Return.Document();
    }

    /**
     * Create an instance of {@link SearchResponse.Return.Document.Keywords }
     * 
     */
    public SearchResponse.Return.Document.Keywords createSearchResponseReturnDocumentKeywords() {
        return new SearchResponse.Return.Document.Keywords();
    }

    /**
     * Create an instance of {@link odin.odin.ws.jaxws.Document.Metadata.Attributes.Attribute }
     * 
     */
    public odin.odin.ws.jaxws.Document.Metadata.Attributes.Attribute createDocumentMetadataAttributesAttribute() {
        return new odin.odin.ws.jaxws.Document.Metadata.Attributes.Attribute();
    }

    /**
     * Create an instance of {@link Response.Appendix.Info }
     * 
     */
    public Response.Appendix.Info createResponseAppendixInfo() {
        return new Response.Appendix.Info();
    }

    /**
     * Create an instance of {@link Response.Appendix.Info.Policies }
     * 
     */
    public Response.Appendix.Info.Policies createResponseAppendixInfoPolicies() {
        return new Response.Appendix.Info.Policies();
    }

    /**
     * Create an instance of {@link Results.Document.Attributes }
     * 
     */
    public Results.Document.Attributes createResultsDocumentAttributes() {
        return new Results.Document.Attributes();
    }

    /**
     * Create an instance of {@link SearchResponse.Return.Document.Locale }
     * 
     */
    public SearchResponse.Return.Document.Locale createSearchResponseReturnDocumentLocale() {
        return new SearchResponse.Return.Document.Locale();
    }

    /**
     * Create an instance of {@link BasicSearchResponse.Return.Document.Attributes.Attribute }
     * 
     */
    public BasicSearchResponse.Return.Document.Attributes.Attribute createBasicSearchResponseReturnDocumentAttributesAttribute() {
        return new BasicSearchResponse.Return.Document.Attributes.Attribute();
    }

    /**
     * Create an instance of {@link Response.Appendix.Trust.Alternatives }
     * 
     */
    public Response.Appendix.Trust.Alternatives createResponseAppendixTrustAlternatives() {
        return new Response.Appendix.Trust.Alternatives();
    }

    /**
     * Create an instance of {@link BasicSearchResponse }
     * 
     */
    public BasicSearchResponse createBasicSearchResponse() {
        return new BasicSearchResponse();
    }

    /**
     * Create an instance of {@link Upload.Arg0 .Metadata.Author }
     * 
     */
    public Upload.Arg0 .Metadata.Author createUploadArg0MetadataAuthor() {
        return new Upload.Arg0 .Metadata.Author();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return.Status }
     * 
     */
    public GetServerInfoResponse.Return.Status createGetServerInfoResponseReturnStatus() {
        return new GetServerInfoResponse.Return.Status();
    }

    /**
     * Create an instance of {@link Basic.Document }
     * 
     */
    public Basic.Document createBasicDocument() {
        return new Basic.Document();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return.Appendix.Info.Policies.Xml }
     * 
     */
    public GetServerInfoResponse.Return.Appendix.Info.Policies.Xml createGetServerInfoResponseReturnAppendixInfoPoliciesXml() {
        return new GetServerInfoResponse.Return.Appendix.Info.Policies.Xml();
    }

    /**
     * Create an instance of {@link Results.Document }
     * 
     */
    public Results.Document createResultsDocument() {
        return new Results.Document();
    }

    /**
     * Create an instance of {@link SearchResponse.Return }
     * 
     */
    public SearchResponse.Return createSearchResponseReturn() {
        return new SearchResponse.Return();
    }

    /**
     * Create an instance of {@link BasicSearchResponse.Return.Document.Keywords }
     * 
     */
    public BasicSearchResponse.Return.Document.Keywords createBasicSearchResponseReturnDocumentKeywords() {
        return new BasicSearchResponse.Return.Document.Keywords();
    }

    /**
     * Create an instance of {@link GetDocumentMetadataResponse.Return.Metadata.Author }
     * 
     */
    public GetDocumentMetadataResponse.Return.Metadata.Author createGetDocumentMetadataResponseReturnMetadataAuthor() {
        return new GetDocumentMetadataResponse.Return.Metadata.Author();
    }

    /**
     * Create an instance of {@link GetDocumentResponse.Return.Metadata.Locale }
     * 
     */
    public GetDocumentResponse.Return.Metadata.Locale createGetDocumentResponseReturnMetadataLocale() {
        return new GetDocumentResponse.Return.Metadata.Locale();
    }

    /**
     * Create an instance of {@link odin.odin.ws.jaxws.Document.Metadata }
     * 
     */
    public odin.odin.ws.jaxws.Document.Metadata createDocumentMetadata() {
        return new odin.odin.ws.jaxws.Document.Metadata();
    }

    /**
     * Create an instance of {@link GetZipPolicy }
     * 
     */
    public GetZipPolicy createGetZipPolicy() {
        return new GetZipPolicy();
    }

    /**
     * Create an instance of {@link BasicSearch.Arg0 }
     * 
     */
    public BasicSearch.Arg0 createBasicSearchArg0() {
        return new BasicSearch.Arg0();
    }

    /**
     * Create an instance of {@link Results.Document.Locale }
     * 
     */
    public Results.Document.Locale createResultsDocumentLocale() {
        return new Results.Document.Locale();
    }

    /**
     * Create an instance of {@link Upload.Arg0 .Metadata.Keywords }
     * 
     */
    public Upload.Arg0 .Metadata.Keywords createUploadArg0MetadataKeywords() {
        return new Upload.Arg0 .Metadata.Keywords();
    }

    /**
     * Create an instance of {@link UploadResponse.Return.Appendix.Info }
     * 
     */
    public UploadResponse.Return.Appendix.Info createUploadResponseReturnAppendixInfo() {
        return new UploadResponse.Return.Appendix.Info();
    }

    /**
     * Create an instance of {@link GetXmlPolicyResponse }
     * 
     */
    public GetXmlPolicyResponse createGetXmlPolicyResponse() {
        return new GetXmlPolicyResponse();
    }

    /**
     * Create an instance of {@link BasicSearch.Arg0 .Document.Words }
     * 
     */
    public BasicSearch.Arg0 .Document.Words createBasicSearchArg0DocumentWords() {
        return new BasicSearch.Arg0 .Document.Words();
    }

    /**
     * Create an instance of {@link UploadResponse.Return.Appendix.Info.Policies.Trust }
     * 
     */
    public UploadResponse.Return.Appendix.Info.Policies.Trust createUploadResponseReturnAppendixInfoPoliciesTrust() {
        return new UploadResponse.Return.Appendix.Info.Policies.Trust();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link Upload.Arg0 .Metadata.Locale }
     * 
     */
    public Upload.Arg0 .Metadata.Locale createUploadArg0MetadataLocale() {
        return new Upload.Arg0 .Metadata.Locale();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link GetZipPolicyResponse }
     * 
     */
    public GetZipPolicyResponse createGetZipPolicyResponse() {
        return new GetZipPolicyResponse();
    }

    /**
     * Create an instance of {@link GetXmlPolicy }
     * 
     */
    public GetXmlPolicy createGetXmlPolicy() {
        return new GetXmlPolicy();
    }

    /**
     * Create an instance of {@link SearchResponse.Return.Document.Attributes }
     * 
     */
    public SearchResponse.Return.Document.Attributes createSearchResponseReturnDocumentAttributes() {
        return new SearchResponse.Return.Document.Attributes();
    }

    /**
     * Create an instance of {@link GetServerInfoResponse.Return.Appendix.Trust }
     * 
     */
    public GetServerInfoResponse.Return.Appendix.Trust createGetServerInfoResponseReturnAppendixTrust() {
        return new GetServerInfoResponse.Return.Appendix.Trust();
    }

    /**
     * Create an instance of {@link GetDocumentResponse }
     * 
     */
    public GetDocumentResponse createGetDocumentResponse() {
        return new GetDocumentResponse();
    }

    /**
     * Create an instance of {@link Search.Arg0 .Document.Added }
     * 
     */
    public Search.Arg0 .Document.Added createSearchArg0DocumentAdded() {
        return new Search.Arg0 .Document.Added();
    }

    /**
     * Create an instance of {@link GetDocumentMetadataResponse.Return.Metadata.Keywords }
     * 
     */
    public GetDocumentMetadataResponse.Return.Metadata.Keywords createGetDocumentMetadataResponseReturnMetadataKeywords() {
        return new GetDocumentMetadataResponse.Return.Metadata.Keywords();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "basicSearch")
    public JAXBElement<BasicSearch> createBasicSearch(BasicSearch value) {
        return new JAXBElement<BasicSearch>(_BasicSearch_QNAME, BasicSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getDocumentMetadataResponse")
    public JAXBElement<GetDocumentMetadataResponse> createGetDocumentMetadataResponse(GetDocumentMetadataResponse value) {
        return new JAXBElement<GetDocumentMetadataResponse>(_GetDocumentMetadataResponse_QNAME, GetDocumentMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "uploadResponse")
    public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
        return new JAXBElement<UploadResponse>(_UploadResponse_QNAME, UploadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZipPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getZipPolicyResponse")
    public JAXBElement<GetZipPolicyResponse> createGetZipPolicyResponse(GetZipPolicyResponse value) {
        return new JAXBElement<GetZipPolicyResponse>(_GetZipPolicyResponse_QNAME, GetZipPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getServerInfoResponse")
    public JAXBElement<GetServerInfoResponse> createGetServerInfoResponse(GetServerInfoResponse value) {
        return new JAXBElement<GetServerInfoResponse>(_GetServerInfoResponse_QNAME, GetServerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getDocumentMetadata")
    public JAXBElement<GetDocumentMetadata> createGetDocumentMetadata(GetDocumentMetadata value) {
        return new JAXBElement<GetDocumentMetadata>(_GetDocumentMetadata_QNAME, GetDocumentMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "search")
    public JAXBElement<Object> createSearch(Object value) {
        return new JAXBElement<Object>(_Search_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBarcodeUrl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getBarcodeUrl")
    public JAXBElement<GetBarcodeUrl> createGetBarcodeUrl(GetBarcodeUrl value) {
        return new JAXBElement<GetBarcodeUrl>(_GetBarcodeUrl_QNAME, GetBarcodeUrl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "basicSearchResponse")
    public JAXBElement<BasicSearchResponse> createBasicSearchResponse(BasicSearchResponse value) {
        return new JAXBElement<BasicSearchResponse>(_BasicSearchResponse_QNAME, BasicSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "upload")
    public JAXBElement<Upload> createUpload(Upload value) {
        return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXmlPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getXmlPolicy")
    public JAXBElement<GetXmlPolicy> createGetXmlPolicy(GetXmlPolicy value) {
        return new JAXBElement<GetXmlPolicy>(_GetXmlPolicy_QNAME, GetXmlPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getDocument")
    public JAXBElement<GetDocument> createGetDocument(GetDocument value) {
        return new JAXBElement<GetDocument>(_GetDocument_QNAME, GetDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getServerInfo")
    public JAXBElement<GetServerInfo> createGetServerInfo(GetServerInfo value) {
        return new JAXBElement<GetServerInfo>(_GetServerInfo_QNAME, GetServerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXmlPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getXmlPolicyResponse")
    public JAXBElement<GetXmlPolicyResponse> createGetXmlPolicyResponse(GetXmlPolicyResponse value) {
        return new JAXBElement<GetXmlPolicyResponse>(_GetXmlPolicyResponse_QNAME, GetXmlPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBarcodeUrlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getBarcodeUrlResponse")
    public JAXBElement<GetBarcodeUrlResponse> createGetBarcodeUrlResponse(GetBarcodeUrlResponse value) {
        return new JAXBElement<GetBarcodeUrlResponse>(_GetBarcodeUrlResponse_QNAME, GetBarcodeUrlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZipPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getZipPolicy")
    public JAXBElement<GetZipPolicy> createGetZipPolicy(GetZipPolicy value) {
        return new JAXBElement<GetZipPolicy>(_GetZipPolicy_QNAME, GetZipPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sites.google.com/site/printmiles/Odin", name = "getDocumentResponse")
    public JAXBElement<GetDocumentResponse> createGetDocumentResponse(GetDocumentResponse value) {
        return new JAXBElement<GetDocumentResponse>(_GetDocumentResponse_QNAME, GetDocumentResponse.class, null, value);
    }

}
