Feature: Docuport Login Logout Fearure

  Background:
    Given user is on Docuport login page

  Scenario: Login as a client
    Given user is on Docuport login page
    When user enter username for client
    And user enter password for client
    And  user  click login button
    And  user need to click continue button
    Then user should see the home page for client
    Then  user need to click Batch1 Group3
    Then  user need to click LogOut button

  Scenario: Login as a employees
    When user enter username for employees
    And user enter password for employees
    And  user  click login button
    Then user should see the home page for employees
    Then  user need to click Batch1 Group3
    Then  user need to click LogOut button
  @test1
  Scenario: Login as a advisor
    When user enter username for advisor
    And user enter password for advisor
    And  user  click login button
    Then user should see the home page for advisor
    Then  user need to click Batch1 Group3
    Then  user need to click LogOut button

  Scenario: Login as a supervisor
    When user enter username for supervisor
    And user enter password for supervisor
    And  user  click login button
    Then user should see the home page for supervisor
    Then  user need to click Batch1 Group3
    Then  user need to click LogOut button
