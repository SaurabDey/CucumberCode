Feature: I want to automate login feature with positive test

  @Smoke @Regression
  Scenario: Test positive scenario
    Given I have the site
    When I provide correct credential Admin and Admin123
    Then I should be in dashboard page

  @Regression
  Scenario: Test positive scenario 2
    Given I have the site
    When I provide correct credential in different style
         | Admin | Admin123 |
    Then I should be in dashboard page

