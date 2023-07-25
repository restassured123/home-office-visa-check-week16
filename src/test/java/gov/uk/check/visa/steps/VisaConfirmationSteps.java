package gov.uk.check.visa.steps;

import gov.uk.check.visa.Hooks;
import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;

public class VisaConfirmationSteps {
    @Given("I am on the UK visa website")
    public void iAmOnTheUKVisaWebsite() {

    }

    @And("I click on Reject cookies")
    public void iClickOnRejectCookies() {
        new StartPage().clickOnRejectCookies();
    }

    @And("I click on Hide message")
    public void iClickOnHideMessage() {
        new StartPage().clickOnHideMessage();
    }

    @When("I click on Startnow button")
    public void iClickOnStartnowButton() {
        new StartPage().clickStartNow();
    }

    @And("I select nationality as  {string}")
    public void iSelectNationalityAsAustralia(String nationality) throws InterruptedException {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select option {string}")
    public void iSelectOptionTourism(String tourism) {
        new ReasonForTravelPage().selectReasonForVisit(tourism);
    }

    @Then("I will be informed You will need a visa to come to the UK")
    public void iWillBeInformedYouWillNeedAVisaToComeToTheUK() {
        new ResultPage().getResultMessageTourism();



    }

    @And("I select nationality as  <{string}>")
    public void iSelectNationalityAs(String nationality) throws InterruptedException {
        new SelectNationalityPage().selectNationality(nationality);

    }


    @And("I select option <{string}>")
    public void iSelectOption(String work) {
        new WorkTypePage().selectJobType(work);
    }

    @And("I select option the <{string}>")
    public void iSelectOptionThe(String moreThan6Mths) {
        new DurationOfStayPage().selectMoreThen6months();

    }

    @And("I select the option <{string}>")
    public void iSelectTheOption(String arg0) {
        new WorkTypePage().clickOnHeathAndCareProfessional();
    }





    @And("I select nationality <{string}>")
    public void iSelectNationality(String nationalityChile) throws InterruptedException {
        new SelectNationalityPage().selectNationality(nationalityChile);
    }

    @And("User select reason for visit <{string}>")
    public void userSelectReasonForVisit(String arg0) {
        new FamilyImmigrationStatusPage().clickOnJoinFamily();

    }


    @Then("I will be informed <{string}>")
    public void iWillBeInformed(String message) {
        new ResultPage().getResultMessageHealthCare();
    }


    @Then("I will be informed that <{string}>")
    public void iWillBeInformedThat(String arg0) {
        new ResultPage().getResultMessageFamilyStay();
    }
}
