package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {

    @FindBy(name = "q")
    public WebElement inputPesquisa;

      @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;


    /**
     * Costrutor para criação da pagina do google
     * @param driver Driver da pagina do google
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }
    
    /**
     * Metodo que ira efetuar uma pesquisa no google no texto informado e concluindo com enter.
     * @param texto Texto a ser pesquisado.
     */
    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Metodo que retorna o resultado aprroximado da pesquisa.
     * @return Retorna o resultado da pesquisa.
     */
    public String obterResultadoDaPesquisa(){
       return divResultadoPesquisa.getText();

    }

}
