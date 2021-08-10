package pages.telecommunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {
    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private static final By buttonWallet = By.xpath("//div[contains(text(),'My wallet')]");
    public static void selectCardfromWallet() {
        driver.findElement(buttonWallet).click();
    }
}
