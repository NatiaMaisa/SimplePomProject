package ge.automation.pages;

import ge.automation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {

    //constructor
    public InventoryPage(WebDriver driver){

        super(driver);
    }

    @FindBy(className = "title")
    WebElement inventoryHeaderText;


    public String getInventoryHeaderText(){
        return getElementText(inventoryHeaderText);
    }

}
