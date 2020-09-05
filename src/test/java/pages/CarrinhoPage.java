package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage {
    private WebDriver driver;

    public CarrinhoPage(WebDriver _driver) {
        driver = _driver ;
    }
    public void addQuantidade() {
        driver.findElement(By.id("icon-plus")).click();

    }


    public void validarParcelamento(String parcelamento) {
        String valor = driver.findElement(By.className("summary-totalInstallments")).getText();
        if(!valor.contains(parcelamento)){
            Assert.fail("Opção de parcelamento não está disponível");


        }

    }

    public void validarValorTotal(Integer total) {
        String valor = driver.findElement(By.className("summary-total")).getText();
        valor = valor.replace("R$ ", "");
        valor = valor.replace(".", "");


        int _valor = Integer.parseInt(valor);

        if(_valor > total){
            Assert.fail("Opção de parcelamento não está disponível");


        }
    }
}


