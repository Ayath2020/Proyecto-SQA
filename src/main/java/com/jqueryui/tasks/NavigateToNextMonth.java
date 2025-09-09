package com.jqueryui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.jqueryui.userinterfaces.DataPickerUi.NEXT_MONTH_BTN;
import static com.jqueryui.utils.Dictionary.WAIT_TIME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigateToNextMonth implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(NEXT_MONTH_BTN, isVisible()).forNoMoreThan(WAIT_TIME).seconds(),
                Click.on(NEXT_MONTH_BTN)
        );
    }

    public static NavigateToNextMonth ofTheYear() {
        return new NavigateToNextMonth();
    }
}
