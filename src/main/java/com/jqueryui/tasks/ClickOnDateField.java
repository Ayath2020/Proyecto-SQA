package com.jqueryui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.jqueryui.userinterfaces.DataPickerUi.*;

public class ClickOnDateField implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(TXT_DATE)
        );
    }

    public static ClickOnDateField clickOnDate() {
        return new ClickOnDateField();
    }
}
