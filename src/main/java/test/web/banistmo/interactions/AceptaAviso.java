package test.web.banistmo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static test.web.banistmo.userinterfaces.HomePage.BTN_ACEPTAR_AVISO_PRIVACIDAD;

public class AceptaAviso implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(BTN_ACEPTAR_AVISO_PRIVACIDAD.resolveFor(actor).isVisible())
                .andIfSo(Click.on(BTN_ACEPTAR_AVISO_PRIVACIDAD)));
    }

    public static AceptaAviso dePrivacidad() {
        return instrumented(AceptaAviso.class);
    }
}
