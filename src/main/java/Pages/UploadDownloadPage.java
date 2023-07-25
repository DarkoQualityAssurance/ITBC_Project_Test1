package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadDownloadPage extends BasePage{


    private WebElement chooseFile;
    private WebElement uploadTextConfirm;


    public UploadDownloadPage(WebDriver driver, WebDriverWait wait){
        super(driver,wait);
    }

    public WebElement getChooseFile() {
        chooseFile = getDriver().findElement(By.id("uploadFile"));
        return chooseFile;
    }

    public WebElement getUploadTextConfirm() {
        uploadTextConfirm = getDriver().findElement(By.id("uploadedFilePath"));
        return uploadTextConfirm;
    }

}