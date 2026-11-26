package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Placeholder step definitions for example.feature.
 * Delete together with example.feature once the first real feature exists.
 */
public class ExampleSteps {

    private boolean implemented;

    @Given("an example scenario")
    public void anExampleScenario() {
        implemented = false;
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
        implemented = true;
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
        assertThat(implemented).isTrue();
    }
}
