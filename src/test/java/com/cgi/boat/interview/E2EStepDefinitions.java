package com.cgi.boat.interview;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E2EStepDefinitions {
    private List<Person> persons;

    @Given("some people whose names are")
    public void initTestData(DataTable people) {
        persons = people.asList(Person.class);
    }

    @When("the application processes these people")
    public void executeBusinessLogic() {
        final String[] args = {PeopleSetupFactory.CSV, PersonSerializer.serialize(persons)};
        Main.main(args);
    }

    @Then("the result gonna be the following")
    public void validateScenario(DataTable expectedResult) {
        final Queue<String> logs = LogCollectorLogbackAppender.getLogMessages();
        final List<String> expectedLogEntriesInExactOrder = expectedResult.asList(NameStatistic.class).stream()
                .map(NameStatistic::toString)
                .collect(Collectors.toList());

        Assertions.assertThat(logs)
                .isNotEmpty()
                .containsExactlyElementsOf(expectedLogEntriesInExactOrder);
    }

    @DataTableType
    public Person personTransformer(Map<String, String> entry) {
        return new Person(entry.get("firstname"), entry.get("lastname"));
    }

    @DataTableType
    public NameStatistic nameStatisticEntryTransformer(final Map<String, String> entry) {
        return NameStatistic.from(
                entry.get("firstname"),
                Long.parseLong(entry.get("Occurrence"))
        );
    }
}
