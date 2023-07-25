package gov.uk.check.visa.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.CacheLookup;
import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    //resultMessage locator

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessageTourism;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessageHealthCare;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement resultMessageFamilyStay;


    public String getResultMessageTourism() {
        log.info("Message for tourist visa");
        return getTextFromElement(resultMessageTourism);
    }


    public String getResultMessageFamilyStay() {

        log.info("Message for Family visa");
        return getTextFromElement(resultMessageFamilyStay);

    }

    public String getResultMessageHealthCare() {
        log.info("Message for work visa in HealthCare");
        return getTextFromElement(resultMessageHealthCare);
    }


}