package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());
//    @CacheLookup
//    @FindBy(xpath = "//button[normalize-space()='Continue']")
//    WebElement clickNextStepButton;
//
//    @CacheLookup
//    @FindBy(xpath = "//label[contains(text(),'longer than 6 months')]")
//    WebElement selectLongerThan6Months;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Health and care professional')]")
    WebElement selectHeathAndCareProfessional;

    public void selectJobType(String reason) {

        clickOnElement(By.xpath("//label[contains(text(),'Work, academic visit or business')]"));

    }

    public void clickOnHeathAndCareProfessional(){
        clickOnElement(selectHeathAndCareProfessional);
    }
}
