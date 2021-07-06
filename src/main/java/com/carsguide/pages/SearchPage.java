package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(SearchPage.class.getName());

    @FindBy(xpath = "//div[@class='heading main-heading item-ad-wrapper ']")
    WebElement newAndUsedText;
    @FindBy(xpath = "//select[@id='makes']")
    WebElement clickMake;
    @FindBy(xpath = "//select[@id='models']")
    WebElement selectModel;
    @FindBy(xpath = "//select[@id='locations']")
    WebElement selectLocation;
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement selectPrice;
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarButton;
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement makeTitleText;



    public String getTextOfNewUsedCars(){
        log.info( "Getting text of page title"  +newAndUsedText.toString());
        return getTextFromElement( newAndUsedText );
    }
    public void clickOnMakeDropDownAndSelectCarMake(String make){
        log.info( "selecting make" +clickMake.toString())  ;
        selectByVisibleTextFromDropDown( clickMake,make );
    }
    public void clickOnModelAndSelectModel(String model){
        log.info( "selecting model" +selectModel.toString());
        selectByValueFromDropDown( selectModel,model );

    }
    public void clickOnLocationAndSelectLocation(String location){
        log.info( "selecting location" +selectLocation.toString() );
        selectByVisibleTextFromDropDown( selectLocation,location );
    }
    public void clickOnPriceAndSelectPrice(String price)  {
        log.info( "selecting price" +selectPrice.toString());
        selectByVisibleTextFromDropDown( selectPrice,price );
    }
    public void clickOnFindMyCarButton(){
        log.info( "clicking on find my car button" +findMyNextCarButton);
        clickOnElement( findMyNextCarButton );
    }
    public String verifyMakeTitleText(){
        log.info( "get text from make title"  +makeTitleText );
        return getTextFromElement( makeTitleText );
    }

}
