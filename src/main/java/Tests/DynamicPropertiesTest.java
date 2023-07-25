package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicPropertiesTest extends BaseTest{
    @BeforeMethod
    public void beforeAll() {
        getIndexPage().clickOnElements();
        scrollToElement(getElementsPage().getDynamicProperties());
        getElementsPage().clickOnDynamicProperties();
    }
    @Test
    public void verifyColorChange(){
        String colorInitial = getDynamicPropertiesPage().getColorChanged().getCssValue("color");
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(
                getDynamicPropertiesPage().getColorChanged(), "color", colorInitial)));
        String colorFinal = getDynamicPropertiesPage().getColorChanged().getCssValue("color");
        assert !colorInitial.equals(colorFinal);
    }
    @Test
    public void verifyButtonShownAfter5Seconds(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
        Assert.assertTrue(getDynamicPropertiesPage().getVisibleAfter5Seconds().isDisplayed());
    }

}
