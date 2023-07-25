package Tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TextBoxTest extends BaseTest {


    @BeforeMethod
    public void beforeAllTestInThisClass() {
        getWait().until(ExpectedConditions.elementToBeClickable(getIndexPage().getElementsCard()));
        getIndexPage().clickOnElements();
        getElementsPage().clickOnTextBox();
    }


    @Test(dataProvider = "testFullName")
    public void verifyFullNameEnter(String name){
        getTextBoxPage().nameEnter(name);
        getTextBoxPage().emailEnter("proba@gmail.com");
        getTextBoxPage().curentAddressEnter("Milosa Velikog 15");
        getTextBoxPage().permanentAddressEnter("KraljaPetra12");
        scrollToElement(getTextBoxPage().getSubmitButton());
        getTextBoxPage().clickOnSubmitButton();
        Assert.assertTrue(getTextBoxPage().getSubmitConfirm().isDisplayed(), "Confirmation is not displayed");
    }

    @DataProvider(name = "testFullName")
    public Object[][] testFullName() {

        return new Object[][]{
                {"Marko Markovic"}, {"marko markovic"}, {"marko"}, {"MARKO"},
                {"Marko 123"}, {" "}, {"123"}, {"-1"},
                {"Marko@"}, {"Miloš Ćirović"}
        };
    }


    @Test
    public void verifyFullNameInputFromExcel() throws IOException {
        getTextBoxPage().fullNameFromExcel();
    }


    @Test
    public void verifyCorrectEmailinput() {
        getTextBoxPage().nameEnter("Marko Markovic");
        getTextBoxPage().emailEnter("marko80@gmail.com");
        getTextBoxPage().curentAddressEnter("Milosa Velikog 15");
        getTextBoxPage().permanentAddressEnter("KraljaPetra12");

        scrollToElement(getTextBoxPage().getSubmitButton());
        getTextBoxPage().getSubmitButton().click();
        Assert.assertTrue(getTextBoxPage().getSubmitConfirm().isDisplayed(), "Confirmation is not displayed");
    }


    @Test(dataProvider = "addNotAllowedCharacters", dependsOnMethods = "verifyCorrectEmailinput")
    public void verifyWrongEmailinput(char addNotAllowedCharacters) {
        String corectEmail = "marko@gmail.com";
        String putingTestCharacterInCorrectEmail = corectEmail.replace('r', addNotAllowedCharacters);

        getTextBoxPage().nameEnter("Marko Markovic");
        getTextBoxPage().emailEnter(putingTestCharacterInCorrectEmail);
        getTextBoxPage().curentAddressEnter("Milosa Velikog 15");
        getTextBoxPage().permanentAddressEnter("KraljaPetra12");

        scrollToElement(getTextBoxPage().getSubmitButton());
        getTextBoxPage().getSubmitButton().click();
        Assert.assertTrue(!getTextBoxPage().getSubmitConfirm().isDisplayed(), "Confirmation is not displayed");
    }


    @DataProvider(name = "addNotAllowedCharacters")
    public Object[][] testingSample() {
        return new Object[][]{
                {'!'}, {'#'}, {'$'}, {'%'}, {'^'}, {'&'},
                {'*'}, {'-'}, {'='}, {'+'}, {'{'}, {'}'},
                {'|'}, {' '}
        };
    }


    @Test(dataProvider = "testCurentAddress")
    public void verifyCurentAddress(String name) {
        getTextBoxPage().curentAddressEnter(name);
        scrollToElement(getTextBoxPage().getSubmitButton());
        getTextBoxPage().getSubmitButton().click();
        Assert.assertTrue(getTextBoxPage().getSubmitConfirm().isDisplayed(), "Confirmation is not displayed");
    }

    @DataProvider(name = "testCurentAddress")
    public Object[][] testCurentAddressEntry() {

        return new Object[][]{
                {"Milosa Velikog 15"}, {"KraljaPetra12"}, {"123Saa"},
                {"**%Fruskogorska"}
        };
    }


    @Test(dataProvider = "testPermanenetAddress")
    public void verifyPermanentAddress(String name) {
        getTextBoxPage().permanentAddressEnter(name);
        scrollToElement(getTextBoxPage().getSubmitButton());
        getTextBoxPage().getSubmitButton().click();
        Assert.assertTrue(getTextBoxPage().getSubmitConfirm().isDisplayed(), "Confirmation is not displayed");
    }


    @DataProvider(name = "testPermanenetAddress")
    public Object[][] testPermanentAddressEntry() {

        return new Object[][]{
                {"Milosa Velikog 15 "}, {"KraljaPetra12"}, {"123Saa"},
                {"**%Fruskogorska"}
        };
    }


    @Test
    public void submitEnter() {
        scrollToElement(getTextBoxPage().getSubmitButton());
        getTextBoxPage().getSubmitButton().click();
    }

}

