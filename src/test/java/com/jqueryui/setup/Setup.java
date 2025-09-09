package com.jqueryui.setup;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.WebDriver;

public class Setup {

    @Managed(driver = "chrome")
    protected WebDriver webDriver;

    protected void giveBrowseAbilityTo(Actor actor) {
        actor.can(BrowseTheWeb.with(webDriver));
        try { webDriver.manage().window().maximize(); } catch (Exception ignored) {}
    }
}
