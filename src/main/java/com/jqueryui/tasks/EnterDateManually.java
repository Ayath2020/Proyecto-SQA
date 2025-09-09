package com.jqueryui.tasks;

import com.jqueryui.userinterfaces.DataPickerUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterDateManually implements Task {

    private final String date;
    public EnterDateManually(String date) { this.date = date; }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DataPickerUi.TXT_DATE),
                Enter.theValue("12/31/2025").into(DataPickerUi.TXT_DATE)
        );
    }
    public static EnterDateManually with(String date) {
        return new EnterDateManually (date);
    }
}
