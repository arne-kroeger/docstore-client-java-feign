package dev.docstore.documentation.api;

import dev.docstore.documentation.ApiClient;
import dev.docstore.documentation.EncodingUtils;

import dev.docstore.documentation.api.model.BadRequest;
import dev.docstore.documentation.api.model.Document;
import dev.docstore.documentation.api.model.TemplateData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-26T07:23:34.176+02:00[Europe/Berlin]")
public interface DocumentApi extends ApiClient.Api {


  /**
   * adds a new document
   * 
   * @param document  (required)
   * @return Document
   */
  @RequestLine("POST /document")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Document addNewDocument(Document document);

  /**
   * adds a new document by template
   * 
   * @param templateUuid  (required)
   * @param templateData  (required)
   * @return Document
   */
  @RequestLine("POST /document/template/{templateUuid}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Document addNewDocumentForTemplate(@Param("templateUuid") String templateUuid, TemplateData templateData);

  /**
   * get latest updated documents
   * 
   * @param uuid  (required)
   * @param env  (required)
   * @return Document
   */
  @RequestLine("GET /document/{uuid}/{env}")
  @Headers({
    "Accept: application/json",
  })
  Document getDocument(@Param("uuid") String uuid, @Param("env") String env);

  /**
   * get latest updated documents
   * 
   * @return List&lt;Document&gt;
   */
  @RequestLine("GET /document")
  @Headers({
    "Accept: application/json",
  })
  List<Document> getLatestDocuments();

  /**
   * search for documents
   * 
   * @param body  (required)
   * @return List&lt;Document&gt;
   */
  @RequestLine("POST /document/search")
  @Headers({
    "Content-Type: text/plain",
    "Accept: application/json",
  })
  List<Document> searchDocuments(String body);
}
