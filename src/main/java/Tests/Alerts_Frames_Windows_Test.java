package Tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts_Frames_Windows_Test extends BaseTest{

    @BeforeMethod
    public void beforeMethodes(){
        getIndexPage().clickOnAlertsFrameWindowsCard();
        scrollToElement(getAlertsFramesWindowsPage().getAlertsCard());
        getAlertsFramesWindowsPage().clickOnAlertCard();
    }

    @Test
    public void verifyConfirmActionWorking(){
        getAlertsFramesWindowsPage().clickOnConfirmBoxAppear();
        getDriver().switchTo().alert().accept();
        Assert.assertEquals(getAlertsFramesWindowsPage().getConfirmMessage().getText(),"You selected Ok");
    }
    @Test
    public void verifyAlertHasShown(){
        getAlertsFramesWindowsPage().clickOnToSeeAleart();
        Assert.assertEquals(getDriver().switchTo().alert().getText(), "You clicked a button");
        getDriver().switchTo().alert().dismiss();
    }
    @Test
    public void verifyConfirmBoxWillAppear(){
        getAlertsFramesWindowsPage().clickOnConfirmBoxAppear();
        getDriver().switchTo().alert();
        Assert.assertEquals(getDriver().switchTo().alert().getText(),"Do you confirm action?");
        getDriver().switchTo().alert().dismiss();
    }
    @Test
    public void verifyAlertWillAppearAfter5sec(){
        getAlertsFramesWindowsPage().clickOnAlertAppearAfter5Sec();
        getWait().until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(getDriver().switchTo().alert().getText(),"This alert appeared after 5 seconds");
        getDriver().switchTo().alert().dismiss();
    }
    @Test
    public void verifyPromptBoxApear(){
        getAlertsFramesWindowsPage().clickOnPromptBoxApear();
        Assert.assertEquals(getDriver().switchTo().alert().getText(),"Please enter your name");
        getDriver().switchTo().alert().dismiss();
    }

    @Test
    public void verifyPromptBoxTextInputed(){
        getAlertsFramesWindowsPage().clickOnPromptBoxApear();
        getDriver().switchTo().alert().sendKeys("Milos");
        getDriver().switchTo().alert().accept();
        Assert.assertEquals(getAlertsFramesWindowsPage().getPromptInputShown().getText(),"You entered Milos");
    }
}
