package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class ProductDetailPageElement {

    public ProductDetailPageElement() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="productTitle")
    public WebElement productDetailName;

    @FindBy(id="add-to-cart-buttonn")
    public WebElement addToCartButton;
}
