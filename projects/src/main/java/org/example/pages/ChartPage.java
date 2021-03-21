package org.example.pages;
import static org.example.constant.ConstantsChartPage.*;

import org.example.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChartPage extends BasePage{

    public ChartPage(WebDriver driver){
        super(driver);
    }

    public ChartPage hoverChart() {
        timeUnitSeconds(1);
        hoverElement(HOVER_CHART);
        logger.info("Sepet goruntuleme basarili.");
        timeUnitSeconds(2);
        return this;
    }

    public ChartPage goToChart() {
        timeUnitSeconds(2);
        click(GO_TO_CHART);
        logger.info("goToChart Success");
        timeUnitSeconds(1);
        return this;
    }

    public ChartPage incProduct() {
        timeUnitSeconds(2);
        click(INC_PRODUCT);
        logger.info("Sepette urun arttirma basarili.");
        timeUnitSeconds(2);
        return this;
    }

    public ChartPage confirmChart(){
        timeUnitSeconds(2);
        click(CONFIRM_CHART);
        logger.info("Sepeti onaylama basarili.");
        timeUnitSeconds(2);
        return this;
    }

}
