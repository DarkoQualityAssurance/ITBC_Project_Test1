package Tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ButtonTest extends BaseTest {
    @BeforeMethod
    public void beforeAll() {
        getIndexPage().clickOnElements();
    }

    @Test
    public void verifyDoubleClickButton() {
        scrollToElement(getElementsPage().getButtonsField());
        getElementsPage().clickOnButtonField();
        Actions actions = new Actions(getDriver());
        actions.doubleClick(getButtonsPage().getDoubleClickButton()).perform();
        Assert.assertTrue(getButtonsPage().getConfirmationTextDoubleClick().isDisplayed());
    }


    @Test
    public void verifyRightClcikButton() {
        scrollToElement(getElementsPage().getButtonsField());
        getElementsPage().clickOnButtonField();
        scrollToElement(getButtonsPage().getRightClickButton());
        Actions actions = new Actions(getDriver());
        actions.contextClick(getButtonsPage().getRightClickButton()).perform();
        Assert.assertTrue(getButtonsPage().getConfirmationRightClick().isDisplayed());
    }


    @Test
    public void verifyClickMeButton() {
        scrollToElement(getElementsPage().getButtonsField());
        getElementsPage().clickOnButtonField();
        scrollToElement(getButtonsPage().getClickMeButton());
        getButtonsPage().clickOnClickMe();
        Assert.assertTrue(getButtonsPage().getConfirmationClckMe().isDisplayed());
    }
}
