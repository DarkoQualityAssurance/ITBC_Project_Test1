package Tests;

import Pages.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private IndexPage indexPage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;
    private JavascriptExecutor jsExecutor;
    private CheckBoxPage checkBoxPage;
    private RadioButtonPage radioButtonPage;
    private ButtonsPage buttonsPage;
    private UploadDownloadPage uploadDownloadPage;
    private WebTablesPage webTablesPage;
    private DynamicPropertiesPage dynamicPropertiesPage;

    private Alerts_Frames_Windows_Page alertsFramesWindowsPage;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public IndexPage getIndexPage() {
        return indexPage;
    }

    public ElementsPage getElementsPage() {
        return elementsPage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }

    public void scrollToElement(WebElement element) {
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public UploadDownloadPage getUploadDownloadPage() {
        return uploadDownloadPage;
    }

    public WebTablesPage getWebTablesPage() {
        return webTablesPage;
    }

    public DynamicPropertiesPage getDynamicPropertiesPage() {
        return dynamicPropertiesPage;
    }
    public Alerts_Frames_Windows_Page getAlertsFramesWindowsPage(){
        return alertsFramesWindowsPage;
    }


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Laptop//Desktop//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        indexPage = new IndexPage(driver, wait);
        elementsPage = new ElementsPage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);
        jsExecutor = (JavascriptExecutor) driver;
        checkBoxPage = new CheckBoxPage(driver, wait);
        radioButtonPage = new RadioButtonPage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        uploadDownloadPage = new UploadDownloadPage(driver, wait);
        webTablesPage = new WebTablesPage(driver, wait);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wait);
        alertsFramesWindowsPage = new Alerts_Frames_Windows_Page(driver,wait);
    }

    @BeforeMethod
    public void firstToDo(){
        getDriver().manage().window().maximize();
        getIndexPage().open();
    }

    @AfterClass
    public void endProgram() {
//        getDriver().close();
    }
}
