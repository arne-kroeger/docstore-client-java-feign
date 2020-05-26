package dev.docstore.documentation.api;

import dev.docstore.documentation.ApiClient;
import dev.docstore.documentation.api.model.BadRequest;
import dev.docstore.documentation.api.model.Document;
import dev.docstore.documentation.api.model.TemplateData;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentApi
 */
public class DocumentApiTest {

    private DocumentApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(DocumentApi.class);
    }

    
    /**
     * adds a new document
     *
     * 
     */
    @Test
    public void addNewDocumentTest() {
        Document document = null;
        // Document response = api.addNewDocument(document);

        // TODO: test validations
    }

    
    /**
     * adds a new document by template
     *
     * 
     */
    @Test
    public void addNewDocumentForTemplateTest() {
        String templateUuid = null;
        TemplateData templateData = null;
        // Document response = api.addNewDocumentForTemplate(templateUuid, templateData);

        // TODO: test validations
    }

    
    /**
     * get latest updated documents
     *
     * 
     */
    @Test
    public void getDocumentTest() {
        String uuid = null;
        String env = null;
        // Document response = api.getDocument(uuid, env);

        // TODO: test validations
    }

    
    /**
     * get latest updated documents
     *
     * 
     */
    @Test
    public void getLatestDocumentsTest() {
        // List<Document> response = api.getLatestDocuments();

        // TODO: test validations
    }

    
    /**
     * search for documents
     *
     * 
     */
    @Test
    public void searchDocumentsTest() {
        String body = null;
        // List<Document> response = api.searchDocuments(body);

        // TODO: test validations
    }

    
}
