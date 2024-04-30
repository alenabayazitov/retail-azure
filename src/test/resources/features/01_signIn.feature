Feature: Sigh In Feature

  @signuptest
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email               | password         | confirmPassword  |
      | alldone | alldone4@gmail.com | AllDoneTestOne1! | AllDoneTestOne1! |
    And User click on SignUp button
    Then User should be logged into account page

  @logintest
  Scenario: Verify User can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'alldone4@gmail.com' and password 'AllDoneTestOne1!'
    And User click on login button
    Then User should be logged in into Account
