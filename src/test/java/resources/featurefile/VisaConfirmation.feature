@regression, @smoke
Feature: Visa Confirmation Test

  Scenario: An Australian coming to the UK for Tourism.
    Given I am on the UK visa website
    And I click on Reject cookies
    And  I click on Hide message
    When I click on Startnow button
    And  I select nationality as  'Australia'
    And I click on Continue button
    And I select option 'Tourism'
    And I click on Continue button
    Then I will be informed You will need a visa to come to the UK
@regression, @sanity
    Scenario:Verify visa result for a Chilean coming to the UK for work and plans on staying for longer than six months
      Given I am on the UK visa website
      And I click on Reject cookies
      And  I click on Hide message
      When I click on Startnow button
      And  I select nationality as  <"Chile">
      And I click on Continue button
      And I select option <"Work">
      And I click on Continue button
      And I select option the <"longer than 6 months">
      And I click on Continue button
      And I select the option <"Health and care professional">
      And I click on Continue button
      Then I will be informed <"You need a visa to work in health and care">

@regression
      Scenario: Verify visa result for a Columbian national coming to the UK to join a partner for a longer stay
        Given I am on the UK visa website
        And I click on Reject cookies
        And  I click on Hide message
        When I click on Startnow button
        And I select nationality <"Colombia">
        And I click on Continue button
        And User select reason for visit <"Join partner or family for a long stay">
        And I click on Continue button
        Then I will be informed that <"You may need a visa">










