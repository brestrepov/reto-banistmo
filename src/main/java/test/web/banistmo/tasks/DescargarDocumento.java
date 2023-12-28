package test.web.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.web.banistmo.interactions.AceptaAviso;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static test.web.banistmo.userinterfaces.AcercaDeNosotrosPage.BTN_CONOCE_MAS;
import static test.web.banistmo.userinterfaces.AcercaDeNosotrosPage.BTN_INFORMACION_CORPORATIVA;
import static test.web.banistmo.userinterfaces.AcercaDeNosotrosPage.BTN_PROVEEDORES;
import static test.web.banistmo.userinterfaces.AcercaDeNosotrosPage.TXT_TITULO_PROVEEDORES;
import static test.web.banistmo.userinterfaces.HomePage.BTN_ACERCA_DE_NOSOTROS;

public class DescargarDocumento implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(AceptaAviso.dePrivacidad());

        actor.attemptsTo(
                Click.on(BTN_ACERCA_DE_NOSOTROS),
                WaitUntil.the(BTN_INFORMACION_CORPORATIVA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_INFORMACION_CORPORATIVA),
                Click.on(BTN_PROVEEDORES));

        actor.attemptsTo(
                WaitUntil.the(TXT_TITULO_PROVEEDORES, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(BTN_CONOCE_MAS).andAlignToBottom(),
                Click.on(BTN_CONOCE_MAS));
    }

    public static DescargarDocumento deProveedores() {
        return instrumented(DescargarDocumento.class);
    }
}
