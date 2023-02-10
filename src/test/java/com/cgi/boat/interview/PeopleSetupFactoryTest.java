package com.cgi.boat.interview;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PeopleSetupFactoryTest {
    @Test
    void testCreatingDefaultSetup() {
        //given
        final String defaultType = PeopleSetupFactory.DEFAULT;
        final String emptyCSVData = "";

        //when
        PeopleSetup setup = PeopleSetupFactory.create(defaultType, emptyCSVData);

        //then
        Assertions.assertThat(setup)
                .isExactlyInstanceOf(InMemoryPeopleSetup.class);
    }
    @Test
    void testCreatingDefaultSetupForUnknownType() {
        //given
        final String defaultType = "unknown";
        final String emptyCSVData = "";

        //when
        PeopleSetup setup = PeopleSetupFactory.create(defaultType, emptyCSVData);

        //then
        Assertions.assertThat(setup)
                .isExactlyInstanceOf(InMemoryPeopleSetup.class);
    }

    @Test
    void testCreatingCSVSetup() {
        //given
        final String defaultType = PeopleSetupFactory.CSV;
        final String CSVData = "John,Doe\nJane,Doe";
        final List<Person> persons = Arrays.asList(new Person("John", "Doe"),
                                                   new Person("Jane", "Doe"));

        //when
        PeopleSetup setup = PeopleSetupFactory.create(defaultType, CSVData);

        //then
        Assertions.assertThat(setup)
                .isExactlyInstanceOf(CSVPeopleSetup.class);
        Assertions.assertThat(setup.load())
                .isNotEmpty()
                .hasSize(2)
                .containsAll(persons);
    }
}