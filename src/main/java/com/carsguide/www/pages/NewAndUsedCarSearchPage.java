package com.carsguide.www.pages;

import com.carsguide.www.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewAndUsedCarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);

    }

    //And I select make “<make>”
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement selectCarsMake;

    public void selectMakeFromDropDown(String carsMake)
    {
        selectByVisibleTextFromDropDown(selectCarsMake, carsMake);
    }

    //And I select model “<model>”
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement selectCarsModel;

    public void selectCarsModelFromDropDown(String carsModel)
    {    log.info("Select option from model : " + selectCarsModel.toString());
        selectByVisibleTextFromDropDown(selectCarsModel, carsModel);
    }

    //And I select location “<location>”
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement selectLocation;

    public void selectLocationFromDropDown(String location) {
        log.info("Select option from drop down : " + selectLocation.toString());
        selectByVisibleTextFromDropDown(selectLocation, location);
    }

    //And I select price “<price>”
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement selectPrice;

    public void selectPriceFromDropDown(String price)
    { log.info("Select option from drop down : " + selectPrice.toString());
        selectByVisibleTextFromDropDown(selectPrice, price);
    }
    //And I click on Find My Next Car tab
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarTab;

    public void clickOnFindMyNextCarTab(){
        log.info("Click on Find My Next Cars Tab " + findMyNextCarTab.toString());
        clickOnElement(findMyNextCarTab);

    }
    //Then I should see the make “<make>” in results

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement resultText;


    public void verifyTheResult(String expected){
        log.info("Verify The Results : " + resultText.toString());
        String actualText = getTextFromElement(resultText);
        String expectedText = expected;
        Assert.assertEquals(actualText, expectedText, "Verify The Results");
    }

    //Then I should see the make “<make>” in results
    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement resultTextUsedCars;


    public void verifyTheResultUsedCars(String expected1){
        log.info("Verify The Results : " + resultTextUsedCars.toString());
        String actualMessage = getTextFromElement(resultTextUsedCars);
        String expectedMessage = expected1;
        Assert.assertEquals(actualMessage, expectedMessage, "Verify The Results");
    }


}

