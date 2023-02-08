package com.cgi.boat.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PeopleProcessorTest {
    private final String johnAsFirstName = "John";
    private final String peterAsFirstName = "Peter";
    private final String doeAsLastName = "Doe";
    private final String silverAsLastName = "Silver";

    private final List<Person> testData = Collections.unmodifiableList(
            Arrays.asList(
                    new Person(johnAsFirstName, doeAsLastName),
                    new Person(johnAsFirstName, silverAsLastName),
                    new Person(peterAsFirstName, doeAsLastName)
            )
    );

    @Test
    @DisplayName("Check collecting last names based on the first name")
    void lastnamesByFirstname() {
        //given
        final int expectedSizeOfJohns = 2;
        final int expectedSizeOfPeters = 1;

        final List<String> firstNames = Collections.unmodifiableList(
                testData.stream()
                        .map(Person::getFirstName)
                        .distinct()
                        .collect(Collectors.toList())
        );

        final List<String> lastnamesOfPeter = Collections.unmodifiableList(
                testData.stream()
                        .filter(p -> peterAsFirstName.equals(p.getFirstName()))
                        .map(Person::getLastName)
                        .distinct()
                        .collect(Collectors.toList())
        );

        final List<String> lastnamesOfJohn = Collections.unmodifiableList(
                testData.stream()
                        .filter(p -> johnAsFirstName.equals(p.getFirstName()))
                        .map(Person::getLastName)
                        .distinct()
                        .collect(Collectors.toList())
        );

        //when
        final Map<String, List<String>> result = PeopleProcessor.lastnamesByFirstname(testData);

        //then
        Assertions.assertThat(result.keySet())
                .as("Invalid keyset has been occured")
                .isNotEmpty()
                .containsAll(firstNames);

        final List<String> johns = result.get(johnAsFirstName);
        Assertions.assertThat(johns)
                .as("Invalid size of Johnnys")
                .isNotEmpty()
                .hasSize(expectedSizeOfJohns)
                .containsAll(lastnamesOfJohn);

        final List<String> peters = result.get(peterAsFirstName);
        Assertions.assertThat(peters)
                .as("Invalid size of Peters")
                .isNotEmpty()
                .hasSize(expectedSizeOfPeters)
                .containsAll(lastnamesOfPeter);
    }

    @Test
    @DisplayName("Check collecting fist names based on the last name")
    void firstnamesByLastname() {
        //given
        final int expectedSizeOfSilvers = 1;
        final int expectedSizeOfDoes = 2;
        final List<String> lastNames = Collections.unmodifiableList(
                testData.stream()
                        .map(Person::getLastName)
                        .distinct()
                        .collect(Collectors.toList())
        );

        final List<String> firstNameOfSilvers = Collections.unmodifiableList(
                testData.stream()
                        .filter(p -> silverAsLastName.equals(p.getLastName()))
                        .map(Person::getFirstName)
                        .distinct()
                        .collect(Collectors.toList()));

        final List<String> firstNameOfDoes = Collections.unmodifiableList(
                testData.stream()
                        .filter(p -> doeAsLastName.equals(p.getLastName()))
                        .map(Person::getFirstName)
                        .distinct()
                        .collect(Collectors.toList()));

        //when
        final Map<String, List<String>> result = PeopleProcessor.lastnamesByFirstname(testData);

        //then
        Assertions.assertThat(result.keySet())
                .as("Invalid keyset has been occured")
                .isNotEmpty()
                .containsAll(lastNames);

        final List<String> does = result.get(doeAsLastName);
        Assertions.assertThat(does)
                .as("Invalid size of Does")
                .isNotEmpty()
                .hasSize(expectedSizeOfDoes)
                .containsAll(firstNameOfDoes);

        final List<String> silvers = result.get(silverAsLastName);
        Assertions.assertThat(silvers)
                .as("Invalid size of Silvers")
                .isNotEmpty()
                .hasSize(expectedSizeOfSilvers)
                .containsAll(firstNameOfSilvers);
    }
}