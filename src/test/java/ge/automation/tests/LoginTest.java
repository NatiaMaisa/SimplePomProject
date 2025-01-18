package ge.automation.tests;


import ge.automation.BaseTest;
import ge.automation.pages.InventoryPage;
import ge.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin(){

        LoginPage loginPage = new LoginPage(driver);

        //ავტორიზაცია უზერით და პაროლით
        loginPage.login("standard_user", "secret_sauce");

        //პირველი შემოწმება მიმდინარე ბმული თუ ემთხვევა მოსალოდნელს
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL არ ემთხვევა");

        //ჰედერის ტექსტის შემოწმება
        InventoryPage inventoryPage = new InventoryPage(driver);
        String expectedHeaderText = "Products";
        String actualHeaderText = inventoryPage.getInventoryHeaderText();
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "ტექსტი არ ემთხვევა");
    }

    @Test
    public void testLoginButtonTextColor(){
        LoginPage loginPage = new LoginPage(driver);
        String expectedColor = "rgba(19, 35, 34, 1)"; // hex color#132322";
        String actualColor = loginPage.getLoginButtonTextColor();

        Assert.assertEquals(actualColor, expectedColor, "ფერი არ ემთხვევა");
    }


}
