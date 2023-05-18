package com.carsguide.www.steps;

import com.carsguide.www.pages.Homepage;
import com.carsguide.www.pages.NewAndUsedCarSearchPage;
import com.carsguide.www.pages.UsedCarsForSalePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAndUsedCarPageSteps {


    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I mouse hoover on buy\\+sell tab$")
    public void iMouseHooverOnBuySellTab()
    {
        new Homepage().mouseHooverOnBuyAndSellTab();
    }


    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink()
    {
        new Homepage().clickOnSearchCarsLink();
    }

    @Then("^I navigate to 'new and used car search' page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String carsMake)  {
        new NewAndUsedCarSearchPage().selectMakeFromDropDown(carsMake);

    }


    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String carsModel) {
       new NewAndUsedCarSearchPage().selectCarsModelFromDropDown(carsModel);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location)  {
       new NewAndUsedCarSearchPage().selectLocationFromDropDown(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearchPage().selectPriceFromDropDown(price);

    }


    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab()

    {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarTab();
    }


    @Then("^I should see the result \"([^\"]*)\" in results$")
    public void iShouldSeeTheResultInResults(String resultText) {
      new NewAndUsedCarSearchPage().verifyTheResult(resultText);

    }

    @And("^I click 'Used' link$")
    public void iClickUsedLink() {
        new UsedCarsForSalePage().clickOnUsedLink();
    }

    @Then("^I navigate to 'Used Cars For Sale' page$")
    public void iNavigateToUsedCarsForSalePage() {
    }


    @Then("^I should see the usedResult \"([^\"]*)\" in results$")
    public void iShouldSeeTheUsedResultInResults(String resultTextUsedCars) {
        new NewAndUsedCarSearchPage().verifyTheResultUsedCars(resultTextUsedCars);
    }
}
