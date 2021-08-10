package common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.Browser_and_Platform;
import static constants.Constant.TimeoutVariables.ImpliciteWait;

public class CommonActions {

    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (Browser_and_Platform){
            case "CHROME_WIN" :
                System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
                driver =  new ChromeDriver();
                break;
            case "CHROME_MAC" :
                System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
                driver =  new ChromeDriver();
                break;

            case "FireFox_WIN" :
                System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
                driver =  new FirefoxDriver();
                break;
            default:
                Assertions.fail("Incorrect bwrowser" + Browser_and_Platform);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ImpliciteWait, TimeUnit.SECONDS);
        return driver;
    }
}
