package test.web.banistmo.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import test.web.banistmo.interactions.Abrir;
import test.web.banistmo.tasks.DescargarDocumento;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static test.web.banistmo.utils.Constantes.URL_BANISTMO;

public class DescargarDocumentosStepDefinition {

    @Dado("que el {word} quiere descargar el documento de tratamientos de datos")
    public void queElUsuarioQuiereDescargarElDocumentoDeTratamientosDeDatos(String actor) {
        theActorCalled(actor).attemptsTo(
                Abrir.laPagina(URL_BANISTMO)
        );
    }
    @Cuando("este descargue el documento")
    public void esteDescargueElDocumento() {
        theActorInTheSpotlight().attemptsTo(
                DescargarDocumento.deProveedores()
        );
    }
    @Entonces("deberia la pantalla emergente con el documento")
    public void deberiaLaPantallaEmergenteConElDocumento() {
    }
}
