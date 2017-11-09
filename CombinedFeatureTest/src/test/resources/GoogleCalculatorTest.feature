Feature: Google Calculator Test

  @GoogleCalculatorTest
  Scenario Outline:
    Given user navigates to google
    Then user enters "<num1>" and "<num2>"
    Then the output should be "<result>"

    Examples:
      | num1 | num2 | result |
      | 1    | 2    | 3      |
      | 4    | 5    | 9      |
      | 10   | 11   | 21     |