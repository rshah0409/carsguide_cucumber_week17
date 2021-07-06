Feature: Search functionality

  As a User I want to search and buy car successfully.


  @Sanity
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click Search Cars
    Then I navigate to new and used car search page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make          | model   | location              | price  |
      | Mercedes-Benz | A200    | NSW - Central Coast   | $25,000 |
      | Kia           | RIO     | NSW - Far West        | $20,000 |
      | Audi          | A4      | NSW - All             | $30,000 |
      | BMW           | 118D    | NSW - Mid North Coast | $40,000 |
      | Honda         | City    | NSW - New England     | $45,000 |
      | Jeep          | Compass | NSW - Sydney          | $50,000 |
