Feature: I am on the Diathriv login page

  Scenario: Successful login with valid Credentials
    Given i have open browser
    When I have entered a valid username and password
    And I click on the login button
    And I click on requiredfailed button
    And I click closebutton
    Then  click on signout button
    
    Scenario Outline: Failed login using wrong credentials
    When I enter Username as "<username>" and Password as "<password>"
    And I click on the login buttons
    And I should see "<warning>" message
    
    Examples:
      | username    | password   | warning                            |
      | Ram        | 123        | Please enter a valid email address |
      | Tset1        | 1234        | Please enter a valid email address |
    
    
 

