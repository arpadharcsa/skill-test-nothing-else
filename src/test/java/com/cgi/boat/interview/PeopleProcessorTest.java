package com.cgi.boat.interview;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PeopleProcessorTest {

    @Test
    void lastnamesByFirstname() {
        //given
        final List<Person> testData = Collections.emptyList();
        //when
        final Map<String, List<String>> result = PeopleProcessor.lastnamesByFirstname(testData);
        //then
        assertTrue(result.isEmpty());
    }

    @Test
    void firstnamesByLastname() {
        //given
        final List<Person> testData = Collections.emptyList();
        //when
        final Map<String, List<String>> result = PeopleProcessor.lastnamesByFirstname(testData);
        //then
        assertTrue(result.isEmpty());
    }
}