package Tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @BeforeMethod
    public void beforeAllThis() {
        getWait().until(ExpectedConditions.elementToBeClickable(getIndexPage().getElementsCard()));
        getIndexPage().clickOnElements();
        getElementsPage().clickOnRadioButton();
    }


    @Test
    public void verifyRadioButtonYes() {
        getWait().until(ExpectedConditions.elementToBeClickable(getRadioButtonPage().getYes()));
        getRadioButtonPage().clickOnYes();
        Assert.assertTrue(getRadioButtonPage().getTextYes().isDisplayed(), "Confirmation is not displayed");
    }


    @Test
    public void verifyRadioButtonImpressive() {
        getWait().until(ExpectedConditions.elementToBeClickable(getRadioButtonPage().getImpressive()));
        getRadioButtonPage().clickImpressive();
        Assert.assertTrue(getRadioButtonPage().getTextImpressive().isDisplayed(), "Confirmation is not displayed");
    }


    @Test
    public void verifyRadioButtonNo() {
        boolean isClikable = getRadioButtonPage().getNo().isEnabled();
        Assert.assertTrue(isClikable, " \"No\" radio button is not clickable");
    }


    @Test
    public void verifuIsTextDoYouLikeThisSiteShown() {
        Assert.assertTrue(getRadioButtonPage().getTextLikeThisSite().isDisplayed(), "Confirmation is not displayed");
    }
}
