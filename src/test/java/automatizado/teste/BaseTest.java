package automatizado.teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    
    protected static WebDriver driver;
    private static final String URL_BASE = "file:///C:/Users/elisa/OneDrive/Documentos/Cursos/Udemy/Testes%20Automatizados%20-%20Curso%20completo%20com%20Selenium%20e%20Java/Teste%20Automatizado/controle-de-produtos/sistema/login.html";
    private static final String CAMINHO_DRIVER = "src/test/java/automatizado/resource/chromedriver-v12006099.exe";
    
    @BeforeClass
    public static void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass
    public static void finalizar(){
        driver.quit();

    }




}
