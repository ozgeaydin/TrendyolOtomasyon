package org.example.pages;

import org.example.base.BasePage;
import static org.example.constant.ConstantsProductPage.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver){
        super(driver);
    }

    ArrayList<String> tabs;

    public ProductPage selectBrand() {
        timeUnitSeconds(3);
        click(SELECT_BRAND);
        logger.info("Marka secimi basarili.");
        timeUnitSeconds(2);
        return this;
    }

    public ProductPage chooseBestSellerProduct() {
        timeUnitSeconds(2);
        click(SORTING_LIST);
        timeUnitSeconds(2);
        click(BEST_SELLER_PRODUCT);
        logger.info("Siralama basarili.");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage clickBestSellerProduct() {
        timeUnitSeconds(2);
        click(CLICK_BEST_SELLER_PRODUCT);
        logger.info("Urun secme basarili.");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage scrollDownToProductReview() {
        tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement divElement = driver.findElement(SCROLL_DOWN_TO_PRODUCT_REVIEWS);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", divElement);
        logger.info("scrollDownToProductReview Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage scrollUpToAddToChart() {
        WebElement divElement = driver.findElement(ADD_TO_CHART);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", divElement);
        logger.info("scrollUpToAddToChart Success");
        timeUnitSeconds(3);
        return this;
    }

    public ProductPage clickAddToChart() {
        click(ADD_TO_CHART);
        logger.info("clickAddToChart Success");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage chooseScoreProduct() {
        timeUnitSeconds(2);
        click(SORTING_LIST);
        timeUnitSeconds(2);
        click(SCORE_PRODUCT);
        logger.info("Siralama basarili.");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage clickScoreProduct() {
        timeUnitSeconds(2);
        click(CLICK_SCORE_PRODUCT);
        logger.info("Urun secme basarili.");
        timeUnitSeconds(1);
        return this;
    }

    public ProductPage closeSecondTab() {
        driver.close();
        logger.info("Tab kapama basarili.");
        driver.switchTo().window(tabs.get(0));
        timeUnitSeconds(1);
        return this;
    }

}
