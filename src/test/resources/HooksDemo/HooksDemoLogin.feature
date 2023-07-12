Feature: Check login functionality

  Scenario: Validate login functionality with hooks
    #@Before: Browser should open
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page
  	#@After: Close and quit the browser driver
