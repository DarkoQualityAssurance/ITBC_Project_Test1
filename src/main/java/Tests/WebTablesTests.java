package Tests;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTablesTests extends BaseTest{

    @BeforeMethod
    public void beforeAll() {
        getIndexPage().clickOnElements();
        getElementsPage().clickOnWebTables();
    }
    @Test(priority = 1)
    public void verifyRegistrationFormShown(){
        getWebTablesPage().clickOnAdd();
        Assert.assertTrue(getWebTablesPage().getRegistrationForm().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyInputInADDRegistrationForm(){
        getWebTablesPage().clickOnAdd();
        getWebTablesPage().getFirstNameRegForm().sendKeys("Marko");
        getWebTablesPage().getLastNameRegForm().sendKeys("Markovic");
        getWebTablesPage().getEmailRegForm().sendKeys("marko82@gmail.com");
        getWebTablesPage().getAgeRegForm().sendKeys("39");
        getWebTablesPage().getSalaryRegForm().sendKeys("200");
        getWebTablesPage().getDepartmentRegForm().sendKeys("IT");
        getWebTablesPage().clickOnSubmitRegForm();
        Assert.assertTrue(getWebTablesPage().getNewRowAdd().isDisplayed());
    }
    @Test(priority = 3)
    public void verifyRowWasDeleted(){
        getWebTablesPage().clickOnDeleteRow();
        Assert.assertTrue(getWebTablesPage().getDeleteRow().isDisplayed(),"Element is not displayed!");
    }
    @Test(priority = 4)
    public void verifyResizeFiledMoving(){
        getWebTablesPage().clickOnResizeMove();
        Actions actions = new Actions(getDriver());
        Point position = getWebTablesPage().getResizerMove().getLocation();
        int initialX = position.getX();
        int initialY = position.getY();
        actions.clickAndHold(getWebTablesPage().getResizerMove());
        actions.moveByOffset(100,0);
        actions.release();
        actions.perform();
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        actions.clickAndHold(getWebTablesPage().getResizerMove());
        actions.moveByOffset(-70,0);
        actions.release();
        actions.perform();
        Point position2 = getWebTablesPage().getResizerMove().getLocation();
        int endZ = position2.getX();
        int endI = position2.getY();
        Assert.assertNotEquals(initialX,endZ);

    }

    @Test(priority = 5)
    public void verifyEditFunction(){
        getWebTablesPage().clickOnEditAction();
        getWebTablesPage().getFirstNameRegForm().clear();
        getWebTablesPage().getFirstNameRegForm().sendKeys("Nikola");
        getWebTablesPage().clickOnSubmitRegForm();
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        Assert.assertEquals(getWebTablesPage().getChangedFirstName().getText(),"Nikola");

    }

}
