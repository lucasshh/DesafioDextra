package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCelPage {
    private WebDriver driver;

    public AddCelPage(WebDriver _driver) {
        driver = _driver ;
    }
    public void clicarEmComprar() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class=\"Wrapper-sc-1i9za0i-3 kmswup ViewUI-sc-1ijittn-6 iXIDWU\"]//span[@class=\"TextUI-sc-1i9za0i-4 bdJeMR TextUI-sc-12tokcy-0 cwGTtj\"]")).click();

        Thread.sleep(2000);


    }
}
