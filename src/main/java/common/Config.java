package common;

public class Config {
    /**
    * Specify the browser and platform for test:
    * CHROME_MAC
    * CHROME_WIN
     * FireFox_WIN
    **/
    public static final String Browser_and_Platform = "CHROME_WIN";
    /*
    *Clean browser cookies after each iteration
     */
    public static final Boolean CLEAR_COOKIES = true;
    /*
    * To keep browser open after all tests
     */
    public static final Boolean HOLD_BROWSER_OPEN = true;
}
