package Runners;

import Config.Setup;
import Pages.Login;
import Pages.addtech;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class addtechRunner extends Setup {
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
        addtech addtech = new addtech(driver);
        addtech.test();
        softAssert.assertAll();
    }
}
