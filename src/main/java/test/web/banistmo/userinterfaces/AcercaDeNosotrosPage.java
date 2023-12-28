package test.web.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AcercaDeNosotrosPage {

    public static final Target BTN_INFORMACION_CORPORATIVA = Target.the("Boton informacion corporativa").located(By.xpath("//a[contains(.,'Información Corporativa')]"));
    public static final Target BTN_PROVEEDORES = Target.the("Boton proveedores").located(By.xpath("//a[contains(.,'Proveedores')]"));
    public static final Target TXT_TITULO_PROVEEDORES = Target.the("Titulo proveedores").located(By.xpath("//h1[contains(.,'Proveedores')]"));
    public static final Target BTN_CONOCE_MAS = Target.the("Boton conoce mas").located(By.xpath("//button[contains(.,'Conoce más')]"));
    public static final Target TXT_TITULO_DOCUMENTO = Target.the("Titulo Aviso de Convocatoria").located(By.xpath("//h4[contains(.,'Aviso de Convocatoria')]"));

    private AcercaDeNosotrosPage() {
    }
}
