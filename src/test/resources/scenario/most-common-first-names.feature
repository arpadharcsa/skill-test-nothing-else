Feature: Most common first names

  Scenario: Print out 3 most common first names along with number of occurrences
    Given some people whose names are
      | firstname | lastname |
      | John      | Doe      |
      | John      | Silver   |
      | John      | Acheson  |
      | Peter     | Arne     |
      | Peter     | Doe      |
      | Antonio   | Aakeel   |
      | Khalid    | Abdalla  |
    When the application processes these people
    Then the result gonna be the following
      | firstname | Occurrence |
      | John      | 3          |
      | Peter     | 2          |
      | Antonio   | 1          |
