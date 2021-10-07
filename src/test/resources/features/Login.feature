    @login
  Feature: Login Functionality

    Background:
      Given user is on login page


    Scenario: When user logs in with valid credentials, Account Summary page should be displayed
      Given user is on login page
      And user logs in with username "username" and password "password"
      Then "Discuss" page should be displayed

      @negative_scenario
    Scenario: When user try to log in with blank username or password error message needs to be displayed
      #Given user is on login page
      And user logs in with username "username" and password "password"
      Then "Wrong login/password" error message needs to be displayed

      @negative_scenario
    Scenario: When user try to log in with invalid credentials error message needs to be displayed
      #Given user is on login page
      And user logs in with username "invalid" and password "invalid password"
      Then "Wrong login/password" error message needs to be displayed


