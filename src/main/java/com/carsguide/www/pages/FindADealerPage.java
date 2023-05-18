package com.carsguide.www.pages;

import com.carsguide.www.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindADealerPage extends Utility {

    private static final Logger log = LogManager.getLogger(FindADealerPage.class.getName());
    public FindADealerPage()
    {
        PageFactory.initElements(driver, this);

    }
    //And I click ‘Find a Dealer’
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findADealerLink;

    public void clickOnFindADealerLink(){
        log.info("Click on Find A Dealer link " + findADealerLink.toString());
        clickOnElement(findADealerLink);
    }


}
