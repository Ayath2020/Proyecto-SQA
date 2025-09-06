Feature: Selección de fechas en JQuery Datepicker
  Como usuario del sistema
  Quiero seleccionar una fecha en el calendario
  Para visualizar y validar que se muestre correctamente en el campo de texto

  Rule: Selección mediante calendario
    Background:
      Given que el usuario abre la página principal de JQuery Datepicker
      And cambia al iframe donde se encuentra el calendario

    @ui
    Scenario: Reserva de una cita seleccionando una fecha en el calendario
      When hace clic en el campo de selección de fecha
      And selecciona el día 15 del mes actual
      Then la fecha seleccionada (15/mm/yyyy) aparece en el campo de texto

    @ui
    Scenario: Selección de una fecha específica en un mes diferente
      When hace clic en el campo de selección de fecha
      And navega al próximo mes
      And selecciona el día 10 del próximo mes
      Then la fecha seleccionada (10/mm+1/yyyy) aparece en el campo de texto

  Rule: Validaciones del campo
    @ui @blocked
    Scenario: Validación de campo bloqueado en JQuery Datepicker
      Given que el usuario abre la página principal de JQuery Datepicker
      When intenta ingresar manualmente la fecha "2025/10/01" en el campo de texto
      Then el sistema no permite la edición manual
      And solo es posible seleccionar una fecha desde el calendario
