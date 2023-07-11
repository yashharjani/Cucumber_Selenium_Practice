Feature: Test login functionality

  #Scenario: Check login is successful with valid credentials
  #Given user is on login page
  #When user enters username and password
  #And user clicks on login
  #Then user should be navigated to home page
  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user should be navigated to home page

    Examples: 
      | username           | password |
      | AutomationTesting1 |    12345 |
      | AutomationTesting2 |    12345 |
