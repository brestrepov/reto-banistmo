package test.web.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BTN_ACEPTAR_AVISO_PRIVACIDAD = Target.the("Boton de aceptar aviso de privacidad").located(By.id("btn-aceptar-cookies"));
    public static final Target BTN_ACERCA_DE_NOSOTROS = Target.the("Boton acerca de nosotros").located(By.xpath("//a[contains(.,'Acerca de nosotros')]"));

    private HomePage() {
    }
}
