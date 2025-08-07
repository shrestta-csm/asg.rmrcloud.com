package Runners;

import Config.Setup;
import Pages.CustomersPage;
import Pages.Login;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;


public class submitToAQUA extends Setup {
    @Test(priority = 1)
    public void loginWithValidCredentials() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.findElement(By.className("panel-title")).getText().contains("Please Sign In"), "Login page is showing the please sign in title");
        softAssert.assertTrue(driver.findElement(By.id("UserName")).getAttribute("placeholder").contains("Username"), "Username placeholder is showing properly");
        softAssert.assertTrue(driver.findElement(By.id("Password")).getAttribute("placeholder").contains("Password"), "Password placeholder is showing properly");
        softAssert.assertTrue(driver.findElement(By.tagName("label")).getText().contains("Remember Me"), "\"Remember Me\" is showing");
        softAssert.assertTrue(driver.findElement(By.tagName("span")).getText().contains("Forgot your password? Click "), "Forgot password is showing properly");
        softAssert.assertTrue(driver.findElement(By.id("BtnLogin")).getAttribute("value").contains("Log in"), "Login button name is Log in");

        Login login = new Login(driver);
//        login.Login("administrator", "RMRCloudTheNO1CM$");
        login.Login("qaadmin", "RMRCloudTheNO1CM$");
        softAssert.assertTrue(driver.getCurrentUrl().contains("asg.rmrcloud.com/dashboard"), "Dashboard URL is correct");
        softAssert.assertTrue(driver.findElement(By.className("page-header")).getText().contains("Dashboard"), "Dashboard title is showing");
        softAssert.assertAll();
    }
    @Test(priority = 2)
    public void insertQualifyinfo() throws InterruptedException, IOException, ParseException {
        SoftAssert softAssert =new SoftAssert();
        CustomersPage customersPage = new CustomersPage(driver);
        customersPage.clickCustomersNav();
        String logtime = customersPage.clickNewCusButton();
        customersPage.insertQualifyInfos("7604","0","Euless","TX","4/1/56","100000102","8004444444","shrestta.qa@gmail.com");
//        System.out.println("Creation tym from edit= "+logtime);
//        System.out.println("Creation time from overview = "+driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Creation Date')]/following-sibling::td")).getText());
        softAssert.assertTrue(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Creation Date')]/following-sibling::td")).getText().contains(logtime),"Customer creation time is not showing right");
        softAssert.assertTrue(driver.getCurrentUrl().contains("asg.rmrcloud.com/customer-details/?id="),"Customer details url is showing properly");
        softAssert.assertTrue(driver.getCurrentUrl().split("=")[1].trim().contains(driver.findElement(By.xpath("//tr[contains(@class,'info-table-tr')]/td[contains(text(),'Id')]/following-sibling::td")).getText()),"Customer id is showing");
        Thread.sleep(2000);
        customersPage.clickEditCustomerDetails();
        softAssert.assertTrue(driver.findElement(By.id("CoreHomeCoApplicant_Street")).getAttribute("value").contains(""),"Co-Applicant's Street field is blank initially");
        softAssert.assertTrue(driver.findElement(By.id("CoreHomeCoApplicant_ZipCode")).getAttribute("value").contains(""),"Co-Applicant's ZipCode field is blank initially");
        softAssert.assertTrue(driver.findElement(By.id("CoreHomeCoApplicant_City")).getAttribute("value").contains(""),"Co-Applicant's City field is blank initially");
        softAssert.assertTrue(driver.findElement(By.id("CoreHomeCoApplicant_State")).getAttribute("value").contains(""),"Co-Applicant's State field is blank initially");
        //customersPage.insertCOAppinfo("Test","Alex","Zabir","CT Royers Road","7605","Euless","NY","10/2/1988","100000105","6003434343","9999888898","shrestta.piistech@gmail.com");
        softAssert.assertAll();
    }
    @Test(priority = 3)
    public void insertProposal() throws InterruptedException, ParseException, IOException {
        SoftAssert softAssert = new SoftAssert();
        CustomersPage customersPage =new CustomersPage(driver);
        customersPage.createProposal("14","4");
    }

}
