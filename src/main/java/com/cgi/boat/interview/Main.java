package com.cgi.boat.interview;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final PeopleDataAnalyser analyser = new PeopleDataAnalyser();

    public static void main(String[] args) {
        final boolean optionalArgumentsPresent = args.length > 1;
        final String inputType = optionalArgumentsPresent ? args[0] : PeopleSetupFactory.DEFAULT;
        final String input = optionalArgumentsPresent ? args[1] : "";

        final List<Person> people = PeopleSetupFactory.create(inputType, input).load();

        final Map<String, List<String>> lastByFirst = PeopleProcessor.lastnamesByFirstname(people);

        analyser.findTopFirstNameByOccourence(lastByFirst)
                .forEach(s -> LOGGER.info(s.toString()));
    }
}
