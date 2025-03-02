Feature: amazon.com.tr Add Product to Cart Automation
  Scenario: Product search, filtering, name verification, and adding to cart
    Given The user navigates to amazon.com.tr
    And If there is a cookie pop-up, it will be closed

    When The desired product name "Harry Potter" is entered into the search bar and the search is made
    Then The searched product name is verified

    When The searched product is filtered and the product page is opened
    Then After verifying the product name, the product is added to the cart

    When The user navigates to the Best Sellers subcategory and then to the product page
    Then After verifying the best seller product name, the product is added to the cart

    When The user navigates to the cart page
    Then If the number of items in the cart is verified, all items will be removed from the cart