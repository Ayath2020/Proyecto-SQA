package com.jqueryui.stepdefinitions;

import com.jqueryui.tasks.OpenDatepickerHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static com.jqueryui.utils.Dictionary.*;

public class DatepickerStepDefinitions {

    protected Actor actor;

    @Managed(driver = "chrome")
    protected WebDriver chrome;

    @Before
    public void setUp() {
        actor = Actor.named("Jose");
        actor.can(BrowseTheWeb.with(chrome));
    }

    @Given("que el usuario abre la página principal de JQuery Datepicker")
    public void que_el_usuario_abre_la_página_principal_de_j_query_datepicker() throws InterruptedException {

        actor.attemptsTo(
                OpenDatepickerHomePage.withUrl(HOME_PAGE_QA)
        );

    }

    @Given("cambia al iframe donde se encuentra el calendario")
    public void cambia_al_iframe_donde_se_encuentra_el_calendario() {

    }

    @When("hace clic en el campo de selección de fecha")
    public void hace_clic_en_el_campo_de_selección_de_fecha() {

    }

    @When("selecciona el día {int} del mes actual")
    public void selecciona_el_día_del_mes_actual(Integer int1) {

    }

    @Then("la fecha seleccionada \\({int}\\/mm\\/yyyy) aparece en el campo de texto")
    public void la_fecha_seleccionada_mm_yyyy_aparece_en_el_campo_de_texto(Integer int1) {

    }

}
