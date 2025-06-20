package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "UserName")
    WebElement txtUsername;
    @FindBy(id = "Password")
    WebElement txtPassword;
    @FindBy(id = "Remember")
    WebElement checkBoxRemember;
    @FindBy(id = "BtnLogin")
    WebElement btnLogin;

    public void Login(String username, String password) throws InterruptedException {
        txtUsername.click();
        txtUsername.sendKeys(username);
        txtPassword.click();
        txtPassword.sendKeys(password);
        checkBoxRemember.click();
        btnLogin.click();
        Thread.sleep(4000);
    }

}
