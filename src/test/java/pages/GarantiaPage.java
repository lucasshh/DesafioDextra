package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GarantiaPage{
    private WebDriver driver;

    public GarantiaPage(WebDriver _driver) {
        driver = _driver ;
    }

    public void clicarContinuar() throws InterruptedException {
        WebElement elemento = null;
        try {
            elemento = driver.findElement(By.xpath("//span[contains(text(),'Continuar')]"));

        } catch (Exception e) {

        }

        if (elemento != null){
            elemento.click();
            Thread.sleep(2000);

        }


    }
}
