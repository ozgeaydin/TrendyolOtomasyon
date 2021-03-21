package org.example.constant;

import org.openqa.selenium.By;

public class ConstantsProductPage {
    public static final By SELECT_BRAND = By.xpath("//*[@id=\"sticky\"]/div/div[2]/div[2]/a[3]");
    public static final By SORTING_LIST = By.className("sort-fltr-cntnr");
    public static final By BEST_SELLER_PRODUCT = By.cssSelector(".sort-fltr-cntnr>select option[value='BEST_SELLER']");
    public static final By CLICK_BEST_SELLER_PRODUCT= By.cssSelector(".prdct-cntnr-wrppr>div:nth-child(1)");
    public static final By ADD_TO_CHART = By.cssSelector(".pr-in-btn>.add-to-bs-tx");
    public static final By SCORE_PRODUCT = By.cssSelector(".sort-fltr-cntnr>select option[value='SCORE']");
    public static final By CLICK_SCORE_PRODUCT= By.cssSelector(".prdct-cntnr-wrppr>div:nth-child(1)");
    public static final By SCROLL_DOWN_TO_PRODUCT_REVIEWS = By.cssSelector(".pr-rnr-tl>div");

}