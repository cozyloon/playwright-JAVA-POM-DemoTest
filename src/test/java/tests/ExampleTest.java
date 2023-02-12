package tests;

import function.Edit;
import org.testng.annotations.Test;
import util.TestBase;

import static util.PlaywrightSetup.*;

public class ExampleTest extends TestBase {

    @Test(priority = 1)
    public void testHandlingTextBoxes() {
        page.navigate("https://letcode.in/edit");
        Edit.sendValuesForTextBoxes("chathumal", "sangeeth", "test");
        boolean b = Edit.checkTextBoxIsEnabled();
        softAssert.assertEquals(b, false, "TextBox not Disabled");

        String textBoxValue = Edit.getTextBoxValue();
        softAssert.assertEquals(textBoxValue, "This text is readonly", "TextBox value not matched");

        softAssert.assertAll();
    }
}
