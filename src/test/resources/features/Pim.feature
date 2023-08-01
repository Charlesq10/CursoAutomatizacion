@PIM
Feature: Como usuario quiero validar todas las funcionalidades de PIM

  @HU002 @Regresion
  Scenario Outline: add employee
    Given open the browser
    And the user fill out user <userName> password <password>
    And the user select option add employee
    When the user fill out first name <firstName> middle name <middleName> last name <lastName>
    Then the user validate <firstName> <lastName>

    Examples:
      | userName | password | firstName | middleName | lastName |
      | Admin    | admin123 | Carlos    | Arturo     | Quiroga  |