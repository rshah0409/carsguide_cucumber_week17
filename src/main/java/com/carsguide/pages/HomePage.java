package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//a[text()='buy + sell']")
    WebElement buyAndSell;

    @FindBy(xpath = "//a[text()='Search Cars']")
    WebElement searchCars;

    public void hoverToBuyAndSellTab(){
        log.info( "mouse hover to buy and sell tab" +buyAndSell);
        mouseHoverToElement( buyAndSell );

    }
    public void clickOnSearchCarsOption(){
        log.info( "clicking on search option" +searchCars);
        clickOnElement( searchCars );

    }
}
