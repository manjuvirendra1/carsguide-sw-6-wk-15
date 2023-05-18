package com.carsguide.www.pages;

import com.carsguide.www.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarsForSalePage extends Utility {

    private static final Logger log = LogManager.getLogger(UsedCarsForSalePage.class.getName());
    public UsedCarsForSalePage()
    {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedLink;

    public void clickOnUsedLink(){
        log.info("Click on Used Link " + usedLink.toString());
        clickOnElement(usedLink);
    }
}
