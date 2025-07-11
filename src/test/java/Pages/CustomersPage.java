package Pages;

import com.github.javafaker.Faker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import javax.swing.text.html.CSS;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import static Config.Setup.driver;

public class CustomersPage {
    public CustomersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "LoadCustomer1")
    WebElement customersNav;
    @FindBy(tagName = "h2")
    WebElement title;
    @FindBy(id = "txtSearchBox")
    WebElement searchBox;
    @FindBy(xpath = "//a[contains(@class, 'green_button') and (@title='New Customer')]")
    WebElement btnNewCustomer;
    @FindBy(className = "_GArn")
    WebElement datefilter;
    @FindBy(id = "FilterBranch")
    WebElement branchFilter;
    @FindBy(id = "StatusList")
    WebElement statusFilter;
    @FindBy(id = "SalesRep33")
    WebElement salesRepFilter;
    @FindBy(className = "ahs_header")
    List<WebElement> customerinfoHeader;
    @FindBy(id = "qualify-tab")
    WebElement tabQualify;
    @FindBy(id = "btnClear")
    WebElement btnClear;
    @FindBy(className = "labelApplicationForm")
    List<WebElement> fieldLabel;
    @FindBy(className = "sub-content")
    List<WebElement> countHeader;
    @FindBy(id = "btnVerifyHO")
    WebElement btnVerifyHOME;
    @FindBy(id = "RunSoftCreditCheck")
    WebElement btnRunCredit;
    @FindBy(className = "float-right")
    WebElement copyAddress;
    @FindBy(xpath = "//button[contains(@class,'red_button') and (text()='Delete CoApp')]")
    WebElement btnDeleteCoApp;
    @FindBy(xpath = "//button[contains(@class,'green_button') and (text()='Make Primary')]")
    WebElement btnMakePrimary;
    @FindBy(id = "RunCoApplicantSoftCreditCheck")
    WebElement btnRunCoAppCredit;
    @FindBy(id = "FirstName")
    WebElement txtPrimaryFirstName;
    @FindBy(id = "MiddleInitial")
    WebElement txtPriMidName;
    @FindBy(id = "LastName")
    WebElement txtPriLastName;
    @FindBy(id = "Address")
    WebElement txtPrimaryAddress;
    @FindBy(xpath = "//button[contains(@class,'green_button') and (text()='Next Step')]")
    List<WebElement> btnNextStep;
    @FindBy(className = "error-body")
    List<WebElement> errorbody;
    @FindBy(xpath = "//button[contains(@class,'btn-default') and (text()='Close')]")
    List<WebElement> btnPopUpCloseXpath;
    @FindBy(id = "PostalCode")
    WebElement txtPrimaryZip;
    @FindBy(id = "City")
    WebElement txtPrimaryCity;
    @FindBy(id = "State")
    WebElement txtPrimaryState;
    @FindBy(id = "DateOfBirth")
    WebElement txtPrimaryDOB;
    @FindBy(id = "SocialSecurityNumber")
    WebElement txtPrimarySSN;
    @FindBy(className = "modal-content")
    List<WebElement> popup;
    @FindBy(className = "message_header_title")
    List<WebElement> popupHeader;
    @FindBy(className = "cus-body")
    List<WebElement> popupMsg;
    @FindBy(id = "__ConfirmationMessageModal_")
    List<WebElement> btnPopupClose;
    @FindBy(id = "HomePhone")
    WebElement primaryCellPhone;
    @FindBy(id = "CellPhone")
    WebElement primarySecondaryPhone;
    @FindBy(id = "EmailAddress")
    WebElement primaryEmailAddress;
    @FindBy(css = ".btn.btn-no.red_button")
    List<WebElement> btnNoPopUp;
    @FindBy(css = ".btn.btn-green.green_button")
    List<WebElement> btnYesPopUp;
    @FindBy(className = "close_btn_size")
    List<WebElement> btnCloseScreen;
    @FindBy(id = "SalesRep")
    WebElement dropdownSalesRep;
    @FindBy(id = "FinanceCompanyId")
    WebElement dropdownFinanceCompany;
    @FindBy(className = "editCustomerCustomerDetailsHeader")
    WebElement btnEditCusInfo;
    @FindBy(id = "CoreHomeCoApplicant_FirstName")
    WebElement txtCOappFname;
    @FindBy(id = "CoreHomeCoApplicant_MiddleInitial")
    WebElement txtCOappMname;
    @FindBy(id = "CoreHomeCoApplicant_LastName")
    WebElement txtCOappLname;
    @FindBy(id = "CoreHomeCoApplicant_Street")
    WebElement txtCOAddress;
    @FindBy(id = "CoreHomeCoApplicant_ZipCode")
    WebElement txtCOappZip;
    @FindBy(id = "CoreHomeCoApplicant_City")
    WebElement txtCOappCity;
    @FindBy(id = "CoreHomeCoApplicant_State")
    WebElement txtCOappState;
    @FindBy(id = "DateOfBirthCoApplicant")
    WebElement txtCOappDoB;
    @FindBy(id = "CoreHomeCoApplicant_SSN")
    WebElement txtCOappSSN;
    @FindBy(id = "CoreHomeCoApplicant_HomePhone")
    WebElement txtCOappCellPhn;
    @FindBy(id = "CoreHomeCoApplicant_CellPhone")
    WebElement txtCOappSecondPhone;
    @FindBy(id = "CoreHomeCoApplicant_EmailAddress")
    WebElement txtCOappEmail;
    @FindBy(id = "chkCopyAddress")
    WebElement chckCopyAddress;
    @FindBy(css = ".tt-suggestion")
    List<WebElement> suggestions;
    @FindBy(className = "ahs_heade_middle")
    List<WebElement> pageHeader;
    @FindBy(id = "proposal-tab")
    WebElement tabProposal;
    @FindBy(className = "accordion-button")
    List<WebElement> subHeader;
    @FindBy(id = "contractLength")
    WebElement txtContractLength;
    @FindBy(id = "deffMonth")
    WebElement txtDefferedMonth;
    @FindBy(className = "TotalMonthlyVal")
    WebElement txtTotalMonthly;
    @FindBy(className = "fa-search")
    WebElement btnSearchIcon;
    @FindBy(className = "SubtotalVal")
    WebElement MonthlyFinancingAmount;
    @FindBy(className = "SubtotalValService")
    WebElement MonthlyMonitoringAmount;
    @FindBy(className = "TotalMonthlyPayment")
    WebElement monthlyPayment;
    @FindBy(className = "InvoiceSaveButton")
    WebElement proposalNextStep;
    @FindBy(className = "txtProductRate")
    List<WebElement> productMonthlyRate;
    @FindBy(id = "Delete")
    List<WebElement> productDelete;
    @FindBy(xpath = "//table[(@id='CustomerEstimateTab')]//tr/td[(@valign='top')][2]")
    List<WebElement> proposalProdctName1;
    @FindBy(className = "ProductName")
    List<WebElement> proposalProdctName2;
    @FindBy(className = "txtServiceRate")
    List<WebElement> serviceMonthlyRate;
    @FindBy(xpath = "//tr[(@class='SubTotalTr')]/td")
    List<WebElement> activationFeeLabel;
    @FindBy(id = "ActivInstFee")
    WebElement activationFee;
    @FindBy(id = "equipment_add_row")
    WebElement btnAddEquipment;
    @FindBy(id = "service_add_row")
    WebElement btnAddService;
    @FindBy(className = "PresentBtn")
    WebElement btnGeneratePresentation;
    @FindBy(id = "presentation_view")
    WebElement btnViewPresentation;
    @FindBy(id = "presentation_link_copy")
    WebElement btnCopyPresentation;
    @FindBy(id = "btnSendMail_presentation")
    WebElement btnSendPresentationEmail;
    @FindBy(id = "btnSendSMS_presentation")
    WebElement btnSendPresentationText;
    @FindBy(id = "btnSendMailAndSMS_presentation")
    WebElement btnSendPresentationBoth;
    @FindBy(id = "EmailAddress_presentation")
    WebElement txtPresentionMailField;
    @FindBy(id = "Phone_no_presentation")
    WebElement txtPresentionTextField;
    @FindBy(className = "ticket_agree_inner_info_block_header")
    List<WebElement> signaturePadLabel;
    @FindBy(id = "clear-presentation")
    WebElement btnClearSignature;
    @FindBy(id = "btnSignPresent-presentation")
    WebElement btnSignaturePresentationSubmit;
    @FindBy(id = "signature-pad-presentation")
    WebElement canvas;

    private String customerCreatedTime;


    public void clickCustomersNav() {
        customersNav.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(countHeader.get(0)));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(customersNav.getText().contains("Customers"), "Leftnav name is Customers");
        softAssert.assertTrue(driver.findElement(By.className("fa-user")).isEnabled(), "Customers leftnav user icon is showing");
        softAssert.assertTrue(title.getText().contains("Customers"), "Page label is \"Customers\"");
        softAssert.assertTrue(searchBox.isEnabled(), "Searchbox is visible");
        softAssert.assertTrue(btnNewCustomer.isEnabled(), "New customer button is showing");
        softAssert.assertTrue(btnNewCustomer.getText().contains("New Customer"), "New Customer button name is \"New customer\"");
        softAssert.assertTrue(driver.findElement(By.className("fa-plus-circle")).isEnabled(), "In new customer button the plus icon is visible");
        softAssert.assertTrue(datefilter.isEnabled(), "Date filter is visible");
        softAssert.assertTrue(branchFilter.isEnabled(), "Branch filter is visible");
        softAssert.assertTrue(statusFilter.isEnabled(), "Status filter is visible");
        softAssert.assertTrue(salesRepFilter.isEnabled(), "Sales rep filter is visible");
        softAssert.assertAll();
    }
    public void searchCustomerByCusName(String keyword) throws InterruptedException {
         SoftAssert softAssert = new SoftAssert();
         softAssert.assertTrue(searchBox.getAttribute("placeholder").contains("Search"),"Searchbox placeholder is \"Search\"");
         searchBox.sendKeys(keyword);
         btnSearchIcon.click();
         Thread.sleep(4000);
         softAssert.assertAll();
    }
    public String getCurrentFormattedDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy h:mm a");
        return localDateTime.format(formatter);
    }
    public String clickNewCusButton() {
        btnNewCustomer.click();
//        String currentDateTime = getCurrentFormattedDateTime();
        customerCreatedTime = getCurrentFormattedDateTime();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(customerinfoHeader.get(0)));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(customerinfoHeader.get(0).getText().contains("Primary Applicant Info"), "Primary Applicant Info label is showing");
        softAssert.assertTrue(tabQualify.getText().contains("Qualify"), "Tab name is \"Qualify\"");
        softAssert.assertFalse(tabQualify.getAttribute("class").contains("pre_active"), "Qualify tab is not active before inserting information");
        softAssert.assertTrue(btnClear.isEnabled(), "Clear button is showing");
        softAssert.assertTrue(btnClear.getText().contains("Clear"), "Clear button name is clear");
        softAssert.assertTrue(fieldLabel.get(0).getText().contains("First Name"), "First Name label is showing");
        softAssert.assertAll();
        return customerCreatedTime;
    }
    public void insertQualifyInfos(String primaryZP, String primaryZP2, String primaryCity, String primaryState, String primarydob, String primarySSN, String primaryCellphn, String primaryEmail) throws InterruptedException, IOException, ParseException {
        SoftAssert softAssert = new SoftAssert();
        Faker faker = new Faker();
        FormatAssertion formatter = new FormatAssertion();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        String filepath = "./src/test/resources/customerinfo.json";
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filepath));
        JSONObject jsonObject = new JSONObject();

        softAssert.assertTrue(tabQualify.getText().contains("Qualify"), "Tab name is \"Qualify\"");
        softAssert.assertTrue(fieldLabel.get(0).getText().contains("First Name"), "First Name label is showing");
        softAssert.assertTrue(fieldLabel.get(1).getText().contains("Middle Name"), "Middle Name label is showing");
        softAssert.assertTrue(fieldLabel.get(2).getText().contains("Last Name"), "Last Name label is showing");
        softAssert.assertTrue(fieldLabel.get(3).getText().contains("Address"), "Address label is showing");
        softAssert.assertTrue(fieldLabel.get(4).getText().contains("Zip Code"), "Zip Code label is showing");
        softAssert.assertTrue(fieldLabel.get(5).getText().contains("City"), "City label is showing");
        softAssert.assertTrue(fieldLabel.get(6).getText().contains("State"), "State label is showing");
        softAssert.assertTrue(fieldLabel.get(7).getText().contains("DOB"), "DOB label is showing");
        softAssert.assertTrue(fieldLabel.get(8).getText().contains("SSN"), "SSN label is showing");
        softAssert.assertTrue(fieldLabel.get(9).getText().contains("Cell Phone"), "Cell Phone label is showing");
        softAssert.assertTrue(fieldLabel.get(10).getText().contains("Secondary Phone"), "Secondary Phone label is showing");
        softAssert.assertTrue(fieldLabel.get(11).getText().contains("Email"), "Email label is showing");

        softAssert.assertTrue(fieldLabel.get(12).getText().contains("First Name"), "Co-app's First Name label is showing");
        softAssert.assertTrue(fieldLabel.get(13).getText().contains("Middle Name"), "Co-app's Middle Name label is showing");
        softAssert.assertTrue(fieldLabel.get(14).getText().contains("Last Name"), "Co-app's Last Name label is showing");
        softAssert.assertTrue(fieldLabel.get(15).getText().contains("Address"), "Co-app's Address label is showing");
        softAssert.assertTrue(fieldLabel.get(16).getText().contains("Zip"), "Co-app's Zip Code label is showing");
        softAssert.assertTrue(fieldLabel.get(17).getText().contains("City"), "Co-app's City label is showing");
        softAssert.assertTrue(fieldLabel.get(18).getText().contains("State"), "Co-app's State label is showing");
        softAssert.assertTrue(fieldLabel.get(19).getText().contains("DOB"), "Co-app's DOB label is showing");
        softAssert.assertTrue(fieldLabel.get(20).getText().contains("SSN"), "Co-app's SSN label is showing");
        softAssert.assertTrue(fieldLabel.get(21).getText().contains("Cell Phone"), "Co-app's Cell Phone label is showing");
        softAssert.assertTrue(fieldLabel.get(22).getText().contains("Secondary Phone"), "Co-app's Secondary Phone label is showing");
        softAssert.assertTrue(fieldLabel.get(23).getText().contains("Email"), "Co-app's Email label is showing");
        softAssert.assertTrue(driver.findElements(By.xpath("//div[@class ='iagreecheckbox']/label")).get(0).getText().contains("I understand that by clicking the \"Submit\" button, I am providing \"written instruction\" under the FCRA authorizing [SOFTPULL CLIENT] to obtain personal credit & other information from Softpull, Experian, TransUnion, and/or Equifax solely for credit pre-qualification. This process will not affect my credit score. I also give permission for my contact information to be given to a third party lender, if applicable."), "First checkbox text is true");
        softAssert.assertTrue(driver.findElements(By.xpath("//div[@class ='iagreecheckbox']/label")).get(1).getText().contains("I certify I have read and agree to the Electronic disclosures communications Link to electronic disclosures pop up/widget."), "2nd check box text is ok");
        softAssert.assertTrue(btnVerifyHOME.isEnabled(), "Vefirfy homeownership button is visible");
        softAssert.assertTrue(btnVerifyHOME.getText().contains("Verify Home Ownership"), "Button name is \"Verify Home Ownership\"");
        softAssert.assertTrue(btnRunCredit.isEnabled(), "Run credit button is showing");
        softAssert.assertTrue(btnRunCredit.getText().contains("Run Credit"), "Button name is \"Run Credit\"");
        softAssert.assertTrue(driver.findElements(By.className("accordion-button")).get(0).getText().contains("Co-Applicant"), "Co-Applicant label is showing");
        softAssert.assertTrue(copyAddress.isEnabled(), "Copy address checkbox is showing");
        softAssert.assertTrue(copyAddress.getText().contains("Copy Address"), "Label \"Copy Address\" is showing");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnMakePrimary);
        softAssert.assertTrue(btnDeleteCoApp.isEnabled(), "Delete co-app button is showing");
        softAssert.assertTrue(btnDeleteCoApp.getText().contains("Delete CoApp"), "Button name is \"Delete CoApp\"");
        softAssert.assertTrue(btnMakePrimary.isEnabled(), "Make primary button is showing");
        softAssert.assertTrue(btnMakePrimary.getText().contains("Make Primary"), "Button name is Make Primary");
        softAssert.assertTrue(btnRunCoAppCredit.isEnabled(), "Run co-app credit button is showing");
        softAssert.assertTrue(btnRunCoAppCredit.getText().contains("Run Co-Applicant Credit"), "Button name is \"Run Co-Applicant Credit\"");
        btnNextStep.get(0).click();
//        System.out.println("fege = "+driver.findElements(By.xpath("//p[@class='error-body']/br")).get(0).getAttribute("innerHTML"));
//        System.out.println("Hh ="+errorbody.get(0).getAttribute("innerHTML").replaceAll("(?i)<br>", "\n").replaceAll("\\<.*?\\>", "").trim());
        softAssert.assertTrue(errorbody.get(0).getAttribute("innerHTML").replaceAll("(?i)<br>", "\n").replaceAll("\\<.*?\\>", "").trim().contains("First name required\n" + " Last name required\n" + " Address required\n" + " Zip code required\n" + " City required\n" + " State required\n" + " Date of birth required"), "It shows the warning if I do not enter any of the customer information");
        btnPopUpCloseXpath.get(2).click();

        String primaryFname = faker.name().firstName();
        txtPrimaryFirstName.sendKeys(primaryFname);
        jsonObject.put("Primary First Name",primaryFname);

        String PrimaryMidName = faker.name().firstName();
        txtPriMidName.sendKeys(PrimaryMidName);
        jsonObject.put("Primary Middle Name",PrimaryMidName);

        String primaryLname = faker.name().lastName();
        txtPriLastName.sendKeys(primaryLname);
        jsonObject.put("Primary Last Name",primaryLname);

        String priimaryAdd = faker.address().streetAddress();
        txtPrimaryAddress.sendKeys(priimaryAdd);
        jsonObject.put("Primary Address",priimaryAdd);

        txtPrimaryZip.sendKeys(primaryZP);
        txtPrimaryZip.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        txtPrimaryZip.sendKeys(primaryZP2);
        Thread.sleep(2000);
        txtPrimaryZip.sendKeys(Keys.ESCAPE);
        Thread.sleep(4000);
        jsonObject.put("Primary Zip",primaryZP+primaryZP2);

        txtPrimaryCity.sendKeys(primaryCity);
        jsonObject.put("Primary City",primaryCity);
        txtPrimaryState.sendKeys(primaryState);
        jsonObject.put("Primary State",primaryState);
        //softAssert.assertFalse(txtPrimaryDOB.getAttribute("class").contains("required"),"The DOB field is not showing required yet");
        txtPrimaryDOB.sendKeys(primarydob);
        jsonObject.put("Primary DOB",primarydob);
//        txtPrimaryDOB.sendKeys(Keys.ENTER);
//        txtPrimaryDOB.sendKeys(Keys.TAB);
        Actions actions = new Actions(driver);
        actions.moveByOffset(10, 10).click().perform(); // Clicks at (10,10) on the screen
        txtPrimarySSN.sendKeys(primarySSN);
        Thread.sleep(3000);
        String expectedSSNFormatted = formatter.formatWithDashes(primarySSN);
        jsonObject.put("Primary SSN",expectedSSNFormatted);

        driver.findElement(By.className("chkAgree1")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("chkAgree2")).click();
        Thread.sleep(2500);
//        btnRunCredit.click();
//        wait.until(ExpectedConditions.visibilityOf(popup.get(0)));
//
//        softAssert.assertTrue(popupHeader.get(0).getText().contains("No Score Found"), "Run credit is showing No Score Found");
//        softAssert.assertTrue(popupMsg.get(0).getText().contains("Verify Address\n" + "Verify Correct Spelling Of Name"), "Ren credit pop up message is to verify address and correct spelling of name");
//        softAssert.assertTrue(btnPopupClose.get(0).getText().contains("Close"), "Button name is close");
//        btnPopupClose.get(0).click();
//        wait.until(ExpectedConditions.visibilityOf(customerinfoHeader.get(0)));
//
//        Thread.sleep(2000);
//        softAssert.assertTrue(driver.findElement(By.className("asg_sep_block_header")).getText().contains("Credit Report"), "Credit Report label is showing after run credit");
//        softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/tbody/tr/td[1]")).getText().contains(primaryFname + " " + primaryLname), "In credit report frstname and last name is showing");
//        softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/tbody/tr/td[2]/span")).getText().contains("0"), "In credit credit score is showing");
//        softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/thead/tr/th[1]/span")).getText().contains("Name"), "Credit report table head \"Name\" is showing");
//        softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/thead/tr/th[2]/span")).getText().contains("Score"), "Credit report table head \"Score\" is showing");

        primaryCellPhone.sendKeys(primaryCellphn);
        FormatNumberAssertion formatNumberAssertion = new FormatNumberAssertion();
        jsonObject.put("Primary Cell Phone",formatNumberAssertion);
        String expectedPrimaryCellNumberFormatted = formatNumberAssertion.formatNumber(primaryCellphn);
        jsonObject.put("Primary Cell Phone",expectedPrimaryCellNumberFormatted);

        String primarySecondphn = "8"+faker.number().digits(9);
        primarySecondaryPhone.sendKeys(primarySecondphn);
        String expectedPrimarySecondaryNumberFormatted = formatNumberAssertion.formatNumber(primarySecondphn);
        jsonObject.put("Primary Secondary Phone",expectedPrimarySecondaryNumberFormatted);

        primaryEmailAddress.sendKeys(primaryEmail);
        jsonObject.put("Primary Email",primaryEmail);
        btnVerifyHOME.click();
        wait.until(ExpectedConditions.visibilityOf(popup.get(3)));

        softAssert.assertTrue(popupMsg.get(4).getText().contains("Do you want to verify home ownership?"), "Homeownership's popup is showing");
        softAssert.assertTrue(btnNoPopUp.get(0).getText().contains("No"), "Homeownership'success popup's No button is showing");
        softAssert.assertTrue(btnYesPopUp.get(0).getText().contains("Yes"), "Homeownership'success popup's yes button is showing");
        btnYesPopUp.get(0).click();
        wait.until(ExpectedConditions.visibilityOf(popup.get(4)));
        softAssert.assertTrue(popupHeader.get(4).getText().contains("Error!"), "Homeownership's popup is showing Error!");
        softAssert.assertTrue(errorbody.get(0).getText().contains("Applicant/Co-Applicant name doesn't match with homeowner."), "Applicant/Co-Applicant name doesn't match with homeowner is showing");
        softAssert.assertTrue(btnPopUpCloseXpath.get(2).getText().contains("Close"), "homeownership's popup's close button is showing");
        softAssert.assertTrue(primaryCellPhone.getAttribute("value").contains(expectedPrimaryCellNumberFormatted));
        softAssert.assertTrue(primarySecondaryPhone.getAttribute("value").contains(expectedPrimarySecondaryNumberFormatted));
        softAssert.assertTrue(txtPrimarySSN.getAttribute("value").contains(expectedSSNFormatted),"SSn formated successfully in edit screen");
        List<WebElement> closeButtons = driver.findElements(By.cssSelector("button.btn.btn-default[data-dismiss='modal']"));
        actions.moveToElement(closeButtons.get(3)).click().perform();
        wait.until(ExpectedConditions.visibilityOf(customerinfoHeader.get(0)));
        Select select = new Select(dropdownSalesRep);
        String salesPerson = select.getFirstSelectedOption().getText();
        jsonObject.put("Sales Person",salesPerson);
        Select select1 = new Select(dropdownFinanceCompany);
        String financeCompany = select1.getFirstSelectedOption().getText();
        jsonObject.put("Financing Company",financeCompany);
        jsonArray.add(jsonObject);
//        FileWriter fileWriter = new FileWriter(filepath);
//        fileWriter.write(jsonArray.toJSONString());
//        fileWriter.flush();
//        fileWriter.close();
        btnCloseScreen.get(1).click();
        new WebDriverWait(driver, Duration.ofSeconds(35)).until(
                driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete")
        );
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ci_header")));
        clickCustomersNav();
        int n = jsonArray.size();
        JSONObject cusnameObj = (JSONObject) jsonArray.get(n-1);
        String customerName =  cusnameObj.get("Primary First Name")+" "+cusnameObj.get("Primary Last Name").toString();
        searchCustomerByCusName(customerName);
        String timestamp = getCurrentFormattedDateTime().split(" ")[0];
//        System.out.println(timestamp);
        softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'table_style_fin')]//div[contains(text(),'Date') and (@class='resp_head')]/following-sibling::div/span[@title='Sold Date']")).getText().contains("Sold: "+timestamp));
        softAssert.assertTrue(driver.findElements(By.xpath("//a[(@title='Customer name')]/div/span")).get(0).getText().contains(cusnameObj.get("Primary First Name")+" "+cusnameObj.get("Primary Middle Name")+" "+cusnameObj.get("Primary Last Name").toString()));
        driver.findElements(By.xpath("//a[(@title='Customer name')]/div/span")).get(0).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ci_header")));
        JSONObject updatedcusObj = (JSONObject) jsonArray.get(jsonArray.size()-1);
        System.out.println(driver.getCurrentUrl());
        System.out.println("id="+driver.getCurrentUrl().split("id")[1].replace("=","").trim());
        updatedcusObj.put("Customer Id",driver.getCurrentUrl().split("id")[1].replace("=","").trim());        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Name')]/following-sibling::td")).getText().contains(primaryFname + " " + PrimaryMidName + " " + primaryLname), "Customer name is showing");
        try (FileWriter writer = new FileWriter(filepath)) {
            writer.write(jsonArray.toJSONString());
        }
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Sales Person')]/following-sibling::td")).getText().contains(salesPerson), "salesPerson name is showing");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Finance Company')]/following-sibling::td")).getText().contains(financeCompany), "financeCompany name is showing");
//        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Social Security Number')]/following-sibling::td")).getText().contains(expectedSSNFormatted), "SSN is showing");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Cell Phone')]/following-sibling::td")).getText().contains(expectedPrimaryCellNumberFormatted), "Customer Cell Phone is showing");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Secondary Phone')]/following-sibling::td")).getText().contains(expectedPrimarySecondaryNumberFormatted), "Customer Secondary Phone is showing");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Email')]/following-sibling::td")).getText().contains(primaryEmail), "Customer Email is showing");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Postal Code')]/following-sibling::td")).getText().contains(primaryZP+primaryZP2), "Customer Postal Code is showing");
//        System.out.println(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Address')]/following-sibling::td")).getText());
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Address')]/following-sibling::td")).getText().replace("\n", ", ").trim().contains(priimaryAdd+", "+primaryCity+", "+primaryState+" "+primaryZP+primaryZP2), "Customer address is showing");

        softAssert.assertAll();

    }
    public class FormatAssertion {
        public String formatWithDashes(String input) {
            // Insert dashes in the 3-2-4 format
            return input.replaceFirst("(\\d{3})(\\d{2})(\\d{4})", "$1-$2-$3");
        }
    }
    public class FormatNumberAssertion {
        public String formatNumber(String input) {
            return input.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
        }
    }
    public void clickEditCustomerDetails(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(btnEditCusInfo.getText().contains("Edit Application"),"Button name is \"Edit Application\"");
        softAssert.assertTrue(driver.findElement(By.className("fa-pencil-square-o")).isEnabled(),"Edit icon is showing on edit application button");
        btnEditCusInfo.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(customerinfoHeader.get(0)));
        softAssert.assertAll();
    }
    public void insertCOAppinfo(String CoFname, String CoMname, String CoLname, String CoAddress, String CoZip, String CoCity, String CoState, String CoDob, String CoSSN, String CoCellphn, String CoSecondPhn, String CoEmail) throws InterruptedException, IOException, ParseException {
        SoftAssert softAssert = new SoftAssert();
        Faker faker = new Faker();
        FormatAssertion formatter = new FormatAssertion();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        txtCOappFname.sendKeys(CoFname);
        Thread.sleep(2000);
        txtCOappMname.sendKeys(CoMname);
        Thread.sleep(2000);
        txtCOappLname.sendKeys(CoLname);
        Thread.sleep(2000);
        softAssert.assertTrue(copyAddress.getText().contains("Copy Address"),"Copy address check box name is copy address");
        chckCopyAddress.click();
        txtCOappDoB.sendKeys(CoDob);
        Actions actions = new Actions(driver);
        actions.moveByOffset(10, 10).click().perform(); // Clicks at (10,10) on the screen
        txtCOappSSN.sendKeys(CoSSN);
        String expectedSSNFormatted = formatter.formatWithDashes(CoSSN);
        Thread.sleep(3000);
        txtCOappCellPhn.sendKeys(CoCellphn);
        FormatNumberAssertion formatNumberAssertion = new FormatNumberAssertion();
        String expectedCoCellPhnFormatted =  formatNumberAssertion.formatNumber(CoCellphn);
        Thread.sleep(2000);
        txtCOappSecondPhone.sendKeys(CoSecondPhn);
        String expectedCoSecondPhnFormatted =  formatNumberAssertion.formatNumber(CoSecondPhn);
        Thread.sleep(2000);
        txtCOappEmail.sendKeys(CoEmail);
        Thread.sleep(2000);
        softAssert.assertTrue(btnRunCoAppCredit.getText().contains("Run Co-Applicant Credit"),"Co-App run credit button name is \"Run Co-Applicant Credit\"");
//        btnRunCoAppCredit.click();
//        wait.until(ExpectedConditions.visibilityOf(popup.get(0)));
//        softAssert.assertTrue(popupHeader.get(0).getText().contains("No Score Found"), "Run credit is showing No Score Found");
//        softAssert.assertTrue(popupMsg.get(0).getText().contains("Verify Co-Applicant Address\n" + "Verify Co-Applicant Correct Spelling Of Name"), "Ren credit pop up message is to verify address and correct spelling of name");
//        softAssert.assertTrue(btnPopupClose.get(0).getText().contains("Close"), "Button name is close");
//        btnPopupClose.get(0).click();
//            wait.until(ExpectedConditions.visibilityOf(customerinfoHeader.get(0)));
//
//            softAssert.assertTrue(driver.findElement(By.className("asg_sep_block_header")).getText().contains("Credit Report"), "Credit Report label is showing after run Co-App credit");
//            softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/tbody/tr/td[1]")).getText().contains(CoFname + " " + CoLname), "In credit report Co-App's frstname and last name is showing");
//            softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/tbody/tr/td[2]/span")).getText().contains("0"), "In credit report Co-App's credit score is showing");
//            softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/thead/tr/th[1]/span")).getText().contains("Name"), "Credit report table head \"Name\" is showing after running Co-App's credit");
//            softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/thead/tr/th[2]/span")).getText().contains("Score"), "Credit report table head \"Score\" is showing after running Co-App's credit");
        btnCloseScreen.get(1).click();
        new WebDriverWait(driver, Duration.ofSeconds(35)).until(
                driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete")
        );
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ci_header")));
        clickEditCustomerDetails();
        softAssert.assertTrue(txtCOappSSN.getAttribute("value").contains(expectedSSNFormatted),"Co-app's SSN formated successfully in edit screen");
            softAssert.assertTrue(txtCOappCellPhn.getAttribute("value").contains(expectedCoCellPhnFormatted),"Co-app's Cell phone formatted successfully");
            softAssert.assertTrue(txtCOappSecondPhone.getAttribute("value").contains(expectedCoSecondPhnFormatted),"Co-app's Second phone formatted successfully");
            softAssert.assertTrue(txtPrimaryAddress.getAttribute("value").contains(txtCOAddress.getAttribute("value")),"After copying address, primary address is shown on co-app's address");
            softAssert.assertTrue(txtPrimaryZip.getAttribute("value").contains(txtCOappZip.getAttribute("value")),"After copying address, primary Zip is shown on co-app's address");
            softAssert.assertTrue(txtPrimaryCity.getAttribute("value").contains(txtCOappCity.getAttribute("value")),"After copying address, primary City is shown on co-app's address");
            softAssert.assertTrue(txtPrimaryState.getAttribute("value").contains(txtCOappState.getAttribute("value")),"After copying address, primary State is shown on co-app's address");
            softAssert.assertTrue(btnDeleteCoApp.isEnabled(), "Delete co-app button is showing after entering co-app info");
            softAssert.assertTrue(btnDeleteCoApp.getText().contains("Delete CoApp"), "Button name is \"Delete CoApp\" entering co-app info");
        btnDeleteCoApp.click();
            wait.until(ExpectedConditions.visibilityOf(popup.get(3)));
            softAssert.assertTrue(popupMsg.get(4).getText().contains("Do you want to delete this item?"),"Delete co-app's warning popup label is \"Do you want to delete this item?\"");
            softAssert.assertTrue(driver.findElement(By.className("fa-question")).isEnabled(),"Co-app delete button's popup is showing question mark");
        softAssert.assertTrue(btnNoPopUp.get(0).getText().contains("No"),"Delete co-app's popup No button name is \"No\"");
        softAssert.assertTrue(btnYesPopUp.get(0).getText().contains("Yes"),"Delete co-app's popup Yes button name is \"Yes\"");
            btnYesPopUp.get(0).click();
        wait.until(ExpectedConditions.visibilityOf(customerinfoHeader.get(0)));
        Thread.sleep(3000);
        softAssert.assertTrue(txtCOappFname.getAttribute("value").contains(""),"Co-app's first name deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOappMname.getAttribute("value").contains(""),"Co-app's middle name deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOappLname.getAttribute("value").contains(""),"Co-app's last name deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOAddress.getAttribute("value").contains(""),"Co-app's address  deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOappZip.getAttribute("value").contains(""),"Co-app's zip  deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOappCity.getAttribute("value").contains(""),"Co-app's city deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOappState.getAttribute("value").contains(""),"Co-app's state deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOappDoB.getAttribute("value").contains(""),"Co-app's dob deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOappSSN.getAttribute("value").contains(""),"Co-app's ssn deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOappCellPhn.getAttribute("value").contains(""),"Co-app's cell phone deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOappSecondPhone.getAttribute("value").contains(""),"Co-app's secondary phone deleted after clicking delete co-app button");
        softAssert.assertTrue(txtCOappEmail.getAttribute("value").contains(""),"Co-app's email deleted after clicking delete co-app button");
        txtCOappFname.sendKeys(CoFname);
        txtCOappMname.sendKeys(CoMname);

        txtCOappLname.sendKeys(CoLname);

        txtCOAddress.sendKeys(CoAddress);
        txtCOappZip.sendKeys(CoZip);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector(".tt-suggestion[data-zip^='" + CoZip + "']"), 0));
        Random rand = new Random();
        int randomIndex = rand.nextInt(suggestions.size());
        // Get the random suggestion
        WebElement randomSuggestion = suggestions.get(randomIndex);

        // Print ZIP, City, State
        String zip = randomSuggestion.getAttribute("data-zip");
        String city = randomSuggestion.getAttribute("data-city");
        String state = randomSuggestion.getAttribute("data-state");
        // Click on the suggestion
        randomSuggestion.click();
        softAssert.assertTrue(txtCOappZip.getAttribute("value").contains(CoZip),"Coapp's zip is showing as given");
        softAssert.assertTrue(txtCOappCity.getAttribute("value").contains(city),"selected zip code's city is showing");
        softAssert.assertTrue(txtCOappState.getAttribute("value").contains(state),"selected zip code's state is showing");
        txtCOappDoB.sendKeys(CoDob);
        actions.moveToElement(txtCOappSSN).click().perform();
        txtCOappSSN.sendKeys(CoSSN);
        String expectedFormattedSSN2 = formatter.formatWithDashes(CoSSN);
        txtCOappCellPhn.sendKeys(CoCellphn);
        String expectedFormatedCellphn = formatNumberAssertion.formatNumber(CoCellphn);
        Thread.sleep(1500);
        txtCOappSecondPhone.sendKeys(CoSecondPhn);
//        System.out.println("casdc");

        String expectedFormattedScndphn =  formatNumberAssertion.formatNumber(CoSecondPhn);
        txtCOappEmail.sendKeys(CoEmail);
        softAssert.assertTrue(btnRunCoAppCredit.getText().contains("Run Co-Applicant Credit"),"Co-App run credit button name is \"Run Co-Applicant Credit\"");
//        btnRunCoAppCredit.click();
//        wait.until(ExpectedConditions.visibilityOf(popup.get(0)));
//        softAssert.assertTrue(popupHeader.get(0).getText().contains("No Score Found"), "Run credit is showing No Score Found after delete and ren enter co apps info");
//        softAssert.assertTrue(popupMsg.get(0).getText().contains("Verify Co-Applicant Address\n" + "Verify Co-Applicant Correct Spelling Of Name"), "Ren credit pop up message is to verify address and correct spelling of name after delete and ren enter co apps info");
//        softAssert.assertTrue(btnPopupClose.get(0).getText().contains("Close"), "Button name is close  after delete and ren enter co apps info");
//        btnPopupClose.get(0).click();
//        wait.until(ExpectedConditions.visibilityOf(customerinfoHeader.get(0)));
//        Thread.sleep(2000);
//        softAssert.assertTrue(driver.findElement(By.className("asg_sep_block_header")).getText().contains("Credit Report"), "Credit Report label is showing after run Co-App credit after delete and ren enter co apps info");
//        softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/tbody/tr/td[1]")).getText().contains(CoFname + " " + CoLname), "In credit report Co-App's frstname and last name is showing after delete and ren enter co apps info");
//        softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/tbody/tr/td[2]/span")).getText().contains("0"), "In credit report Co-App's credit score is showing after delete and ren enter co apps info");
//        softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/thead/tr/th[1]/span")).getText().contains("Name"), "Credit report table head \"Name\" is showing after running Co-App's credit after delete and ren enter co apps info");
//        softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'cr_rep_block')]/thead/tr/th[2]/span")).getText().contains("Score"), "Credit report table head \"Score\" is showing after running Co-App's credit after delete and ren enter co apps info");

        Thread.sleep(1500);
        softAssert.assertTrue(txtCOappSSN.getAttribute("value").contains(expectedFormattedSSN2),"Co-app's SSN formated successfully in edit screen after delete and ren enter co apps info");
        softAssert.assertTrue(txtCOappCellPhn.getAttribute("value").contains(expectedFormatedCellphn),"Co-app's Cell phone formatted successfully after delete and ren enter co apps info");
        softAssert.assertTrue(txtCOappSecondPhone.getAttribute("value").contains(expectedFormattedScndphn),"Co-app's Second phone formatted successfully after delete and ren enter co apps info");
        softAssert.assertAll();
    }
    public void createProposal(String contractLenghtValue, String deferredMonthValue) throws InterruptedException, ParseException, IOException {
        Thread.sleep(2000);
        String filepath ="./src/test/resources/proposalinfo.json";
        String customerFilepath = "./src/test/resources/customerinfo.json";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        JSONParser parser =new JSONParser();
        JSONArray jsonArrayInitialProposalInfo = (JSONArray) parser.parse(new FileReader(filepath));
        JSONArray jsonArrayCustomerInfo = (JSONArray) parser.parse(new FileReader(customerFilepath));
        JSONObject jsonObject = new JSONObject();
        btnNextStep.get(0).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(pageHeader.get(0)));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(pageHeader.get(0).getText().contains("Create Proposal"),"Proposal tab header name is \"Create Proposal\"");
        softAssert.assertTrue(tabProposal.getText().contains("Proposal"),"tab name is proposal");
        softAssert.assertTrue(tabQualify.getAttribute("class").contains("pre_active"),"Qualaify tab is activated as all info is entered");
        softAssert.assertFalse(tabProposal.getAttribute("class").contains("pre_active"),"Proposal tab still not activated as all info is not entered yet");
        softAssert.assertTrue(customerinfoHeader.get(1).getText().contains("Estimate: EST0"),"In proposal tab the estimate label is showing");
        softAssert.assertTrue(subHeader.get(1).getText().contains("Contract Details"),"In proposal tab Contract Details label is showing");
        softAssert.assertTrue(driver.findElements(By.xpath("//div[contains(@class,'campoContainer_prop')]//label")).get(0).getText().contains("Contract Length (months)"),"\"Contract Length (months)\" label is showing in proposal tab");
        softAssert.assertTrue(driver.findElements(By.xpath("//div[contains(@class,'campoContainer_prop')]//label")).get(1).getText().contains("Deferred Months"),"\"Deferred Months\" label is showing in proposal tab");
//        System.out.println(driver.findElements(By.className("ahs_table_block_head")).get(0).getText());
        softAssert.assertTrue(driver.findElements(By.className("ahs_table_block_head")).get(0).getText().contains("EQUIPMENT LIST"),"\"Equipment List\" label is showing in proposal tab");
        softAssert.assertTrue(driver.findElements(By.className("ahs_table_block_head")).get(1).getText().contains("SERVICE LIST"),"\"Service List\" label is showing in proposal tab");
        softAssert.assertTrue(driver.findElements(By.className("tab-Product")).get(0).getText().contains("PRODUCT"),"Equipment table column \"Product\" is showing");
        softAssert.assertTrue(driver.findElements(By.className("tab-Product")).get(1).getText().contains("SERVICE"),"Service table column \"Service\" is showing");
        softAssert.assertTrue(driver.findElements(By.className("tab-Quantity")).get(0).getText().contains("QTY"),"Equipment tables column \"QTY\" is showing");
        softAssert.assertTrue(driver.findElements(By.className("tab-Quantity")).get(1).getText().contains("QTY"),"Service tables column \"QTY\" is showing");
        softAssert.assertTrue(driver.findElements(By.className("tab-Rate")).get(0).getText().contains("MONTHLY RATE"),"Equipment tables column \"Monthly Rate\" is showing");
        softAssert.assertTrue(driver.findElements(By.className("tab-Rate")).get(1).getText().contains("MONTHLY RATE"),"Service tables column \"Monthly Rate\" is showing");
        softAssert.assertTrue(driver.findElements(By.className("tab-Amount")).get(0).getText().contains("TOTAL MONTHLY RATE"),"Equipment tables column \"Total Monthly Rate\" is showing");
        softAssert.assertTrue(driver.findElements(By.className("tab-Amount")).get(1).getText().contains("TOTAL MONTHLY RATE"),"Service tables column \"Total Monthly Rate\" is showing");
        softAssert.assertTrue(driver.findElements(By.xpath("//table[contains(@class,'EquipmentCalculations')]//tr[1]/td")).get(0).getText().contains("Total Monthly"),"Total Monthly label is showing in the equipment calculation");
        softAssert.assertTrue(driver.findElements(By.xpath("//table[contains(@class,'EquipmentCalculations')]//tr[2]/td")).get(0).getText().contains("Total Finance"),"Total Finance label is showing in Monthly Financing the equipment calculation");
        softAssert.assertTrue(driver.findElements(By.xpath("//table[contains(@class,'EquipmentCalculations')]//tr[3]/td")).get(0).getText().contains("Monthly Financing"),"Monthly Financing is showing in the equipment calculation");
        softAssert.assertTrue(driver.findElements(By.xpath("//table[contains(@class,'ServiceCalculations')]//tr[1]/td")).get(0).getText().contains("Monthly Monitoring (ASG)"),"Monthly Monitoring (ASG) label is showing in the equipment calculation");
        softAssert.assertTrue(driver.findElements(By.xpath("//table[contains(@class,'ServiceCalculations')]//tr[2]/td")).get(0).getText().contains("Monthly Payment"),"Monthly Payment label is showing in Monthly Financing the equipment calculation");
        softAssert.assertTrue(driver.findElements(By.xpath("//table[contains(@class,'ServiceCalculations')]//tr[3]/td")).get(0).getText().contains("Activation Fee"),"Activation Fee is showing in the equipment calculation");
        softAssert.assertNotNull(driver.findElement(By.id("FinancingTerm")).getText(),"financing term is showing term selected");
        jsonObject.put("Payment Term",driver.findElement(By.id("FinancingTerm")).getText().replace("\n","").trim());
        txtContractLength.sendKeys(Keys.CONTROL+"a");
        txtContractLength.sendKeys(Keys.BACK_SPACE);
        txtContractLength.sendKeys(contractLenghtValue);
        jsonObject.put("Contract Length",contractLenghtValue);
        txtDefferedMonth.sendKeys(Keys.CONTROL+"a");
        txtDefferedMonth.sendKeys(Keys.BACK_SPACE);
        txtDefferedMonth.sendKeys(deferredMonthValue);
        jsonObject.put("Deferred Month",deferredMonthValue);
        softAssert.assertTrue(txtTotalMonthly.getText().contains("$60.00"),"Initially total monthly is showing 60$");
        jsonObject.put("Initial Total Monthly",txtTotalMonthly.getText());
        softAssert.assertTrue(MonthlyFinancingAmount.getText().contains("$60.00"),"Initially Monthly financing amount is showing $60.00");
        jsonObject.put("Initial Monthly Financing",MonthlyFinancingAmount.getText());
        softAssert.assertTrue(MonthlyMonitoringAmount.getText().contains("$9.99"),"Initially monthly monitoring amount is showing $9.99");
        jsonObject.put("Initial Monthly Monitoring",MonthlyMonitoringAmount.getText());
        softAssert.assertTrue(monthlyPayment.getText().contains("$69.99"),"Initially monthly payment is showing $69.99");
        jsonObject.put("Initial Monthly Payment",monthlyPayment.getText());
        String totalFinace= totalFinanceCalculate();
//        System.out.println(totalFinace);
        jsonObject.put("Total Finance",totalFinace);
        softAssert.assertTrue(proposalNextStep.getText().contains("Next Step"),"Proposal tab's next step button name is Next Step");
        proposalNextStep.click();
        wait.until(ExpectedConditions.visibilityOf(popup.get(1)));

        jsonArrayInitialProposalInfo.add(jsonObject);
//        FileWriter writer = new FileWriter(filepath);
//        writer.write(jsonArrayInitialProposalInfo.toJSONString());
//        writer.flush();
//        writer.close();
        softAssert.assertTrue(popupHeader.get(1).getText().contains("Success!"),"Initially after saving the proposal, popup header is showing Success! label");
        softAssert.assertTrue(popupMsg.get(1).getText().contains("Estimate saved successfully"),"Initially after saving the proposal, popup msg is showing Estimate saved successfully.");
        softAssert.assertTrue(btnPopupClose.get(1).getText().contains("Close"),"Initially after saving the proposal, popup is showing Close button to close the popup");
        btnPopupClose.get(1).click();
        wait.until(ExpectedConditions.visibilityOf(customerinfoHeader.get(2)));
        softAssert.assertTrue(customerinfoHeader.get(2).getText().contains("Emergency Contacts"),"Initially after saving proposal it goes to contacts page");
        btnCloseScreen.get(1).click();
        new WebDriverWait(driver, Duration.ofSeconds(35)).until(
                driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete")
        );
//        System.out.println("do");
        int n = jsonArrayInitialProposalInfo.size();
        int m = jsonArrayCustomerInfo.size();
        JSONObject InitialProposalInfoObj = (JSONObject) jsonArrayInitialProposalInfo.get(n-1);
        JSONObject customerInfoObj = (JSONObject) jsonArrayCustomerInfo.get(m-1);
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Total Monthly Payment')]/following-sibling::td")).getText().contains(InitialProposalInfoObj.get("Initial Monthly Payment").toString()), "Total Monthly Payment is showing on the overview after a initial save to proposal");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Name')]/following-sibling::td")).getText().contains(customerInfoObj.get("Primary First Name").toString()+" "+customerInfoObj.get("Primary Middle Name").toString()+" "+customerInfoObj.get("Primary Last Name").toString()), "Customer name is showing on the overview after saving the proposal initially");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Sales Person')]/following-sibling::td")).getText().contains(customerInfoObj.get("Sales Person").toString()), "salesPerson name is showing  on the overview after saving the proposal initially");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Finance Company')]/following-sibling::td")).getText().contains(customerInfoObj.get("Financing Company").toString()), "financeCompany name is showing  on the overview after saving the proposal initially");
//        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Social Security Number')]/following-sibling::td")).getText().contains(expectedSSNFormatted), "SSN is showing on the overview after saving the proposal initially");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Cell Phone')]/following-sibling::td")).getText().contains(customerInfoObj.get("Primary Cell Phone").toString()), "Customer Cell Phone is showing on the overview after saving the proposal initially");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Secondary Phone')]/following-sibling::td")).getText().contains(customerInfoObj.get("Primary Secondary Phone").toString()), "Customer Secondary Phone is showing on the overview after saving the proposal initially");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Email')]/following-sibling::td")).getText().contains(customerInfoObj.get("Primary Email").toString()), "Customer Email is showing on the overview after saving the proposal initially");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Postal Code')]/following-sibling::td")).getText().contains(customerInfoObj.get("Primary Zip").toString()), "Customer Postal Code is showing on the overview after saving the proposal initially");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Address')]/following-sibling::td")).getText().replace("\n", ", ").trim().contains(customerInfoObj.get("Primary Address").toString()+", "+customerInfoObj.get("Primary City").toString()+", "+customerInfoObj.get("Primary State").toString()+" "+customerInfoObj.get("Primary Zip").toString()), "Customer address is showing on the overview after saving the proposal initially");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Monthly Equipment')]/following-sibling::td")).getText().contains(InitialProposalInfoObj.get("Initial Monthly Financing").toString()), "Monthly Equipment is showing on the overview after a initial save to proposal");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Monthly Monitoring')]/following-sibling::td")).getText().contains(InitialProposalInfoObj.get("Initial Monthly Monitoring").toString()), "Monthly Monitoring is showing on the overview after a initial save to proposal");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Contract Length')]/following-sibling::td")).getText().contains(InitialProposalInfoObj.get("Contract Length").toString()), "Contract Length is showing on the overview after a initial save to proposal");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Deferred Month')]/following-sibling::td")).getText().contains(InitialProposalInfoObj.get("Deferred Month").toString()), "Deferred Month is showing on the overview after a initial save to proposal");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Payment Term')]/following-sibling::td")).getText().contains(InitialProposalInfoObj.get("Payment Term").toString()), "Payment Term is showing on the overview after a initial save to proposal");
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Loan Amount')]/following-sibling::td")).getText().replace(",","").trim().replace("$","").trim().contains(InitialProposalInfoObj.get("Total Finance").toString()), "Loan Amount is showing on the overview after a initial save to proposal");
//        System.out.println("Prp time = "+customerCreatedTime);

        clickCustomersNav();
        String customerName =  customerInfoObj.get("Primary First Name")+" "+customerInfoObj.get("Primary Last Name").toString();
        searchCustomerByCusName(customerName);
        softAssert.assertTrue(driver.findElement(By.xpath("//table[contains(@class,'table_style_fin')]//div[contains(text(),'Payment') and (@class='resp_head')]/following-sibling::div/span[@title='Total Payment']")).getText().contains(InitialProposalInfoObj.get("Initial Monthly Payment").toString()),"In customer list, payment is shhowing after initial save");
        softAssert.assertTrue(driver.findElements(By.xpath("//a[(@title='Customer name')]/div/span")).get(0).getText().contains(customerInfoObj.get("Primary First Name")+" "+customerInfoObj.get("Primary Middle Name")+" "+customerInfoObj.get("Primary Last Name").toString()));
        driver.findElements(By.xpath("//a[(@title='Customer name')]/div/span")).get(0).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ci_header")));
        clickEditCustomerDetails();
        tabProposal.click();
        Thread.sleep(3000);
        driver.findElements(By.className("spnProductRate")).get(0).click();

        productMonthlyRate.get(0).click();
        productMonthlyRate.get(0).sendKeys(Keys.CONTROL+"a");
        productMonthlyRate.get(0).sendKeys(Keys.BACK_SPACE);
        String productRandomRate = String.valueOf((int)(Math.random()*(100-45+1)+45));
        productMonthlyRate.get(0).sendKeys(productRandomRate);
        productMonthlyRate.get(0).sendKeys(Keys.ENTER);

        JSONObject updatedProposalObj = (JSONObject) jsonArrayInitialProposalInfo.get(jsonArrayInitialProposalInfo.size()-1);
        updatedProposalObj.put("Updated Equipment Rate",productRandomRate);
        productDelete.get(2).click();
        js.executeScript("arguments[0].scrollIntoView(true);", monthlyPayment);
        Thread.sleep(3000);
        proposalProdctName1.get(proposalProdctName1.size()-1).click();
        proposalProdctName2.get(proposalProdctName2.size()-2).sendKeys("cam");
        Thread.sleep(1500);
        proposalProdctName2.get(proposalProdctName2.size()-2).sendKeys("era");
//        System.out.println("999");
        wait.until(driver -> {
            for (WebElement suggestion : suggestions) {
                String dataSelect = suggestion.getAttribute("data-select");
                if (dataSelect == null || !dataSelect.toLowerCase().matches(".*camera.*")) {
                    return false; // কোনো একটাতেও না থাকলে wait চালু থাকবে
                }
            }
            return true; // সবগুলোতেই থাকলে wait break
        });
        Thread.sleep(2000);
        List<WebElement> updatedSuggestions = driver.findElements(By.cssSelector(".tt-suggestion"));
        Random rand = new Random();
        int randomIndex = rand.nextInt(updatedSuggestions.size());
        // Get the random suggestion
        WebElement randomSuggestion = updatedSuggestions.get(randomIndex);

        // Print ZIP, City, State
        String type = randomSuggestion.getAttribute("data-type");
        String Productname = randomSuggestion.getAttribute("data-select");
        String productPrice = randomSuggestion.getAttribute("data-price");

        String productManuFracture = driver.findElements(By.className("tt_sug_manufac")).get(randomIndex).getText();
//        System.out.println("1."+type+"\n2."+Productname+"\n3."+productPrice+"\n4."+productManuFracture);

        // Click on the suggestion
        randomSuggestion.click();

        String updatedTotalFinance = totalFinanceCalculate();
        updatedProposalObj.put("New Total Finance",updatedTotalFinance);
        updatedProposalObj.put("New Total Monthly",txtTotalMonthly.getText());
        updatedProposalObj.put("New Monthly Financing",MonthlyFinancingAmount.getText());

        driver.findElements(By.className("spnServiceRate")).get(0).click();

        serviceMonthlyRate.get(0).click();
        serviceMonthlyRate.get(0).sendKeys(Keys.CONTROL+"a");
        serviceMonthlyRate.get(0).sendKeys(Keys.BACK_SPACE);
        String serviceRandomRate = String.format("%.2f", (new Random().nextInt(31) + 10) - 0.01);

        serviceMonthlyRate.get(0).sendKeys(serviceRandomRate);
        serviceMonthlyRate.get(0).sendKeys(Keys.ENTER);


        String updatedMonthlyPayment = totalmonthlyPayment();
        updatedProposalObj.put("New Monthly Payment",updatedMonthlyPayment);
        updatedProposalObj.put("New Monthly Monitoring",MonthlyMonitoringAmount.getText());

        // Write the whole array back to file
        try (FileWriter writer = new FileWriter(filepath)) {
            writer.write(jsonArrayInitialProposalInfo.toJSONString());
        }

        softAssert.assertTrue(activationFeeLabel.get(0).getText().contains("Activation Fee"),"Activation Fee label is showing");
        activationFee.click();
        activationFee.sendKeys(Keys.CONTROL+"a");
        activationFee.sendKeys(Keys.BACK_SPACE);
        activationFee.sendKeys("50");
        softAssert.assertTrue(btnAddEquipment.getText().contains("Add"),"Add equipment button name is \"Add\"");
        softAssert.assertTrue(btnAddService.getText().contains("Add"),"Add Service button name is \"Add\"");
        softAssert.assertTrue(btnAddEquipment.isEnabled(),"Add button for equipment is showing");
        softAssert.assertTrue(btnAddService.isEnabled(),"Add button for Service is showing");
        int equipmentrowSize = driver.findElements(By.className("spnProductName")).size();
        btnAddEquipment.click();
        softAssert.assertEquals(equipmentrowSize+1,driver.findElements(By.className("spnProductName")).size(),"1 row added to equipment table");
        int servicerowSize = driver.findElements(By.className("ServiceName")).size();
        btnAddService.click();
        softAssert.assertEquals(servicerowSize+1,driver.findElements(By.className("ServiceName")).size(),"1 row added to Service table");
        softAssert.assertTrue(btnGeneratePresentation.isEnabled(),"Generate Presentation button is showing");
        softAssert.assertTrue(btnGeneratePresentation.getText().contains("Generate Presentation"),"Button label is \"Generate Presentation\"");
        btnGeneratePresentation.click();
        wait.until(ExpectedConditions.visibilityOf(btnViewPresentation));
        js.executeScript("arguments[0].scrollIntoView(true);",btnSignaturePresentationSubmit);//("arguments[0].scrollIntoView(true);", btnMakePrimary);
        softAssert.assertTrue(btnViewPresentation.isEnabled(),"View presentation button is visible");
        softAssert.assertTrue(btnViewPresentation.getText().contains("View Presentation"),"View presentation button's label is \"View Presentation\"");
        softAssert.assertTrue(btnCopyPresentation.isEnabled(),"Copy Presentation button is showing");
        softAssert.assertTrue(btnCopyPresentation.getText().contains("Copy Presentation"),"Copy Presentation button's label is copy presentation");
        softAssert.assertTrue(btnSendPresentationEmail.isEnabled(),"Send email button is showing");
        softAssert.assertTrue(btnSendPresentationEmail.getText().contains("Email"),"Send email button label is Email");
        softAssert.assertTrue(btnSendPresentationText.isEnabled(),"Send text button is showing");
        softAssert.assertTrue(btnSendPresentationText.getText().contains("Text"),"Send Text button label is Text");
        softAssert.assertTrue(btnSendPresentationBoth.isEnabled(),"Send to both button is showing");
        softAssert.assertTrue(btnSendPresentationBoth.getText().contains("Send To Both"),"Send to both button label is Send To Both");
        softAssert.assertTrue(txtPresentionMailField.getAttribute("value").contains(customerInfoObj.get("Primary Email").toString()),"Email field is showing customer's primary email");
        softAssert.assertTrue(txtPresentionTextField.getAttribute("value").contains(customerInfoObj.get("Primary Cell Phone").toString()),"Text field is showing customer's primary cell phone");
        softAssert.assertTrue(signaturePadLabel.get(0).getText().contains("Signature"),"Signature pad label is Signature");
        softAssert.assertTrue(btnClearSignature.getText().contains("Clear"),"Clear signature button label is clear");
        softAssert.assertTrue(btnClearSignature.isEnabled(),"Signature clear button is showing");
        softAssert.assertTrue(btnSignaturePresentationSubmit.getText().contains("Submit"),"Clear signature button label is submit");
        softAssert.assertTrue(btnSignaturePresentationSubmit.isEnabled(),"Signature submit button is showing");
        btnSendPresentationEmail.click();
        wait.until(ExpectedConditions.visibilityOf(popup.get(11)));
        softAssert.assertTrue(popupHeader.get(6).getText().contains("Success"),"Presentation send email success popup header is Success");
//        LocalDateTime currentTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy h:mm a");
//        String formattedCurrentTime = currentTime.format(formatter);
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H.mm"); // for 9.57 (24-hour format without leading zero)
        String formattedTime = currentTime.format(formatter);
        Thread.sleep(5000);
        System.out.println("PLEASE CHECK THE EMAIL THAT AN PRESENTATION EMAIL HAS SENT WITHOUT SIGN at "+formattedTime);
        btnSignaturePresentationSubmit.click();
        wait.until(ExpectedConditions.visibilityOf(popup.get(4)));
        softAssert.assertTrue(popupHeader.get(4).getText().contains("Error!"),"Popup header is showing \"Error!\", when i try to submit a sign without drawing it on the presentation");
        softAssert.assertTrue(errorbody.get(0).getText().contains("Please Draw Your Signature"),"Pop up message is showing \"Please Draw Your Signature\"");
        btnPopUpCloseXpath.get(2).click();
        Thread.sleep(2000);
        js.executeScript(
                "var canvas = arguments[0]; " +
                        "var rect = canvas.getBoundingClientRect(); " +
                        "var context = canvas.getContext('2d'); " +
                        "context.beginPath(); " +
                        "canvas.dispatchEvent(new MouseEvent('mousedown', { " +
                        "  bubbles: true, " +
                        "  cancelable: true, " +
                        "  clientX: rect.left + 50, " + // Starting point X
                        "  clientY: rect.top + 50 " +   // Starting point Y
                        "})); " +
                        // Draw top curve of 'S'
                        "canvas.dispatchEvent(new MouseEvent('mousemove', { " +
                        "  bubbles: true, " +
                        "  cancelable: true, " +
                        "  clientX: rect.left + 70, " +
                        "  clientY: rect.top + 40 " +
                        "})); " +
                        "canvas.dispatchEvent(new MouseEvent('mousemove', { " +
                        "  bubbles: true, " +
                        "  cancelable: true, " +
                        "  clientX: rect.left + 90, " +
                        "  clientY: rect.top + 50 " +
                        "})); " +
                        // Move to middle of 'S'
                        "canvas.dispatchEvent(new MouseEvent('mousemove', { " +
                        "  bubbles: true, " +
                        "  cancelable: true, " +
                        "  clientX: rect.left + 70, " +
                        "  clientY: rect.top + 60 " +
                        "})); " +
                        // Draw bottom curve of 'S'
                        "canvas.dispatchEvent(new MouseEvent('mousemove', { " +
                        "  bubbles: true, " +
                        "  cancelable: true, " +
                        "  clientX: rect.left + 50, " +
                        "  clientY: rect.top + 80 " +
                        "})); " +
                        "canvas.dispatchEvent(new MouseEvent('mouseup', { " +
                        "  bubbles: true, " +
                        "  cancelable: true " +
                        "})); " +
                        "context.stroke();", canvas
        );
        btnClearSignature.click();
        Thread.sleep(3000);
        js.executeScript(
                "var canvas = arguments[0]; " +
                        "var rect = canvas.getBoundingClientRect(); " +
                        "var context = canvas.getContext('2d'); " +
                        "context.beginPath(); " +
                        "canvas.dispatchEvent(new MouseEvent('mousedown', { " +
                        "  bubbles: true, " +
                        "  cancelable: true, " +
                        "  clientX: rect.left + 50, " +
                        "  clientY: rect.top + 50 " +
                        "})); " +
                        "canvas.dispatchEvent(new MouseEvent('mousemove', { " +
                        "  bubbles: true, " +
                        "  cancelable: true, " +
                        "  clientX: rect.left + 100, " +
                        "  clientY: rect.top + 100 " +
                        "})); " +
                        "canvas.dispatchEvent(new MouseEvent('mousemove', { " +
                        "  bubbles: true, " +
                        "  cancelable: true, " +
                        "  clientX: rect.left + 150, " +
                        "  clientY: rect.top + 50 " +
                        "})); " +
                        "canvas.dispatchEvent(new MouseEvent('mouseup', { " +
                        "  bubbles: true, " +
                        "  cancelable: true " +
                        "})); " +
                        "context.stroke();", canvas
        );
        btnSignaturePresentationSubmit.click();
        wait.until(ExpectedConditions.visibilityOf(popup.get(1)));
        softAssert.assertTrue(popupHeader.get(1).getText().contains("Success"),"After submit the sign in presentation, the popup is showing with success header");
        softAssert.assertTrue(btnPopupClose.get(1).getText().contains("Close"),"Popup button's close button label is \"Close\"");
        btnPopupClose.get(1).click();
        Thread.sleep(2000);
        btnSendPresentationEmail.click();
        wait.until(ExpectedConditions.visibilityOf(popup.get(11)));
        softAssert.assertTrue(popupHeader.get(6).getText().contains("Success"),"Presentation send email success popup header is Success");
        LocalTime currentTime2 = LocalTime.now();
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("H.mm"); // for 9.57 (24-hour format without leading zero)
        String formattedTime2 = currentTime2.format(formatter);
        Thread.sleep(5000);
        System.out.println("PLEASE CHECK THE EMAIL THAT AN PRESENTATION EMAIL HAS SENT WITH A SIGN at "+formattedTime2);
        String originalWindow = driver.getWindowHandle();

        btnViewPresentation.click();
        Thread.sleep(5000);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        softAssert.assertTrue(driver.getCurrentUrl().contains("CoreHomeFinancing/PrintPresentation?Id="+customerInfoObj.get("Customer Id").toString()),"View presentation is showing");
        driver.switchTo().window(originalWindow);

        softAssert.assertAll();
    }
    public String totalFinanceCalculate(){
        Float totalMonthly = Float.parseFloat(txtTotalMonthly.getText().replace("$","").trim());
        Float value = Float.parseFloat(driver.findElement(By.id("FinancingTerm")).getAttribute("value").trim());
        Float value2 = value/100;
//        Float result = totalMonthly/value2;
//        String totalFinance = Float.toString(result);
        return String.format("%.2f", totalMonthly / value2);
    }
    public String totalmonthlyPayment(){
        Float totalMonthly = Float.parseFloat(txtTotalMonthly.getText().replace("$","").trim());

        Float totalMonthlyMonitoring = Float.parseFloat(MonthlyMonitoringAmount.getText().replace("$","").trim());

//        Float result = totalMonthly/value2;
//        String totalFinance = Float.toString(result);
        return String.format("%.2f", totalMonthly+totalMonthlyMonitoring);
    }
}
