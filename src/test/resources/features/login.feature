@smoke
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the fidexio login page

  Scenario Outline: Login as sales manager and pos manager
    When user enters "<usernames>" in username field
    And user enters "<passwords>" in password field
    And click on login button
    Then user should see the dashboard
    Examples:
      | usernames               | passwords    |
      | salesmanager15@info.com | salesmanager |
      | posmanager10@info.com   | posmanager   |

