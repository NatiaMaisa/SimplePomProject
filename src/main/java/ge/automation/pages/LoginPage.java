package ge.automation.pages;

import ge.automation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);

    }


    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;


    public void login(String username, String password){
        // კარგი მიდგომა
//        driver.findElement(usernameField).sendKeys(username);
//        driver.findElement(passwordField).sendKeys(password);
//        driver.findElement(loginButton).click();


        //უკეთესი მიდგომა ლოგინისთვის
        enterText(usernameField, username);
        enterText(passwordField, password);
        clickToElementWithWait(loginButton); // ერთად ვეითი და კლიკი
        //waitForElementClickable(loginButton); //ცალკე ვეითი
        //clickToElement(loginButton); //ცალკე კლიკი


    }

    public String getLoginButtonTextColor(){
        return getCssValue(loginButton, "color");
    }
}
