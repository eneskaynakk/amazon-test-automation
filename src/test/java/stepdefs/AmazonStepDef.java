package stepdefs;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.*;
import utility.ConfigReader;
import utility.Driver;

public class AmazonStepDef {
    MainPage mainPage = new MainPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    CartPage cartPage = new CartPage();

    String actualResult;

    @Given("The user navigates to amazon.com.tr")
    public void amazonHomePage() {
        String webUrl = ConfigReader.getProperty("url");
        Driver.getDriver().get(webUrl);
    }

    @Given("If there is a cookie pop-up, it will be closed")
    public void closeCookie() {
        mainPage.closeCookie();
    }

    @When("The desired product name {string} is entered into the search bar and the search is made")
    public void productNameSearch(String productName) {
        mainPage.searchProduct(productName);
    }

    @Then("The searched product name is verified")
    public void searchedProductVerify() {
        actualResult = productListPage.searchedProductVerification();
        Assert.assertEquals(actualResult, "\"Harry Potter\"");
    }

    @When("The searched product is filtered and the product page is opened")
    public void filterTheSearchedProduct() {
        actualResult = productListPage.filterTheSearchedProduct();
        productListPage.goToSearchedProduct();
    }

    @Then("After verifying the product name, the product is added to the cart")
    public void searchedProductAddToCart() {
        String expectedProductDetailName = productDetailPage.getProductDetailName();
        Assert.assertEquals(actualResult, expectedProductDetailName);

        productDetailPage.addToCart();
    }

    @When("The user navigates to the Best Sellers subcategory and then to the product page")
    public void goToTheBestSellingProduct() {
        mainPage.goToBestSelling();

        actualResult = productListPage.bestSellingProductVerification();

        productListPage.goToBestSellingProduct();
    }

    @Then("After verifying the best seller product name, the product is added to the cart")
    public void bestSellingProductAddToCart() {
        String expectedBestSellingProductDetailName = productDetailPage.getProductDetailName();
        Assert.assertEquals(actualResult, expectedBestSellingProductDetailName);

        productDetailPage.addToCart();
    }

    @When("The user navigates to the cart page")
    public void goToTheCartPage() {
        String cartPageUrl = ConfigReader.getProperty("cartPageUrl");
        Driver.getDriver().navigate().to(cartPageUrl);
    }

    @Then("If the number of items in the cart is verified, all items will be removed from the cart")
    public void productCountVerification() {
        cartPage.removeProduct();
    }
}