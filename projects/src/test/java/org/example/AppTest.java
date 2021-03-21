package org.example;

import org.example.pages.HomePage;
import org.example.pages.ProductPage;
import org.example.pages.ChartPage;
import org.example.base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AppTest extends BaseTest
{
    HomePage homePage;
    ProductPage productPage;
    ChartPage chartPage;

    @Before
    public void before(){
        homePage = new HomePage(getWebDriver());
        productPage = new ProductPage(getWebDriver());
        chartPage = new ChartPage(getWebDriver());
    }
    @Test
    public void test() {
        homePage.openTrendyol()
                .chooseGender()
                .searchProduct()
                .clickSearchButton();
        productPage.selectBrand()
                .chooseBestSellerProduct()
                .clickBestSellerProduct()
                .scrollDownToProductReview()
                .scrollUpToAddToChart()
                .clickAddToChart()
                .closeSecondTab();
        homePage.searchSecondProduct()
                .clickSearchButton();
        productPage.chooseScoreProduct()
                .clickScoreProduct()
                .scrollDownToProductReview()
                .scrollUpToAddToChart()
                .clickAddToChart();
        chartPage.hoverChart()
                .goToChart()
                .incProduct()
                .confirmChart();
    }
    @After
    public void after(){
        getWebDriver().quit();
    }
}
