package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe base para criação das novas PagesObjects.
 * Toda as pages devem ser herdadas dsta classe.
 */
public class BasePO {

    /** Driver base que sera usado pelas pages */
    protected WebDriver driver;
    

    /**
     * Construtor base para criação da fabrica de elementos (PageFactory)
     * @param driver Driver da pagina atual.
     */
    public BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
