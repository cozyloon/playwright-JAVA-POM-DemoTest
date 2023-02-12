package util;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import io.github.cozyloon.EzConfig;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static util.PlaywrightSetup.browser;

public class TestBase {
    public SoftAssert softAssert;
 /*
      public BrowserContext context;
      public Page page;
 */

    @BeforeMethod
    public void beforeMethod() {
        PlaywrightSetup.launchPlaywright();
        // this.page = browser.newPage();
    }

    @AfterMethod
    public void afterMethod() {
        PlaywrightSetup.closePlaywright();
    }

    @BeforeTest
    public void beforeTest() {
        EzConfig.logINFO("TestClass Running" + getClass().toString());
        this.softAssert = new SoftAssert();
    }
}
