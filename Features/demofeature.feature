

Feature: Demo Web shop OPtions
  
Background:
Given User launched the Chrome browser
And launched the URl
  @login
  Scenario: login Process for demo WebShop

    Then clicked on Login
    And Provided Credentials
    Then he should be redirected to Home page

  @Registration
  Scenario: Registration Process for DemoWebShop

    Then clicked on register
    And provided all details
    Then he should be registered Successfully

