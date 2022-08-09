package com.google.certificacion.booking.stepdefinitions;

import com.google.certificacion.booking.interactions.Esperar;
import com.google.certificacion.booking.questions.ValidarFiltroPrestamos;
import com.google.certificacion.booking.userinterface.NavegarPagina;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.ArrayList;

import static com.google.certificacion.booking.userinterface.Calendario.FECHAFINAL;
import static com.google.certificacion.booking.userinterface.Calendario.FECHAINICIAL;
import static com.google.certificacion.booking.userinterface.Hotel.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class BusquedaHotelesStepDefinitions {

    private NavegarPagina pagina;
    private static final int TIEMPO_ESPERA_BUSQUEDA = 10;
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().can(
                BrowseTheWeb.with(driver));
    }

    @Dado("^que el usuario Pedro navega en la pagina de booking$")
    public void queElUsuarioPedroNavegaEnLaPaginaDeBooking() {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina));
    }

    @Cuando("^intenta realizar consulta de un hotel (.*)$")
    public void intentaRealizarConsultaDeUnHotelCiudadFechaInicialFechaFinal(String ciudad) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CIUDAD),
                Enter.theValue(ciudad).into(CIUDAD),
                Click.on(CIUDAD_SELECCIONADA),
                Click.on(FECHAINICIAL),
                Click.on(FECHAFINAL),
                Click.on(BOTON_BUSCAR)
        );
    }

    @Entonces("^deberia ver la lista de hoteles disponibles$")
    public void deberiaVerLaListaDeHotelesDisponibles() {
        theActorInTheSpotlight().should(seeThat(the(LISTA_HOTELES),isVisible()));
    }



    @Entonces("^deberia ver la lista de hoteles organizados por casas$")
    public void deberiaVerLaListaDeHotelesOrganizadosPorCasas() {
        theActorInTheSpotlight().should(seeThat(the(TIPO_APTO.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_ESPERA_BUSQUEDA))),isVisible()));
    }



    @Entonces("^deberia ver la lista de hoteles organizados por precio$")
    public void deberiaVerLaListaDeHotelesOrganizadosPorPrecio() {
        theActorInTheSpotlight().attemptsTo(
                Esperar.enLaPagina(15).segundos()
        );
        theActorInTheSpotlight().should(seeThat(ValidarFiltroPrestamos.enHoteles()));
    }

    @Entonces("^deberia ver la disponibilidad del hotel$")
    public void deberiaVerLaDisponibilidadDelHotel() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        theActorInTheSpotlight().attemptsTo(
                Esperar.enLaPagina(10).segundos(),
                Scroll.to(INFORMACION_DISPONIBILIDAD)
        );
        theActorInTheSpotlight().should(
                seeThat(the(BOTON_RESERVAR),isVisible())
        );
    }


    @Y("^intenta realizar consulta de un alojamiento tipo casa$")
    public void intentaRealizarConsultaDeUnAlojamientoTipoCasa() {
        theActorInTheSpotlight().attemptsTo(
            Click.on(FILTRO_CASAS)
        );
    }

    @Y("^intenta realizar consulta por precio más bajo$")
    public void intentaRealizarConsultaPorPrecioMásBajo() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(FILTRO_PRECIO)
        );
    }

    @Y("^intenta revisar la disponibilidad$")
    public void intentaRevisarLaDisponibilidad() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(BOTON_DISPONIBILIDAD)
        );
    }

    @Y("^modifica las fechas de busqueda$")
    public void modificaLasFechasDeBusquedaFechaInicialFechaFinal() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(FECHA_INICIAL),
                Click.on(CALENDARIO_FECHA_INICIAL),
                Click.on(FECHA_FINAL),
                Click.on(CALENDARIO_FECHA_FINAL),
                Click.on(BOTON_BUSCAR_FECHA),
                Esperar.enLaPagina(5).segundos()
        );
    }
}
