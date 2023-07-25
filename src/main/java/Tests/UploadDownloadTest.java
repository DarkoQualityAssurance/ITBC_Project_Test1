package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;



public class UploadDownloadTest extends BaseTest {

    @Test
    public void verifyFileIsUploaded(){
        getIndexPage().clickOnElementsCard();
        scrollToElement(getElementsPage().getUploadDownload());
        getElementsPage().clickOnUploadDownload();
        File image = new File("C:/Users//Laptop//IdeaProjects//ITBC_project_DarkoDjekic//Toolsqa.jpg");
        getUploadDownloadPage().getChooseFile().sendKeys(image.getAbsolutePath());
        Assert.assertTrue(getUploadDownloadPage().getUploadTextConfirm().isDisplayed());
    }
}
