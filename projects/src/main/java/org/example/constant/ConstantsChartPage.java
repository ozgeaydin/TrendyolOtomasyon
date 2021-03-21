package org.example.constant;

import org.openqa.selenium.By;

public class ConstantsChartPage {
    public static final By HOVER_CHART = By.cssSelector(".account-navigation-wrapper>.account-nav-item:nth-child(3)");
    public static final By GO_TO_CHART = By.xpath("//body/div[@id='container']/div[@id='header']/div[@id='headerMain']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/a[1]");
    public static final By INC_PRODUCT = By.cssSelector(".ty-display-flex>.ty-numeric-counter-button:nth-child(3)");
    public static final By CONFIRM_CHART = By.xpath("//*[@id=\"basketAside\"]/div/a[1]");
}
