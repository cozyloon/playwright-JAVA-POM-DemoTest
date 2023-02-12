package function;

import pages.EditPage;

public class Edit {
    static EditPage editPage = new EditPage();

    public static void sendValuesForTextBoxes(String value1, String value2, String value3) {
        editPage.typeValuesForTxtBox1(value1);
        editPage.fillValuesForTxtBox2(value2);
        editPage.interactWithTxtBox3(value3);
        editPage.clearTxtBox4();
        editPage.checkTxtBox5IsEnabled();
        editPage.getTxtBox6Value();
    }

    public static boolean checkTextBoxIsEnabled() {
        return editPage.checkTxtBox5IsEnabled();
    }

    public static String getTextBoxValue() {
        return editPage.getTxtBox6Value();
    }
}
