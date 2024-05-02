Feature: I am on the Diathriv login page

  
  Scenario: Successful login with valid Credentials
    Given i have open browser
    When I have entered a valid username and password
    And I click on the login button
    And I click on requiredfailed button
    And I click closebutton
    Then  click on signout button
    
    
 

