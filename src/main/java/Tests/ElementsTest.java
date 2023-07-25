package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {

    @BeforeMethod
    public void beforeAll() {
        getIndexPage().clickOnElementsCard();
    }


    @Test
    public void verifyTextBoxFiledsShown() {
        getElementsPage().clickOnTextBox();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://demoqa.com/text-box"));
    }


    @Test
    public void verifyCheckBoxFiledsShown() {
        getElementsPage().clickOnCheckBox();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://demoqa.com/checkbox"));
    }


    @Test
    public void verifyRadiButtonFiledShown() {
        getElementsPage().clickOnRadioButton();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://demoqa.com/radio-button"));
    }


    @Test
    public void verifyButtonFiledShown() {
        scrollToElement(getElementsPage().getButtonsField());
        getElementsPage().clickOnButtonField();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://demoqa.com/buttons"));
    }
}
