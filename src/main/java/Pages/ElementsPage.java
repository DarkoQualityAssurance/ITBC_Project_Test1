package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends BasePage{

    private WebElement textBoxFields;
    private WebElement checkBoxField;
    private WebElement radioButtonFiled;
    private WebElement buttonsField;
    private WebElement uploadDownload;
    private WebElement webTables;
    private WebElement dynamicProperties;
    public ElementsPage(WebDriver driver,WebDriverWait wait){
        super(driver, wait);
    }

    public WebElement getTextBoxFields(){
        textBoxFields = getDriver().findElement(By.xpath("//*[@id='item-0']"));
        return textBoxFields;
    }
    public void clickOnTextBox(){
        getTextBoxFields().click();
    }

    public WebElement getCheckBoxField(){
        checkBoxField = getDriver().findElement(By.xpath("//*[@id='item-1']"));
        return checkBoxField;
    }
    public void clickOnCheckBox(){
        getCheckBoxField().click();
    }

    public WebElement getRadioButtonFiled(){
        radioButtonFiled = getDriver().findElement(By.xpath("//*[@id='item-2']"));
        return radioButtonFiled;
    }
    public void clickOnRadioButton(){
        getRadioButtonFiled().click();
    }

    public WebElement getButtonsField() {
        buttonsField = getDriver().findElement(By.xpath("//li[@id='item-4']"));
        return buttonsField;
    }
    public void clickOnButtonField(){
        getButtonsField().click();
    }
    public WebElement getUploadDownload() {
        uploadDownload = getDriver().findElement(By.xpath("//*[@id='item-7']"));
        return uploadDownload;
    }
    public void clickOnUploadDownload(){
        getUploadDownload().click();
    }
    public WebElement getWebTables(){
        webTables = getDriver().findElement(By.xpath("//li[@id='item-3']"));
        return webTables;
    }
    public void clickOnWebTables(){
        getWebTables().click();
    }
    public WebElement getDynamicProperties(){
        dynamicProperties = getDriver().findElement(By.xpath("//li[@id='item-8']"));
        return dynamicProperties;
    }
    public void clickOnDynamicProperties(){
        getDynamicProperties().click();
    }

}
