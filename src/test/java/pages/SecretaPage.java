package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecretaPage{
    private WebDriver driver;

    public SecretaPage(WebDriver _driver) {
       driver = _driver ;
    }

    public void clicarBusca(String celular) throws InterruptedException {
        driver.findElement(By.id("h_search-input")).sendKeys(celular);
        driver.findElement(By.id("h_search-btn")).click();
        Thread.sleep(2000);


    }
}
