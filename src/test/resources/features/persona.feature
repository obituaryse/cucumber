Feature: Funcionalidad personas

  @abcd
  Scenario Outline: Registro de personas
    Given registro de una persona a traves de interfaz
      And ingresar a interfaz de registro
      And registrar formulario con los datos "<Persona Uno>"
      Then verificar que el registro fue exitoso
    Examples:
      | Persona Uno      | Persona Dos

  Scenario: Actualizacion de persona
    Given actualizacion de una persona por interfaz
     And ingreasr a interfaz de actualizacion
     And realizar la actualizacion del nombre por "JUANITO"

   Scenario : eliminar persona
     Given eliminar a la persona por interfaz
       And realizar la eliminacion de la persona '2'




