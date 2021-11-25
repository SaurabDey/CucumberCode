Feature: I want to automate login feature

  Scenario: Test positive scenario
    Given I have the site
    When I provide correct credential Admin and Admin123
    Then I should be in dashboard page


  Scenario: Test positive scenario 2
    Given I have the site
    When I provide correct credential in different style
         | Admin | Admin123 |
    Then I should be in dashboard page


 Scenario Outline: Test all Negative
   Given I have the site
   When I provide incorrect credential <username> and <password>
   Then I should be in login page

   Examples:
   |  username    |   password     |
   |  Admin       |  Saurab123     |
   |  Saurab      |  admin@123     |
   |  Saurab      |  Saurab123     |
