package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
    WebDriver driver;
    By firstProduct = By.cssSelector("div.s-main-slot div[data-component-type='s-search-result'] h2 a");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstProduct() {
        WebElement product = driver.findElement(firstProduct);
        product.click();
    }
}
