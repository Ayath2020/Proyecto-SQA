package com.jqueryui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OpenDatepickerHomePage implements Task {

    private static final Logger logger = Logger.getLogger(OpenDatepickerHomePage.class.getName());

    private final String url;

    public OpenDatepickerHomePage(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url(url)
        );

        logger.log(Level.INFO, "Url abierta: {0}", url);

    }

    public static OpenDatepickerHomePage withUrl(String url) {
        return new OpenDatepickerHomePage(url);
    }

}
