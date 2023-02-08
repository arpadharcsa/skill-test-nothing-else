package com.cgi.boat.interview;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("some people whose names are")
    public void initTestData(DataTable people) {
        throw new PendingException();
    }

    @When("the application processes these people")
    public void executeBusinessLogic() {
        throw new PendingException();
    }

    @Then("the result gonna be the following")
    public void validateScenario(DataTable expectedResult) {
        throw new PendingException();
    }

}
