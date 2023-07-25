package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage{

    private WebElement logo;
    private WebElement selenuimCertificateImage;
    private WebElement elementsCard;
    private WebElement formCard;
    private WebElement alertsFrameWindowsCard;

    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }
        public WebElement getLogo(){
            logo = getDriver().findElement(By.xpath("//*[@id='app']/header/a/img"));
            return logo;
        }
        public void clickOnLogo(){
        getLogo().click();
        }

        public void open(){
        getDriver().get("https://demoqa.com/");
        }

        public WebElement getSelenuimCertificateImage(){
        selenuimCertificateImage = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[1]/a/img"));
        return selenuimCertificateImage;
        }
        public void clickOnSeleniumCert(){
        getSelenuimCertificateImage().click();
        }

        public WebElement getElementsCard(){
        elementsCard = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]"));
        return elementsCard;
        }
        public void clickOnElementsCard(){
        getElementsCard().click();
        }
        public void clickOnElements(){
        getElementsCard().click();
        }
        public WebElement getFormCard(){
        formCard = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[2]"));
        return formCard;
        }
        public void clickOnFormCard(){
        getFormCard().click();
        }
        public WebElement getAlertsFrameWindowsCard(){
        alertsFrameWindowsCard = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[3]"));
        return alertsFrameWindowsCard;
        }
        public void clickOnAlertsFrameWindowsCard(){
        getAlertsFrameWindowsCard().click();
        }


    }

