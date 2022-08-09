package com.google.certificacion.booking.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Calendario {
    public static final Target FECHAINICIAL = Target.the("Fecha inicial").locatedBy("((//*[@class='bui-calendar__wrapper'])[2]/table/tbody/tr/td[@class='bui-calendar__date'])[1]");
    public static final Target FECHAFINAL = Target.the("Fecha final").locatedBy("((//*[@class='bui-calendar__wrapper'])[2]/table/tbody/tr/td[@class='bui-calendar__date'])[3]");

}
