package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage{

    private WebElement rightArrow;
    private WebElement cubeCheckBox;
    private WebElement plusSign;


    public CheckBoxPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public WebElement getRightArrow(){
        rightArrow = getDriver().findElement(By.xpath("//button[@title='Toggle']"));
        return rightArrow;
    }
    public void clickOnRightArrow(){
        getRightArrow().click();
    }

    public WebElement getCubeCheckBox() {
        cubeCheckBox = getDriver().findElement(By.xpath("//span[@class='rct-checkbox']"));
        return cubeCheckBox;
    }
    public void clickOnCubeCheckBox(){
        getCubeCheckBox().click();
    }
    public WebElement getPlusSign(){
        plusSign = getDriver().findElement(By.xpath("//button[@title='Expand all']"));
        return plusSign;
    }
    public void clickOnPlusSign(){
        getPlusSign().click();
    }

}
