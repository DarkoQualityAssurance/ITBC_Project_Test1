package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage{

    private WebElement doubleClickButton;
    private WebElement rightClickButton;
    private WebElement clickMeButton;
    private WebElement confirmationTextDoubleClick;
    private WebElement confirmationRightClick;
    private WebElement confirmationClckMe;

    public ButtonsPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public WebElement getDoubleClickButton() {
        doubleClickButton = getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickButton;
    }

    public WebElement getRightClickButton() {
        rightClickButton = getDriver().findElement(By.xpath("//button[@id='rightClickBtn']"));
        return rightClickButton;
    }

    public WebElement getClickMeButton() {
        clickMeButton = getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
        return clickMeButton;
    }
    public void clickOnClickMe(){
        getClickMeButton().click();
    }

    public WebElement getConfirmationTextDoubleClick() {
        confirmationTextDoubleClick = getDriver().findElement(By.id("doubleClickMessage"));
        return confirmationTextDoubleClick;
    }

    public WebElement getConfirmationRightClick() {
        confirmationRightClick = getDriver().findElement(By.id("rightClickMessage"));
        return confirmationRightClick;
    }

    public WebElement getConfirmationClckMe() {
        confirmationClckMe = getDriver().findElement(By.id("dynamicClickMessage"));
        return confirmationClckMe;
    }
}
