package com.jqueryui.questions;

import com.jqueryui.userinterfaces.DataPickerUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.ensure.Ensure.that;
import static org.hamcrest.Matchers.notNullValue;

public class VerifyNonEditableDateField implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(
                that(DataPickerUi.TXT_DATE).attribute("readonly").isNotBlank()
        );
        return null;
    }

    }
