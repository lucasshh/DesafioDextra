package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class CadastroFormPage {
    private WebDriver driver;

    public CadastroFormPage(WebDriver _driver) {
        driver = _driver ;
    }
    public void digitarEmail(String email) {
        driver.findElement(By.id("email-input")).sendKeys(email);



    }

    public void digitarSenha(String senha){
        //digitar no campo com id="password-input"
        driver.findElement(By.id("password-input")).sendKeys(senha);


    }

    public void digitarCpf(String cpf){
        driver.findElement(By.id("cpf-input")).sendKeys(cpf);


    }

    public void digitarNome(String nome){
        driver.findElement(By.id("name-input")).sendKeys(nome);


    }

    public void digitarDataNasc(String data){
        driver.findElement(By.id("birthday-input")).sendKeys(data);


    }

    public void selecionarSexo(){
        driver.findElement(By.xpath("//label[@for=\"gender_F\"]")).click();


    }

    public void digitarTelefone(String telefone){
        driver.findElement(By.id("phone-input")).sendKeys(telefone);


    }

    public void clicarSubmit(){
        driver.findElement(By.xpath("//button[@type=\"submit\"][@class=\"btn btn-primary submit-button  cadastroForm-submit\"]")).click();

    }


    public void validarMensagem(String mensagem) {
        int flag = 0;
        String valor = "";
        List<WebElement> elemento;
        elemento = driver.findElements(By.xpath("//div[@class=\"inputGroup-error \"]"));
        if (elemento == null){
            elemento = driver.findElements(By.xpath("//div[@id=\"password\"]//span[@class=\"passwordWrapper-msg\"]"));

            if (elemento == null){
                Assert.fail("Não foram identificadas mensagens de erro na tela");
            }
        }
        for(WebElement _elemento : elemento){
            valor = _elemento.getText();
            if (valor.contains(mensagem)){
                flag = 1;

            }

        }
    if (flag == 0){
        Assert.fail("A mensagem de erro não foi identificada: " +mensagem);

    }

    }

    public void validarLogadoNoSistema() {

        String valor = driver.findElement(By.xpath("//div[@id='h_user']/span/div")).getText();
        if (valor.contains("olá, faça seu login")){

            Assert.fail("Cliente não foi logado ao sistema");
        }



    }
}
