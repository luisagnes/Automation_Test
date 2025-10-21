package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By loginEmail = By.cssSelector("input[data-qa='login-email']");
    private final By loginPassword = By.cssSelector("input[data-qa='login-password']");
    private final By loginButton = By.cssSelector("button[data-qa='login-button']");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void login(String email, String password){
        type(loginEmail, email);
        type(loginPassword, password);
        click(loginButton);
    }
}
