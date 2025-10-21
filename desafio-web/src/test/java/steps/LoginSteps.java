package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.Config;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        // done in Hooks.setUp()
    }

    @When("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        Hooks.home.goToLogin();
    }

    @When("I login with default credentials")
    public void i_login_with_default_credentials() {
        LoginPage login = new LoginPage(Hooks.driver);
        login.login(Config.loginEmail(), Config.loginPassword());
    }

    @Then("I should see I am logged in")
    public void i_should_see_i_am_logged_in() {
        assertTrue(Hooks.home.isLoggedIn(), "Expected to be logged in.");
    }
}
