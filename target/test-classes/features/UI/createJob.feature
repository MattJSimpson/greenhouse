Feature: Creating a job in Greenhouse Recruiting

  Scenario: How to create a job in Greenhouse
    Given I have successfully logged into Greenhouse
    When I click the create a job button
    Then I am able to copy an existing job
    And save the job