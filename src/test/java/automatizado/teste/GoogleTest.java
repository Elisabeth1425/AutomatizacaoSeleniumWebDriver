package automatizado.teste;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import automatizado.page.GooglePO;


public class GoogleTest extends BaseTest {


    private static GooglePO googlePage;

    @BeforeClass
    public static void prepararTestes(){
        driver.get("https://www.google.com.br/");
        googlePage = new GooglePO(driver);

    }

    @Test
    public void TC001_deveSerPosivelPesquisarNoGoogleOTextoCamarão(){
     
        googlePage.pesquisar("camarão");

        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

    }

     @Test
    public void TC002_deveSerPosivelPesquisarNoGoogleOTextoSalmão(){
     
        googlePage.pesquisar("salmão");

        String resultado = googlePage.obterResultadoDaPesquisa();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

    }

}
