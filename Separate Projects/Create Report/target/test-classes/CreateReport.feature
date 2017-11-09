Feature: Create report

  @createreport
  Scenario Outline:
    Given user navigates to google
    When user enters "<num1>" and "<num2>"
    Then check the "<result>" and define the "<state>"
    Then write to csv file

    Examples:
      | num1 | num2 | result | state |
      | 1    | 2    | 3      | true  |
#      | 4    | 5    | 9      | true  |
#      | 10   | 11   | 21     | true  |