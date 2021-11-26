Feature: I want to automate login feature with positive test

  Background:
    Given I have the site

  @Smoke @Regression
  Scenario: Test positive scenario
    When I provide correct credential Admin and admin123
    Then I should be in dashboard page

  @Regression
  Scenario: Test positive scenario 2
    When I provide correct credential in different style
         | Admin | admin123 |
    Then I should be in dashboard page

