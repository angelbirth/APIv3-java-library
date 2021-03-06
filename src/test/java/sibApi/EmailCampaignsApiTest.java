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
import sibModel.CreateEmailCampaign;
import sibModel.CreateModel;
import sibModel.CreatedProcessId;
import sibModel.EmailExportRecipients;
import sibModel.ErrorModel;
import sibModel.GetEmailCampaign;
import sibModel.GetEmailCampaigns;
import sibModel.PostSendFailed;
import sibModel.SendReport;
import sibModel.SendTestEmail;
import sibModel.UpdateCampaignStatus;
import sibModel.UpdateEmailCampaign;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailCampaignsApi
 */
@Ignore
public class EmailCampaignsApiTest {

    private final EmailCampaignsApi api = new EmailCampaignsApi();

    
    /**
     * Create an email campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEmailCampaignTest() throws ApiException {
        CreateEmailCampaign emailCampaigns = null;
        CreateModel response = api.createEmailCampaign(emailCampaigns);

        // TODO: test validations
    }
    
    /**
     * Delete an email campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEmailCampaignTest() throws ApiException {
        Long campaignId = null;
        api.deleteEmailCampaign(campaignId);

        // TODO: test validations
    }
    
    /**
     * Export the recipients of a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailExportRecipientsTest() throws ApiException {
        Long campaignId = null;
        EmailExportRecipients recipientExport = null;
        CreatedProcessId response = api.emailExportRecipients(campaignId, recipientExport);

        // TODO: test validations
    }
    
    /**
     * Get campaign informations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailCampaignTest() throws ApiException {
        Long campaignId = null;
        GetEmailCampaign response = api.getEmailCampaign(campaignId);

        // TODO: test validations
    }
    
    /**
     * Return all your created campaigns
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailCampaignsTest() throws ApiException {
        String type = null;
        String status = null;
        Long limit = null;
        Long offset = null;
        GetEmailCampaigns response = api.getEmailCampaigns(type, status, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Send an email campaign id of the campaign immediately
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendEmailCampaignNowTest() throws ApiException {
        Long campaignId = null;
        api.sendEmailCampaignNow(campaignId);

        // TODO: test validations
    }
    
    /**
     * Send the report of a campaigns
     *
     * A PDF will be sent to the specified email addresses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendReportTest() throws ApiException {
        Long campaignId = null;
        SendReport sendReport = null;
        api.sendReport(campaignId, sendReport);

        // TODO: test validations
    }
    
    /**
     * Send an email campaign to your test list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendTestEmailTest() throws ApiException {
        Long campaignId = null;
        SendTestEmail emailTo = null;
        api.sendTestEmail(campaignId, emailTo);

        // TODO: test validations
    }
    
    /**
     * Update a campaign status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCampaignStatusTest() throws ApiException {
        Long campaignId = null;
        UpdateCampaignStatus status = null;
        api.updateCampaignStatus(campaignId, status);

        // TODO: test validations
    }
    
    /**
     * Update a campaign
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEmailCampaignTest() throws ApiException {
        Long campaignId = null;
        UpdateEmailCampaign emailCampaign = null;
        api.updateEmailCampaign(campaignId, emailCampaign);

        // TODO: test validations
    }
    
}
