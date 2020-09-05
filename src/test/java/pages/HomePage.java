package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{
    private WebDriver driver;

    public HomePage(WebDriver _driver) {
        driver = _driver ;
    }
    public void clicarSignUp(){

        driver.findElement(By.xpath("//span[@class=\"usr-act-text\"]")).click();
        driver.findElement(By.linkText("Cliente novo? Cadastrar")).click();



    }
}
