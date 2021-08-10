package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVariables.ExpliciteWait;

public class BasePage {
    public static WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public final By authWiget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");
/*
* Go to page use url
 */
    public void gotoURL(String url){
        driver.get(url);
    }
/*
* Wait of visibility element in dom model
 */
    public WebElement waitElementsISVisible(WebElement element){
        new WebDriverWait(driver, ExpliciteWait).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void AuthWigetPresent(){
        WebElement authFrame = driver.findElement(authWiget);
        waitElementsISVisible(authFrame);
    }
}
