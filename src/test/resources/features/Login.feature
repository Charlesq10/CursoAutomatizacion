#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: Como usuario quiero validar el Login

  Scenario Outline: login exitoso
    Given open the browser
    When the user fill out user <userName> password <password>
    And press the Login button
    #Then I should be logged in

    Examples:
      | userName | password |
      | Admin    | admin123 |
