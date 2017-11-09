Feature: nesting

  Scenario Outline:
    Given go to someplace
    Then insert "<value_1>" and "<value_2>"
    And press search button
    And check "<result>"
    Then give output
  @nestingWithoutAllVars
    Examples:
      | value_1 | value_2 | result | unknown |
      | 1       | 2       | 2      | 1       |

  @test101
    Examples:
      | value_1 | value_2 |
      | 1       | 2       |