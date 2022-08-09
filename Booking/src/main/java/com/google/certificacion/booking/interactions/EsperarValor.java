package com.google.certificacion.booking.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.pages.PageObject;

import java.util.function.IntConsumer;

public class EsperarValor extends PageObject implements Interaction {

    private IntConsumer espera;
    private int tiempo;

    protected EsperarValor(IntConsumer espera, int tiempo) {
        this.espera = espera;
        this.tiempo = tiempo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
