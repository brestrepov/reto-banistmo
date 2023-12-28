package test.web.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static java.lang.Boolean.TRUE;
import static test.web.banistmo.userinterfaces.AcercaDeNosotrosPage.TXT_TITULO_DOCUMENTO;
import static test.web.banistmo.utils.Constantes.TITULO_DOCUMENTO_PROVEEDORES;


public class LaPantallaDelDocumento implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(TXT_TITULO_DOCUMENTO.resolveFor(actor).getText()).isEqualTo(TITULO_DOCUMENTO_PROVEEDORES)
        );
        return TRUE;
    }

    public static Question<Boolean> esCorrecta() {
        return new LaPantallaDelDocumento();
    }
}
