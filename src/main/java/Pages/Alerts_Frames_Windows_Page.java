package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_Frames_Windows_Page extends BasePage{

    private WebElement toSeeAlert;
    private WebElement alertAppearAfter5sec;
    private WebElement confirmBoxAppear;
    private WebElement promptBoxAppear;
    private WebElement alertsCard;
    private WebElement confirmMessage;
    private WebElement promptInputShown;


    public Alerts_Frames_Windows_Page(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public WebElement getToSeeAlert(){
        toSeeAlert = getDriver().findElement(By.xpath("//button[@id='alertButton']"));
        return toSeeAlert;
    }
    public void clickOnToSeeAleart(){
        getToSeeAlert().click();
    }
    public WebElement getAlertAppearAfter5sec(){
        alertAppearAfter5sec = getDriver().findElement(By.xpath("//button[@id='timerAlertButton']"));
        return alertAppearAfter5sec;
    }
    public void clickOnAlertAppearAfter5Sec(){
        getAlertAppearAfter5sec().click();
    }
    public WebElement getConfirmBoxAppear(){
        confirmBoxAppear = getDriver().findElement(By.xpath("//button[@id='confirmButton']"));
        return confirmBoxAppear;
    }
    public void clickOnConfirmBoxAppear(){
        getConfirmBoxAppear().click();
    }
    public WebElement getPromptBoxAppear(){
        promptBoxAppear = getDriver().findElement(By.xpath("//button[@id='promtButton']"));
        return promptBoxAppear;
    }
    public void clickOnPromptBoxApear(){
        getPromptBoxAppear().click();
    }
    public WebElement getAlertsCard(){
        alertsCard = getDriver().findElement(By.cssSelector("div.show li#item-1"));
        return alertsCard;
    }
    public void clickOnAlertCard(){
        getAlertsCard().click();
    }
    public WebElement getConfirmMessage(){
        confirmMessage = getDriver().findElement(By.xpath("//span[@id='confirmResult']"));
        return confirmMessage;
    }
    public WebElement getPromptInputShown(){
        promptInputShown = getDriver().findElement(By.xpath("//span[@id='promptResult']"));
        return promptInputShown;
    }
}
