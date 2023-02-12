package pages;

import com.microsoft.playwright.Locator;

import static util.PlaywrightSetup.page;

public class EditPage {
    private String txtBox1 = "id=fullName";
    private String txtBox2 = "id=join";
    private String txtBox3 = "id=getMe";
    private String txtBox4 = "id=clearMe";
    private String txtBox5 = "id=noEdit";
    private String txtBox6 = "id=dontwrite";

    public void typeValuesForTxtBox1(String value) {
        page.locator(txtBox1).type(value);
    }

    public void fillValuesForTxtBox2(String value) {
        page.locator(txtBox2).fill(value);
    }

    public void interactWithTxtBox3(String value) {
        Locator locator = page.locator(txtBox3);
        locator.press("End");
        locator.type(value);
        locator.press("Tab");
    }

    public void clearTxtBox4() {
        page.locator(txtBox4).clear();
    }

    public boolean checkTxtBox5IsEnabled() {
        return page.locator(txtBox5).isEnabled();
    }

    public String getTxtBox6Value() {
        return page.locator(txtBox6).getAttribute("value");
    }
}
