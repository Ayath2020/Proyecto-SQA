package com.jqueryui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.jqueryui.userinterfaces.DataPickerUi.IFRAME_ELEMENT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SwitchToDatepickerIframe implements Task {
    private static final Logger logger = Logger.getLogger(SwitchToDatepickerIframe.class.getName());

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toDefaultContext(),
                WaitUntil.the(IFRAME_ELEMENT, isPresent()).forNoMoreThan(15).seconds(),
                Switch.toFrame(IFRAME_ELEMENT.resolveFor(actor))
        );
        logger.log(Level.INFO, "Usuario cambió al iframe del datepicker");
    }

    public static SwitchToDatepickerIframe clickOnIframeElement() {
        return new SwitchToDatepickerIframe();
    }
}
