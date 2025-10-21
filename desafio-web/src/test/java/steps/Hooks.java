package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.Config;
import utils.DriverFactory;

public class Hooks {
    public static WebDriver driver;
    public static HomePage home;

    @Before
    public void setUp(){
        driver = DriverFactory.get();
        home  = new HomePage(driver);
        home.open(Config.baseUrl());
    }

    @After
    public void tearDown(){
        DriverFactory.quit();
    }
}
