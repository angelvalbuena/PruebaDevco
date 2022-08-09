package com.booking.certificacion.bookingwebmanual.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/consultar_booking.feature",
        glue = {"com.booking.certificacion.bookingwebmanual.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class ConsultarBooking {
}