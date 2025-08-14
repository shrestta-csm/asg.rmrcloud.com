package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static Config.Setup.driver;

public class addtech {
    public addtech(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void test() throws InterruptedException {
        driver.findElements(By.className("dropdown-toggle")).get(0).click();
        Thread.sleep(2000);
        driver.findElement(By.id("LoadUserMgmt")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("AddNewManufacturer")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='PermissionGroupDiv']/h5[text()='Technician']")).click();
        driver.findElement(By.id("NextBtn")).click();

    }
}
