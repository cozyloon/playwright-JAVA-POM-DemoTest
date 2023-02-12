package util;

import com.microsoft.playwright.*;

public class PlaywrightSetup {
    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;


    public static void launchPlaywright() {
        playwright = Playwright.create();
        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions();
        launchOptions.setHeadless(false);
        launchOptions.setChannel("chrome");
        launchOptions.setSlowMo(50);
        browser = playwright.chromium().launch(launchOptions);
        page = browser.newPage();
    }


    public static void closePlaywright() {
        playwright.close();
    }
}
