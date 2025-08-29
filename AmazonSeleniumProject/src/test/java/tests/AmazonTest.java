package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.BaseTest;

public class AmazonTest extends BaseTest {

    @Test
    public void testAmazonE2EFlow() {
        HomePage home = new HomePage(driver);
        home.searchProduct("laptop");

        SearchResultsPage results = new SearchResultsPage(driver);
        results.clickFirstProduct();

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        ProductPage product = new ProductPage(driver);
        product.addToCart();
        product.goToCart();

        CartPage cart = new CartPage(driver);
        Assert.assertTrue(cart.verifyItemInCart(), "Item was not added to cart!");
    }
}
