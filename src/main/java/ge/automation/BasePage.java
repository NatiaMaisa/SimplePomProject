package ge.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage (WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterText(By locator, String text){
        //ვეითის კოდი
        waitForElementClickable(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public void waitForElementClickable(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
       }

       public void clickToElement(By locator){
        driver.findElement(locator).click();
       }

     public void clickToElementWithWait(By locator) {
         waitForElementToBeVisible(locator);
                 driver.findElement(locator).click();
     }

     public String getElementText(By locator){
        driver.findElement(locator).getText();
        return driver.findElement(locator).getText();
     }

     public void waitForElementToBeVisible(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
     }

     public String getCssValue (By locator, String propertyName){
        waitForElementToBeVisible(locator);
        return driver.findElement(locator).getCssValue(propertyName);


     }
}
