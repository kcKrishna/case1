
Feature: Facebook Login
  I want to Login Successfully login into facebook

  @tag1
  Scenario: Successful Login
    Given user is on fb login page
    When  user provides Correct credentials
    And 	user click on login button
    Then  user is in Homepage
    And   a welcome back message should be displayed

