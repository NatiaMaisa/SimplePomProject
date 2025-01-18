package ge.automation.pages;

import ge.automation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    //constructor
    public InventoryPage(WebDriver driver){
        super(driver);
    }
    private By inventoryHeaderText = By.className("title");

    public String getInventoryHeaderText(){
        return getElementText(inventoryHeaderText);
    }

}
