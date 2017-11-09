Feature: login to autobill, create an account, logout

  @loginToAutobill
  Scenario Outline:
    Given navigate to autobill
    And fill up authentication form
      | field    | value      |
      | email    | <email>    |
      | password | <password> |
    When click login button
    Then check if logged in

    Examples:
      | email                | password |
      | implementer@0e7d1d61 | 0e7d1d61 |


