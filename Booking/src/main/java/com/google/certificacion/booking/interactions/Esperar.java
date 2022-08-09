package com.google.certificacion.booking.interactions;

import net.serenitybdd.core.pages.PageObject;

import java.util.function.IntConsumer;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar extends PageObject {
    private int tiempo;

    public Esperar(int tiempo) {
        this.tiempo = tiempo;
    }

    public EsperarValor segundos() {
        IntConsumer espera = t -> waitFor(t).seconds();
        return instrumented(EsperarValor.class, espera, tiempo);
    }

    public static Esperar enLaPagina(int tiempo) {
        return new Esperar(tiempo);
    }
}
