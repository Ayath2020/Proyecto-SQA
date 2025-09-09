package com.jqueryui.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Calendar.feature",
        glue = "com.jqueryui.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DatepickersRunner {}
