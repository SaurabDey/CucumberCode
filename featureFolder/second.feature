Feature: I want to automate login feature with negative steps

 Scenario Outline: Test all Negative
   Given I have the site
   When I provide incorrect credential <username> and <password>
   Then I should be in login page

   Examples:
   |  username    |   password     |
   |  Admin       |  Saurab123     |
   |  Saurab      |  admin@123     |
   |  Saurab      |  Saurab123     |
