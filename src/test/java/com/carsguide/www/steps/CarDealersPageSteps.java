package com.carsguide.www.steps;


import com.carsguide.www.pages.FindADealerPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

public class CarDealersPageSteps {

    @And("^I click 'Find a Dealer'$")
    public void iClickFindADealer() {
        new FindADealerPage().clickOnFindADealerLink();
    }


    @Then("^I navigate to 'car-dealers page$")
    public void iNavigateToCarDealersPage() {
    }

    @And("^I should see the dealer names <dealersName> are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable dataTable) {
        {
            List<List<String>> userList = dataTable.asLists(String.class);
            for (List<String> e : userList) {
                System.out.println(e.get(0));

            }

        }
    }
}
