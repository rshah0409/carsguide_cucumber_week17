package com.carsguide.stepdefs;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.SearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuyingCarStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().hoverToBuyAndSellTab();
    }

    @And("^I click Search Cars$")
    public void iClickSearchCars() {
        new HomePage().clickOnSearchCarsOption();
    }

    @Then("^I navigate to new and used car search page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals( "New & Used Car Search - carsguide", new SearchPage().getTextOfNewUsedCars() );
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new SearchPage().clickOnMakeDropDownAndSelectCarMake(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new SearchPage().clickOnModelAndSelectModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new SearchPage().clickOnLocationAndSelectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price)  {
        new SearchPage().clickOnPriceAndSelectPrice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new SearchPage().clickOnFindMyCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
        Assert.assertTrue(make,new SearchPage().verifyMakeTitleText().contains(make));
    }
}
