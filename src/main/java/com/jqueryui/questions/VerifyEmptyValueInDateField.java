package com.jqueryui.questions;

import com.jqueryui.tasks.EnterDateManually;
import com.jqueryui.userinterfaces.DataPickerUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VerifyEmptyValueInDateField implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        String before = actor.asksFor(Value.of(DataPickerUi.TXT_DATE));
        actor.attemptsTo(EnterDateManually.with("2025/10/01"));
        String after  = actor.asksFor(Value.of(DataPickerUi.TXT_DATE));
        actor.should(seeThat("el valor no cambia tras teclear", a -> after, equalTo(before)));
        return DataPickerUi.TXT_DATE.resolveFor(actor).getValue();
    }
}
