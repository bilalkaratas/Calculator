@calc
Feature: Main Functionality Tests for Calculator

  Defect in line 19: When click on 5, screen displays 6
  Defect in line 23: When adding more then 4 numbers, clears the input and operation
  Defect in line 35: Adding 2 to the result of multiplication.
  Defect in division: When 0 is divided by any number, error message displaying. Error handling is missing.
  Defect : Calculator app is not working on Safari

  Background:
    Given the user is on the calculator

  Scenario Outline: Validate addition on calculator
    When the user add the following "<numbers>"
    Then verify the <result> is as expected

    Examples:
      | numbers       | result |
      | 5             | 5      |
      | 2, 3          | 5      |
      | 3, 4, 0       | 7      |
      | 1, 2, 9, 8    | 20     |
      | 0, 0, 4, 4, 2 | 10     |

  Scenario Outline: Validate subtraction on calculator
    When the user substracts the following "<numbers>"
    Then verify the <result> is as expected

    Examples:
      | numbers | result |
      | 1, 1    | 0      |
      | 2, 3    | -1     |
      | 9, 6, 2 | 1      |

  Scenario Outline: Validate multiplication on calculator
    When the user multiplies the following "<numbers>"
    Then verify the <result> is as expected

    Examples:
      | numbers    | result |
      | 1, 1       | 1      |
      | 2, 2       | 4      |
      | 6, 7, 8    | 336    |
      | 1, 2, 3, 4 | 24     |

  Scenario Outline: Validate division on calculator
    When the user divides the following "<numbers>"
    Then verify the <result> is as expected

    Examples:
      | numbers | result |
      | 0, 6    | 0      |
      | 4, 2    | 2      |
      | 9, 3    | 3      |
