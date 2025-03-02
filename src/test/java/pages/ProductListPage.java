package pages;

import elements.ProductListPageElement;
import utility.Utility;

public class ProductListPage extends Utility {
    ProductListPageElement productListPageElement = new ProductListPageElement();

    public String searchedProductVerification() {
        return getTextElement(productListPageElement.productListName);
    }

    public String filterTheSearchedProduct() {
        scrollAndClickElement(productListPageElement.skinFilter);
        scrollAndClickElement(productListPageElement.writerFilter);
        waits(1000);
        scrollAndClickElement(productListPageElement.languageFilter);
        waits(1000);
        scrollAndClickElement(productListPageElement.stockFilter);
        return getTextElement(productListPageElement.harryPotterProduct);
    }

    public void goToSearchedProduct() {
        scrollAndClickElement(productListPageElement.harryPotterProduct);
    }

    public String bestSellingProductVerification() {
        return getTextElement(productListPageElement.bestSellingProduct);
    }

    public void goToBestSellingProduct() {
        scrollAndClickElement(productListPageElement.bestSellingProduct);
    }
}
