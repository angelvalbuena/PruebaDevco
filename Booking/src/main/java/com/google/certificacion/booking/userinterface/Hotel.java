package com.google.certificacion.booking.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Hotel {
    public static final Target CIUDAD = Target.the("Ciudad").located(By.id("ss"));
    public static final Target CIUDAD_SELECCIONADA = Target.the("Ciudad").locatedBy("//*[@data-i='0']");
    public static final Target BOTON_BUSCAR = Target.the("Botón para búsqueda").locatedBy("//*[@class='sb-searchbox__button ']");
    public static final Target LISTA_HOTELES = Target.the("Lista de hoteles").locatedBy("//*[@data-testid='property-card']");
    public static final Target FILTRO_CASAS = Target.the("Lista de hoteles por casas").locatedBy("//*[text()='Casas y apartamentos primero']");
    public static final Target TIPO_APTO = Target.the("Lista de hoteles tipo apto o casa").locatedBy("((//*[@data-testid='property-card'])[1]//span[contains(text(), 'Apartamento')])[1]");
    public static final Target FILTRO_PRECIO = Target.the("Lista de hoteles por precio más bajo").locatedBy("//*[text()='Precio (más bajo primero)']");
    public static final Target LISTA_PRECIOS = Target.the("Lista de precios").locatedBy("//*[@data-testid='price-and-discounted-price']/span");
    public static final Target BOTON_DISPONIBILIDAD = Target.the("Bo´ton para ver disponibilidad").locatedBy("(//*[text()='Ver disponibilidad'])[1]");
    public static final Target INFORMACION_DISPONIBILIDAD = Target.the("Información de disponibilidad").locatedBy("//*[@id='availability_target']");
    public static final Target BOTON_RESERVAR = Target.the("Botón para reservar").locatedBy("//*[contains(text(),' Reservaré')]");
    public static final Target FECHA_INICIAL = Target.the("Fecha inicial").locatedBy("//*[@data-testid='date-display-field-start']");
    public static final Target FECHA_FINAL = Target.the("Fecha final").locatedBy("//*[@data-testid='date-display-field-end']");
    public static final Target CALENDARIO_FECHA_INICIAL = Target.the("Selección fecha inicial").locatedBy("//*[@data-date='2022-09-02']");
    public static final Target CALENDARIO_FECHA_FINAL = Target.the("Seleccion fecha final").locatedBy("//*[@data-date='2022-09-05']");
    public static final Target BOTON_BUSCAR_FECHA = Target.the("Botón para buscar modificando fechas").locatedBy("(//*[text()='Buscar'])[2]");


}
