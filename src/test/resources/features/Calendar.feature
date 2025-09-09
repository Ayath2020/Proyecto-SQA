Feature: Selección de fechas en JQuery Datepicker
  Como usuario del sistema
  Quiero seleccionar una fecha en el calendario
  Para visualizar y validar que se muestre correctamente en el campo de texto

@smoke
    Scenario: Reserva de una cita seleccionando el dia actual en el calendario
      Given que Jose abre la página principal de JQuery Datepicker
      When Jose cambia al iframe donde se encuentra el calendario
      And Jose hace clic en el campo de selección de fecha
      And Jose Selecciona el día actual del mes
      Then Jose valida que la fecha seleccionada se visualiza en el campo de texto

  @smoke
    Scenario: Selección de una fecha específica en un mes diferente
      Given que Jose abre la página principal de JQuery Datepicker
      When Jose cambia al iframe donde se encuentra el calendario
      And Jose hace clic en el campo de selección de fecha
      And Jose navega al próximo mes
      And Jose selecciona el día 10 del próximo mes
      Then Jose valida que la fecha seleccionada del proximo mes se visualiza en el campo de texto


  @smoke
  Scenario: Reserva de una cita seleccionando el dia actual en el calendario
    Given que Jose abre la página principal de JQuery Datepicker
    When Jose cambia al iframe donde se encuentra el calendario
    And Jose hace clic en el campo de selección de fecha
    And Jose Selecciona el día actual del mes
    Then Jose valida que la fecha seleccionada se visualiza en el campo de texto
    When Jose hace clic nuevamente en el campo de selección de fecha
    And Jose intenta modificar la fecha manualmente
    And Jose valida que la fecha permanece igual a la seleccionada previamente

  @smoke
    Scenario: Validación de campo Date en JQuery Datepicker
    Given que Jose abre la página principal de JQuery Datepicker
    When Jose cambia al iframe donde se encuentra el calendario
    And Jose intenta ingresar manualmente la fecha "2025/10/01" en el campo de texto
    Then Jose valida que el sistema no permite la edición manual



