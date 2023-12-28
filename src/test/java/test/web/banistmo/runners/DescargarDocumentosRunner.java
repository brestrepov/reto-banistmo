package test.web.banistmo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/descargar_documentos.feature",
        glue = {"test.web.usuario.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DescargarDocumentosRunner {
}
