package com.booking.certificacion.bookingwebmanual.stepdefinitions;


import com.booking.certificacion.bookingwebmanual.ValidadorDePasos;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class BaseStepDefinitions {

    private Scenario escenario;

    @Before
    public void getScenario(Scenario escenario) {
        this.escenario = escenario;
    }

    @Given("^(.*)$")
    public void ejecutarValidacion(String paso){
        ValidadorDePasos.validar(paso, escenario.getName());
    }
}
