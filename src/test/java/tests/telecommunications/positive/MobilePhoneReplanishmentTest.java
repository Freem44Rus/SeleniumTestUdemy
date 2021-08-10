package tests.telecommunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.URLS.MOBILE_PAYMENT_URL;

public class MobilePhoneReplanishmentTest extends BaseTest {
    @Test
    public void checkisredirectauth(){
        basePage.gotoURL(MOBILE_PAYMENT_URL);
    }
}
