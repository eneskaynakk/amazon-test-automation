package pages;

import elements.MainPageElement;
import utility.Utility;

public class MainPage extends Utility {
    MainPageElement mainPageElement = new MainPageElement();

    public void closeCookie() {
        clickElementWithWait(mainPageElement.cookie);
    }

    public void searchProduct(String productName) {
        clickElementWithWait(mainPageElement.searchBox);
        sendKeyToElement(mainPageElement.searchBox, productName);
        clickElementWithWait(mainPageElement.searchClick);
    }

    public void goToBestSelling() {
        scrollAndClickElement(mainPageElement.bestSelling);
    }

    public String getProductCount() {
        return getTextElement(mainPageElement.productCount);
    }
}




