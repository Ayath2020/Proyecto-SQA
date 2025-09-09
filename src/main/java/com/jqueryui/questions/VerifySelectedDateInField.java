package com.jqueryui.questions;

import com.jqueryui.tasks.ClickOnDateField;
import com.jqueryui.tasks.SwitchToDatepickerIframe;
import com.jqueryui.userinterfaces.DataPickerUi;
import com.jqueryui.utils.GetCurrentDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerifySelectedDateInField implements Question {
    @Override
    public String answeredBy(Actor actor) {

        return DataPickerUi.TXT_DATE.
                resolveFor(actor).getValue();
    }
    public static Question<String> value() {
        return new VerifySelectedDateInField(); }
}