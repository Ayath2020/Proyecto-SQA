package com.jqueryui.stepdefinitions;
import com.jqueryui.tasks.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import com.jqueryui.questions.VerifySelectedDateInField;
import com.jqueryui.setup.Setup;
import com.jqueryui.utils.GetCurrentDate;

import static com.jqueryui.utils.Dictionary.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;

public class DatepickerStepDefinitions extends Setup {

    @ParameterType(".*")
    public Actor actor(String name) {return theActorCalled(name);}

    @Before(order = 0)
    public void setTheStage() {OnStage.setTheStage(new OnlineCast());}

    @Given("que {actor} abre la página principal de JQuery Datepicker")
    public void abrirPagina(Actor actor) {
        giveBrowseAbilityTo(actor);
            actor.attemptsTo(OpenDatepickerHomePage.withUrl(HOME_PAGE_QA));
    }

    @When("{actor} cambia al iframe donde se encuentra el calendario")
    public void cambiaAlIframe(Actor actor) {
        actor.attemptsTo(SwitchToDatepickerIframe.clickOnIframeElement());
    }

    @When("{actor} hace clic en el campo de selección de fecha")
    public void clicEnCampoFecha(Actor actor) {
        actor.attemptsTo(ClickOnDateField.clickOnDate());
    }

    @When("{actor} Selecciona el día actual del mes")
    public void SeleccionarElDíaDelMesActual(Actor actor) {
        String today = GetCurrentDate.getDay();
        actor.attemptsTo(
                SelectCurrentDay.InCurrentMonth(today)
        );
    }

    @When("{actor} navega al próximo mes")
    public void navegaProximoMes(Actor actor) {
    actor.attemptsTo(
            NavigateToNextMonth.ofTheYear()
        );
    }

    @When("{actor} selecciona el día {int} del próximo mes")
    public void seleccionaDiaProximoMes(Actor actor, Integer dia) {
        actor.attemptsTo(
                SelectSpecificDay.
                        fromTheCalendar(dia));
    }

    @Then("{actor} valida que la fecha seleccionada se visualiza en el campo de texto")
    public void ValidarFechaDiaActual(Actor actor) {
        String fechaEsperada = actor.recall("fechaSeleccionada");
        actor.should(
                seeThat(VerifySelectedDateInField.value(), equalTo(fechaEsperada))
        );
    }

@Then("{actor} valida que la fecha seleccionada del proximo mes se visualiza en el campo de texto")
    public void ValidarFechaMesSiguiente(Actor actor) {
        String fechaEsperada = GetCurrentDate.getDateNextMonth(10);
        actor.should(
                seeThat(VerifySelectedDateInField.value(), equalTo(fechaEsperada))
        );
    }

    @When("{actor} intenta ingresar manualmente la fecha {string} en el campo de texto")
    public void joseIntentaIngresarManualmenteLaFechaEnElCampoDeTexto(Actor actor, String date) {
     actor.attemptsTo(
                EnterDateManually.with(date)
     );
    }
    @Then("{actor} valida que el sistema no permite la edición manual")
    public void joseValidaQueElSistemaNoPermiteLaEdiciónManual(Actor actor) {
        actor.should(seeThat(VerifySelectedDateInField.value(), equalTo("")));
    }

    @When("{actor} hace clic nuevamente en el campo de selección de fecha")
    public void ClicNuevamenteEnElCampoDeSelecciónDeFecha(Actor actor ) {
     actor.attemptsTo(
             ClickOnDateField.clickOnDate()
     );
    }
    @When("{actor} intenta modificar la fecha manualmente")
    public void ModificarLaFechaManualmente(Actor actor) {
      actor.attemptsTo(
              EnterDateManually.with("12/31/2025")
      );
    }
    @Then("{actor} valida que la fecha permanece igual a la seleccionada previamente")
    public void FechaPermaneceIgualALaSeleccionadaPreviamente(Actor actor) {

        String fechaEsperada = actor.recall("fechaSeleccionada");

        actor.should(
                seeThat(VerifySelectedDateInField.value(), equalTo(fechaEsperada))
        );
    }




}
