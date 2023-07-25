package Tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @BeforeMethod
    public void beforeAllHeare() {
        getWait().until(ExpectedConditions.elementToBeClickable(getIndexPage().getElementsCard()));
        getIndexPage().clickOnElements();
        getElementsPage().clickOnCheckBox();
    }


    @Test
    public void verifyArrowSignDoList() {
        getWait().until(ExpectedConditions.elementToBeClickable(getCheckBoxPage().getRightArrow()));
        getCheckBoxPage().clickOnRightArrow();
        boolean isClicked = true;
        Assert.assertTrue(isClicked, "Arrow sign is clicked!");
    }


    @Test
    public void verifyCubeBoxCheck() {
        getCheckBoxPage().clickOnCubeCheckBox();
        boolean isCliked = true;
        Assert.assertTrue(isCliked, "Cube box is checked !");
    }


    @Test
    public void verifyPlusSignWork() {
        getCheckBoxPage().clickOnPlusSign();
        boolean isWork = true;
        Assert.assertTrue(isWork, "Plus sign listed  !");
    }
}
