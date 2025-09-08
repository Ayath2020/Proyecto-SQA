package com.jqueryui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenDatepickerHomePage implements Task {

    private final String url;

    public OpenDatepickerHomePage(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static OpenDatepickerHomePage withUrl(String url) {
        return new OpenDatepickerHomePage(url);
    }

}
