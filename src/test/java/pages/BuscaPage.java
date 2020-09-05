package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BuscaPage {
    private WebDriver driver;

    public BuscaPage(WebDriver _driver) {
        driver = _driver ;
    }
    public void selecionarCelular() throws InterruptedException {
        List<WebElement> teste = driver.findElements(By.xpath("//h2[@class='TitleUI-bwhjk3-15 khKJTM TitleH2-sc-1wh9e1x-1 gYIWNc']"));
        for(WebElement _teste : teste){
            _teste.click();
            break;
        }
        Thread.sleep(2000);

    }

}
