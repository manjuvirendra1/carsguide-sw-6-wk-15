package com.carsguide.www.pages;

import com.carsguide.www.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());
    public Homepage()
    {
        PageFactory.initElements(driver, this);

    }

    //When I mouse hover on “buy+sell” tab
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buySellTab;

    public void mouseHooverOnBuyAndSellTab(){
        log.info("Mouse hoover on Buy and Sell Tab : " + buySellTab.toString());
       mouseHoverToElement(buySellTab);
    }
    //And I click ‘Search Cars’ link
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCarsLink;

    public void clickOnSearchCarsLink(){
        log.info("Click on search on Cars link " + searchCarsLink.toString());
        clickOnElement(searchCarsLink);
    }
    //And I click ‘Used’ link
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedLink;

    public void clickOnUsedLink(){
        log.info("Click on Used link " + usedLink.toString());
        clickOnElement(usedLink);
    }
}
