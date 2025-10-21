package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchResultsPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchSteps {

    @When("I search for {string}")
    public void i_search_for(String term) {
        Hooks.home.search(term);
    }

    @Then("I should see results containing {string}")
    public void i_should_see_results_containing(String term) {
        SearchResultsPage results = new SearchResultsPage(Hooks.driver);
        assertTrue(results.hasResultsFor(term), "Expected results to contain term: " + term);
    }
}
