package gov.uk.check.visa.pages;


import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Reject additional cookies')]")
    WebElement rejectCookies;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Hide this message')]")
    WebElement hideMessage;

    public void clickStartNow(){

        clickOnElement(startNowButton);

    }
    public void clickOnRejectCookies(){
        clickOnElement(rejectCookies);
    }
    public void clickOnHideMessage(){
        clickOnElement(hideMessage);
    }
}
