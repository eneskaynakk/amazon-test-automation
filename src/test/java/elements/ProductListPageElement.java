package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class ProductListPageElement {

    public ProductListPageElement() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css="[class='a-color-state a-text-bold']")
    public WebElement productListName;

    @FindBy(css="ul#filter-p_n_format_browse-bin span:nth-child(1) > li > span > a > span")
    public WebElement skinFilter;

    @FindBy(xpath="//span[contains(text(), 'J.K. Rowling')]")
    public WebElement writerFilter;

    @FindBy(css="ul#filter-p_n_feature_nine_browse-bin span > span:nth-child(2) > li > span > a > span")
    public WebElement languageFilter;

    @FindBy(xpath="//span[contains(text(), 'Stokta Olmayanları Dahil Et')]")
    public WebElement stockFilter;

    @FindBy(xpath="(//div[@data-cy='title-recipe'])[7]//h2")
    public WebElement harryPotterProduct;

    @FindBy(xpath="(//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated'])[21]")
    public WebElement bestSellingProduct;
}
