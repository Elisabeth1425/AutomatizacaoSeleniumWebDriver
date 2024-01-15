package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPO extends BasePO {


     @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "senha")
    public WebElement inputSenha;

    @FindBy(id = "btn-entrar")
    public WebElement buttonEntrar;

    @FindBy(id = "mensagem")
    public WebElement spanMensagem;

    /**
     * Construtor padrão para criação de uma nova instancia da pagina de login.
     * @param driver Driver da pagina de login.
     */
    public loginPO(WebDriver driver) {
        super(driver);
        
    }
    
    public String obterMensagemAlerta(){
        return spanMensagem.getText();


    }


}
