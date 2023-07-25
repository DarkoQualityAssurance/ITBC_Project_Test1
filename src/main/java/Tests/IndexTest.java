package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;


public class IndexTest extends BaseTest {

    @Test
    public void verifyLogoOpenIndexPage() {
        getIndexPage().clickOnLogo();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://demoqa.com/"));
    }

    @Test
    public void verifySeleniumCertificateTrainingOpenfPage() {
        String originalWindow = getDriver().getWindowHandle();
        getIndexPage().clickOnSeleniumCert();
        getWait().until(numberOfWindowsToBe(2));
        for (String windowHandle : getDriver().getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                getDriver().switchTo().window(windowHandle);
                break;
            }
        }
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://www.toolsqa.com/selenium-training/"));
    }


    @Test
    public void verifyElementCardOpenPage() {
        getIndexPage().clickOnElements();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://demoqa.com/elements"));
    }


    @Test
    public void verifyFormCardOpenPage() {
        getIndexPage().clickOnFormCard();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://demoqa.com/forms"));
    }


    @Test
    public void verifyAlertsFrameWindowsCard() {
        getIndexPage().clickOnAlertsFrameWindowsCard();
        Assert.assertTrue(getDriver().getCurrentUrl().equals("https://demoqa.com/alertsWindows"));
    }
}
