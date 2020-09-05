package gherkin.hooks;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import suporte.DriverManager;

import java.util.concurrent.TimeUnit;

public class Hooks extends DriverManager {

    @Before
    public void BeforeTest(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.americanas.com.br");
    }

    @After
    public void AfterTest(){

        driver.close();


    }
}
