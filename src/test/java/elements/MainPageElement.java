package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class MainPageElement {

    public MainPageElement() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="sp-cc-rejectall-link")
    public WebElement cookie;

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id="nav-search-submit-button")
    public WebElement searchClick;

    @FindBy(css="div[id='nav-xshop'] > a[data-csa-c-type='link']:nth-of-type(1)")
    public WebElement bestSelling;

    @FindBy(id="nav-cart-count")
    public WebElement productCount;
}
