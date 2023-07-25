package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    /**
     * Select a Nationality 'Australia'
     */
    public void selectNationality(String nationality) throws InterruptedException {
        Thread.sleep(2000);

        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }
    /**
     * Click on Continue button
     */
    public void clickNextStepButton(){

        clickOnElement(nextStepButton);
    }
}
