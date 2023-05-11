package base;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class basePage {
    final Logger logger = Logger.getLogger(basePage.class);
   public WebDriver driver=null;
    WebDriverWait wait=null;
    public basePage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,60);
    }
    public WebElement findElement (By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }


    public  void clickElement(By by){
        findElement(by).click();

    }


    public void assertControl(By assertName, String expectedName){
        String assertName1 = findElement(assertName).getText();
        Assert.assertEquals(assertName1,expectedName);
        logger.info(assertName + " === " + expectedName);
    }

    public void assertName(String actualName, String expectedName){
        Assert.assertEquals(actualName,expectedName);
        logger.info("actual name = "+ actualName + " = " + "expected name = " + expectedName);
    }

}
