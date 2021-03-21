package org.example.pages;

import org.example.base.BasePage;
import static org.example.constant.ConstantsHomePage.*;
import org.junit.Assert;
import org.openqa.selenium.*;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openTrendyol() {
        navigateUrl(TRENDYOL_URL);
        logger.info("Trendyola baglanma basarili.");
        timeUnitSeconds(1);
        return this;
    }

    public HomePage chooseGender() {
        click(WOMAN_PICTURE);
        logger.info("Cinsiyet secimi basarili.");
        timeUnitSeconds(1);
        return this;
    }

    public HomePage searchProduct() {
        sendKeys(SEARCH_BOX, "kahve makinesi");
        logger.info("Urun arama basarili.");
        timeUnitSeconds(1);
        return this;
    }

    public HomePage clickSearchButton() {
        timeUnitSeconds(1);
        click(SEARCH_BUTTON);
        logger.info("Butona tiklama basarili.");
        return this;
    }

    public HomePage searchSecondProduct() {
        sendKeys(SEARCH_BOX, "kahve");
        logger.info("Urun arama basarili.");
        timeUnitSeconds(1);
        return this;
    }



}
