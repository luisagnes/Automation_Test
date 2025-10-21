package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    public static WebDriver get(){
        if (DRIVER.get() == null){
            String browser = Config.browser().toLowerCase();
            boolean headless = Config.headless();

            switch (browser){
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions fx = new FirefoxOptions();
                    if (headless) fx.addArguments("--headless=new");
                    DRIVER.set(new FirefoxDriver(fx));
                }
                default -> {
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    if (headless) options.addArguments("--headless=new");
                    options.addArguments("--start-maximized");
                    options.addArguments("--window-size=1920,1080");
                    DRIVER.set(new ChromeDriver(options));
                }
            }
        }
        return DRIVER.get();
    }

    public static void quit(){
        var d = DRIVER.get();
        if (d != null){
            d.quit();
            DRIVER.remove();
        }
    }
}
