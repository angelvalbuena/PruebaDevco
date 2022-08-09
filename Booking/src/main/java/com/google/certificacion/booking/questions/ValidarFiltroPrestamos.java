package com.google.certificacion.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static com.google.certificacion.booking.userinterface.Hotel.LISTA_PRECIOS;

public class ValidarFiltroPrestamos implements Question<Boolean> {
    private boolean isValid;

    @Override
    public Boolean answeredBy(Actor actor) {
        validarOrdenPrestamos(actor);
        return isValid;
    }

    private void validarOrdenPrestamos(Actor actor) {
        int precioHotel1 = Integer.parseInt(LISTA_PRECIOS.resolveAllFor(actor).get(0).getText().substring(4).replace(".",""));
        int precioHotel2 = Integer.parseInt(LISTA_PRECIOS.resolveAllFor(actor).get(1).getText().substring(4).replace(".",""));
        int precioHotel3 = Integer.parseInt(LISTA_PRECIOS.resolveAllFor(actor).get(2).getText().substring(4).replace(".",""));

        if(precioHotel1 < precioHotel2 && precioHotel2 < precioHotel3 ){
            isValid = true;
        }
    }

    public static ValidarFiltroPrestamos enHoteles(){
        return new ValidarFiltroPrestamos();
    }
}
