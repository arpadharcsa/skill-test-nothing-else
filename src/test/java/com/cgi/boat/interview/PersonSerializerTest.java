package com.cgi.boat.interview;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonSerializerTest {

    @Test
    void serialize() {
        //given
        final List<Person> persons = Arrays.asList(new Person("John", "Doe"), new Person("Jane", "Doe"));
        final String expectedResult = "John,Doe\nJane,Doe";

        //when
        String result = PersonSerializer.serialize(persons);

        //then
        Assertions.assertThat(result)
                .isEqualTo(expectedResult);
    }

    @Test
    void deserialize() {
        //given
        final String serializedPersons = "John,Doe\nJane,Doe";
        final List<Person> expected = Arrays.asList(new Person("John", "Doe"),
                                                   new Person("Jane", "Doe"));
        //when
        final List<Person> result = PersonSerializer.deserialize(serializedPersons);
        //then
        Assertions.assertThat(result)
                .isNotEmpty()
                .containsAll(expected);
    }
}