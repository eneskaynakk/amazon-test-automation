package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Driver;
import utility.Utility;

public class CartPage extends Utility {
    MainPage mainPage = new MainPage();

    public void removeProduct() {
        String productCount = mainPage.getProductCount();
        if(productCount.equals("2")){
            for (int i =0; i<2 ; i++){
                WebElement removeButton = Driver.getDriver().findElement(By.xpath("(//span[@data-a-selector='decrement-icon'])[" + (i+1) + "]"));
                scrollAndClickElement(removeButton);
            }
        }
    }
}
