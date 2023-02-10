package com.cgi.boat.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PeopleDataAnalyserTest {

    @Test
    @DisplayName("Determine the top 3 first names based on their occurencies")
    void determineTopThreeMostCommonFirstName() {
        //given
        final Map<String, List<String>> firstNamesByLastNames = new HashMap<>();
        firstNamesByLastNames.put("John", Arrays.asList("Doe", "Silver"));
        firstNamesByLastNames.put("Peter", Arrays.asList("Doe", "Arne", "Cartwright"));
        firstNamesByLastNames.put("Gerald", Arrays.asList("Case"));
        firstNamesByLastNames.put("Clive", Arrays.asList("Carter"));

        //when
        final List<NameStatistic> result = PeopleDataAnalyser.findTopFirstNameByOccourence(firstNamesByLastNames);

        //then
        Assertions.assertThat(result)
                .as("The result do not contain the necessary items in the expected order.")
                .isNotEmpty()
                .hasSize(3)
                .containsExactlyElementsOf(
                        Arrays.asList(
                                NameStatistic.from("Peter",3),
                                NameStatistic.from("John",2),
                                NameStatistic.from("Clive",1)
                        )
                );
    }
}