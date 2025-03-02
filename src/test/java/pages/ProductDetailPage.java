package pages;

import elements.ProductDetailPageElement;
import utility.Utility;

public class ProductDetailPage extends Utility {
    ProductDetailPageElement productDetailPageElement = new ProductDetailPageElement();

    public String getProductDetailName() {
        return getTextElement(productDetailPageElement.productDetailName);
    }

    public void addToCart() {
       clickElementWithWait(productDetailPageElement.addToCartButton);
    }
}
