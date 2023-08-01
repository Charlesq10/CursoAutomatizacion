#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: Como usuario quiero validar el Login

  @HU001 @Regresion
  Scenario Outline: login exitoso
    Given open the browser
    When the user fill out user <userName> password <password>
    #Then the user validate dashboard <user>

    Examples:
      | userName | password |
      | Admin    | admin123 |
