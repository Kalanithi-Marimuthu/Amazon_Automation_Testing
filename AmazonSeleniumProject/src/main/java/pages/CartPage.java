package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    By cartItems = By.cssSelector("div.sc-list-item-content");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyItemInCart() {
        return driver.findElements(cartItems).size() > 0;
    }
}
