Feature: 2+2



#  Scenario Outline:
#    Given in google search page
#    Then insert 2+2  in the search box
#    Then click on search
#    When the result is fetched
#    Then if the result is okay am
#    Examples:
#      |  |
  @2+2
  Scenario Outline:
    Given go to google
    Then put "<num_1>" and "<num_2>"
    And get "<output>"
    And check "<result>"

    Examples:
      | num_1 | num_2 | output | result |
      | 2     | 2     | 4      | true   |