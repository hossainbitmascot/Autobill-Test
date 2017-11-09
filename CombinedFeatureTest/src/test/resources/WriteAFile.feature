Feature: Write a file

  @fileWrite
  Scenario Outline:
    Given send "<num1>" and "<num2>"
    When find "<sum>"
    Then write the values and result in a csv file

    Examples:
      | num1 | num2 | sum |
      | 2    | 2    | 4   |