package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final By signupLoginLink = By.cssSelector("a[href='/login']");
    private final By logoutLink = By.cssSelector("a[href='/logout']");
    private final By loggedInAs = By.xpath("//a[contains(.,'Logged in as')]");
    private final By searchInput = By.id("search_product");
    private final By searchBtn = By.id("submit_search");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void open(String baseUrl){
        driver.get(baseUrl);
    }

    public void goToLogin(){
        click(signupLoginLink);
    }

    public boolean isLoggedIn(){
        try {
            return driver.findElement(loggedInAs).isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    public void search(String term){
        type(searchInput, term);
        click(searchBtn);
    }
}
