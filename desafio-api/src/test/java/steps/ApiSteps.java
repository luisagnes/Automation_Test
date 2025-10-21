package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ApiSteps {
    private Response response;
    private static final String ACTION_ID = "592f11060f95a3d3d46a987a";
    private static final String URL = "https://api.trello.com/1/actions/" + ACTION_ID;

    @When("I GET the Trello action by id")
    public void i_get_the_trello_action_by_id() {
        response = given().when().get(URL);
    }

    @Then("the response status should be 200")
    public void the_response_status_should_be_200() {
        response.then().statusCode(200);
    }

    @Then("I print the list name from the payload")
    public void i_print_the_list_name_from_the_payload() {
        // The field path is: data.list.name
        String listName = response.jsonPath().getString("data.list.name");
        System.out.println("\n=== Trello List Name: " + listName + " ===\n");
        // Optional assertion that the field exists (not null)
        assertThat("data.list.name should not be null", listName != null && !listName.isBlank(), equalTo(true));
    }
}
