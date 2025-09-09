package com.jqueryui.tasks;

import com.jqueryui.userinterfaces.DataPickerUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;



public class SelectSpecificDay implements Task {

    private final String day;

    private SelectSpecificDay(int day) {
        this.day = String.valueOf(day);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DataPickerUi.SPECIFIC_MONTH_DAY.of(day), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(DataPickerUi.SPECIFIC_MONTH_DAY.of(day))
                //SwitchToDatepickerIframe.clickOnIframeElement()
        );
    }

    public static  SelectSpecificDay fromTheCalendar(int day) {
        return new SelectSpecificDay (day);
    }

}
