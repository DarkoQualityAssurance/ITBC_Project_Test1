package Pages;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;

public class TextBoxPage extends BasePage{

    private WebElement fullName;
    private WebElement email;
    private WebElement curentAddress;
    private WebElement permanentAddress;
    private WebElement submitButton;
    private WebElement submitConfirm;


    public TextBoxPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public WebElement getfullName(){
        fullName = getDriver().findElement(By.id("userName"));
        return fullName;
    }
    public void nameEnter(String name){
        getfullName().sendKeys(name);
    }

    public WebElement getEmail() {
        email = getDriver().findElement(By.id("userEmail"));
        return email;
    }
    public void emailEnter(String name){
        getEmail().sendKeys(name);
    }

    public WebElement getCurentAddress() {
        curentAddress = getDriver().findElement(By.id("currentAddress"));
        return curentAddress;
    }
    public void curentAddressEnter(String name){
        getCurentAddress().sendKeys(name);
    }

    public WebElement getPermanentAddress() {
        permanentAddress = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddress;
    }
    public void permanentAddressEnter(String name){
        getPermanentAddress().sendKeys(name);
    }

    public WebElement getSubmitButton() {
        submitButton = getDriver().findElement(By.id("submit"));
        return submitButton;
    }
    public void clickOnSubmitButton(){
        getSubmitButton().click();
    }
    public WebElement getSubmitConfirm(){
        submitConfirm = getDriver().findElement(By.xpath("//*[@id='output']/div"));
        return submitConfirm;
    }
    public void fullNameFromExcel() throws IOException {
        FileInputStream inputStream = new FileInputStream("ITBC_project_DarkoDjekic.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(1);
        XSSFRow row = sheet.getRow(50);
        XSSFCell cell = row.getCell(2);
        String fullName = cell.getStringCellValue();
        getfullName().sendKeys(fullName);
    }
}
