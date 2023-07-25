package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage extends BasePage{
    private WebElement colorChanged;
    private WebElement visibleAfter5Seconds;

    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public WebElement getColorChanged(){
        colorChanged = getDriver().findElement(By.xpath("//button[@id='colorChange']"));
        return colorChanged;
    }
    public WebElement getVisibleAfter5Seconds(){
        visibleAfter5Seconds = getDriver().findElement(By.xpath("//button[@id='visibleAfter']"));
        return visibleAfter5Seconds;
    }

}
