package automatizado.teste;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import automatizado.page.loginPO;

public class loginTest extends BaseTest {

 private static loginPO loginPage;

    @BeforeClass
    public static void prepararTestes(){
    loginPage = new loginPO(driver);

    }

    @Test
    public void TC001_nãoDeveLogarNoSistemaComEmailESenhaEmVazios(){
     
        loginPage.inputEmail.sendKeys("");
        loginPage.inputSenha.sendKeys("");

        loginPage.buttonEntrar.click();
        String mensagem  = loginPage.obterMensagemAlerta();

        assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");

    }
















}
