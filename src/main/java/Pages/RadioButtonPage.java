package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage{

    private WebElement yes;
    private WebElement impressive;
    private WebElement textYes;
    private WebElement textImpressive;
    private WebElement no;
    private WebElement textLikeThisSite;

    public RadioButtonPage(WebDriver driver, WebDriverWait wait){
        super(driver,wait);
    }

    public WebElement getYes() {
        yes = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label"));
        return yes;
    }
    public void clickOnYes(){
        getYes().click();
    }

    public WebElement getImpressive() {
        impressive = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label"));
        return impressive;
    }
    public void clickImpressive(){
        getImpressive().click();
    }

    public WebElement getTextYes(){
        textYes = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/p/span"));
        return textYes;
    }

    public WebElement getTextImpressive(){
        textImpressive = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/p/span"));
        return textImpressive;
    }
    public WebElement getNo(){
        no = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[4]/label"));
        return no;
    }
    public WebElement getTextLikeThisSite(){
        textLikeThisSite = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[1]"));
        return textLikeThisSite;
    }

}
