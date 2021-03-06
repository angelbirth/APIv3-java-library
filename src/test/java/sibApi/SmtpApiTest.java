/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibApi;

import sendinblue.ApiException;
import sibModel.CreateModel;
import sibModel.CreateSmtpEmail;
import sibModel.CreateSmtpTemplate;
import sibModel.DeleteHardbounces;
import sibModel.ErrorModel;
import sibModel.GetAggregatedReport;
import sibModel.GetEmailEventReport;
import sibModel.GetReports;
import sibModel.GetSmtpTemplateOverview;
import sibModel.GetSmtpTemplates;
import org.threeten.bp.LocalDate;
import sibModel.PostSendFailed;
import sibModel.SendEmail;
import sibModel.SendSmtpEmail;
import sibModel.SendTemplateEmail;
import sibModel.SendTestEmail;
import sibModel.UpdateSmtpTemplate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SmtpApi
 */
@Ignore
public class SmtpApiTest {

    private final SmtpApi api = new SmtpApi();

    
    /**
     * Create an smtp template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSmtpTemplateTest() throws ApiException {
        CreateSmtpTemplate smtpTemplate = null;
        CreateModel response = api.createSmtpTemplate(smtpTemplate);

        // TODO: test validations
    }
    
    /**
     * Delete hardbounces
     *
     * Delete hardbounces. To use carefully (e.g. in case of temporary ISP failures)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHardbouncesTest() throws ApiException {
        DeleteHardbounces deleteHardbounces = null;
        api.deleteHardbounces(deleteHardbounces);

        // TODO: test validations
    }
    
    /**
     * Delete an inactive smtp template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSmtpTemplateTest() throws ApiException {
        Long templateId = null;
        api.deleteSmtpTemplate(templateId);

        // TODO: test validations
    }
    
    /**
     * Get your SMTP activity aggregated over a period of time
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregatedSmtpReportTest() throws ApiException {
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer days = null;
        String tag = null;
        GetAggregatedReport response = api.getAggregatedSmtpReport(startDate, endDate, days, tag);

        // TODO: test validations
    }
    
    /**
     * Get all your SMTP activity (unaggregated events)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailEventReportTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer days = null;
        String email = null;
        String event = null;
        String tags = null;
        String messageId = null;
        Long templateId = null;
        GetEmailEventReport response = api.getEmailEventReport(limit, offset, startDate, endDate, days, email, event, tags, messageId, templateId);

        // TODO: test validations
    }
    
    /**
     * Get your SMTP activity aggregated per day
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmtpReportTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        Integer days = null;
        String tag = null;
        GetReports response = api.getSmtpReport(limit, offset, startDate, endDate, days, tag);

        // TODO: test validations
    }
    
    /**
     * Returns the template informations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmtpTemplateTest() throws ApiException {
        Long templateId = null;
        GetSmtpTemplateOverview response = api.getSmtpTemplate(templateId);

        // TODO: test validations
    }
    
    /**
     * Get the list of SMTP templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmtpTemplatesTest() throws ApiException {
        Boolean templateStatus = null;
        Long limit = null;
        Long offset = null;
        GetSmtpTemplates response = api.getSmtpTemplates(templateStatus, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Send a template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTemplateTest() throws ApiException {
        Long templateId = null;
        SendEmail sendEmail = null;
        SendTemplateEmail response = api.sendTemplate(templateId, sendEmail);

        // TODO: test validations
    }
    
    /**
     * Send a template to your test list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTestTemplateTest() throws ApiException {
        Long templateId = null;
        SendTestEmail sendTestEmail = null;
        api.sendTestTemplate(templateId, sendTestEmail);

        // TODO: test validations
    }
    
    /**
     * Send a transactional email
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTransacEmailTest() throws ApiException {
        SendSmtpEmail sendSmtpEmail = null;
        CreateSmtpEmail response = api.sendTransacEmail(sendSmtpEmail);

        // TODO: test validations
    }
    
    /**
     * Updates an smtp templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSmtpTemplateTest() throws ApiException {
        Long templateId = null;
        UpdateSmtpTemplate smtpTemplate = null;
        api.updateSmtpTemplate(templateId, smtpTemplate);

        // TODO: test validations
    }
    
}
