package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebTablesPage extends BasePage{

    private WebElement addEmployee;
    private WebElement editAction;
    private WebElement registrationForm;
    private WebElement firstNameRegForm;
    private WebElement lastNameRegForm;
    private WebElement emailRegForm;
    private WebElement ageRegForm;
    private WebElement salaryRegForm;
    private WebElement departmentRegForm;
    private WebElement submitRegForm;
    private WebElement newRowAdd;
    private WebElement deleteRow;
    private WebElement resizerMove;
    private WebElement changedFirstName;



    public WebTablesPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public WebElement getAddEmployee(){
        addEmployee = getDriver().findElement(By.id("addNewRecordButton"));
        return addEmployee;
    }
    public void clickOnAdd(){
        getAddEmployee().click();
    }

    public WebElement getEditAction(){
        editAction = getDriver().findElement(By.id("edit-record-1"));
        return editAction;
    }
    public void clickOnEditAction(){
        getEditAction().click();
    }

    public WebElement getRegistrationForm(){
        registrationForm = getDriver().findElement(By.xpath("/html/body/div[5]/div/div"));
        return registrationForm;
    }
    public WebElement getFirstNameRegForm(){
        firstNameRegForm = getDriver().findElement(By.xpath("//input[@id='firstName']"));
        return firstNameRegForm;
    }
    public WebElement getLastNameRegForm(){
        lastNameRegForm = getDriver().findElement(By.xpath("//input[@id='lastName']"));
        return lastNameRegForm;
    }
    public WebElement getEmailRegForm(){
        emailRegForm = getDriver().findElement(By.xpath("//input[@id='userEmail']"));
        return emailRegForm;
    }
    public WebElement getAgeRegForm(){
        ageRegForm =  getDriver().findElement(By.xpath("//input[@id='age']"));
        return ageRegForm;
    }
    public WebElement getSalaryRegForm(){
        salaryRegForm =  getDriver().findElement(By.xpath("//input[@id='salary']"));
        return salaryRegForm;
    }
    public WebElement getDepartmentRegForm(){
        departmentRegForm = getDriver().findElement(By.xpath("//input[@id='department']"));
        return departmentRegForm;
    }
    public WebElement getSubmitRegForm(){
        submitRegForm = getDriver().findElement(By.xpath("//button[@id='submit']"));
        return submitRegForm;
    }
    public void clickOnSubmitRegForm(){
        getSubmitRegForm().click();
    }
    public WebElement getNewRowAdd(){
        newRowAdd = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]"));
        return newRowAdd;
    }
    public WebElement getDeleteRow(){
        deleteRow = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div"));
        return deleteRow;
    }
    public void clickOnDeleteRow(){
        getDeleteRow().click();
    }
    public  WebElement getResizerMove(){
        resizerMove = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[2]"));
        return resizerMove;
    }
    public void clickOnResizeMove(){
        getResizerMove().click();
    }

    public WebElement getChangedFirstName(){
        changedFirstName = getDriver().findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]"));
        return changedFirstName;
    }
}
