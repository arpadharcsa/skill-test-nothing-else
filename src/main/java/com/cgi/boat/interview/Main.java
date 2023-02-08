package com.cgi.boat.interview;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final PeopleDataAnalyser analyser = new PeopleDataAnalyser();

    public static void main(String[] args) {
        LOGGER.info("initializing datasets");
        final Map<String, List<String>> firstByLast = PeopleProcessor.firstnamesByLastname(PeopleSetup.people);
        final Map<String, List<String>> lastByFirst = PeopleProcessor.lastnamesByFirstname(PeopleSetup.people);

        LOGGER.info("determine results");
        analyser.findTopFirstNameByOccourence(firstByLast)
                .forEach(s->LOGGER.info(s.toString()));
    }







}
