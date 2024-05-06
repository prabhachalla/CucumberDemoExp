
@smart

Feature: Login and Settings Feature

  Scenario: Successful login and settings navigation
    Given I am on the Diathriv login page
    When I enter a valid username and password
    And I click on the login buttons1
    Then I should be logged in successfully
    And I should be able to click on the settings button
    And I should be able to navigate to My Contacts dashboard
    And I should be able to check and validate fields in settings
