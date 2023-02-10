package com.cgi.boat.interview;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

final class PeopleProcessor {

    private static final Collector<Person, ?, Map<String, List<String>>> COLLECT_LAST_NAMES_BASED_ON_FIRST_NAMES = Collectors.groupingBy(
            Person::getFirstName,
            Collectors.mapping(Person::getLastName, Collectors.toList())
    );
    private static final Collector<Person, ?, Map<String, List<String>>> COLLECT_FIRST_NAMES_BASED_ON_LAST_NAMES = Collectors.groupingBy(
            Person::getLastName,
            Collectors.mapping(Person::getFirstName, Collectors.toList())
    );

    /**
     * Returns a {@link Map} where keys are first names and values lists of all last names of people from the input list who have the first name equal to the
     * key.
     * <p>
     * Example: For input: ["John Doe", "John Silver", "Peter Doe"] Expected result would be: { "John" -> ["Doe", "Silver"] "Peter" -> ["Doe"] }
     */
    static Map<String, List<String>> lastnamesByFirstname(final List<Person> people) {
        return Collections.unmodifiableMap(
                people.stream().collect(COLLECT_LAST_NAMES_BASED_ON_FIRST_NAMES)
        );
    }

    /**
     * Same as {@link PeopleProcessor#lastnamesByFirstname} except that the mapping returned is lastname -> firstnames
     * <p>
     * Example: For input: ["John Doe", "John Silver", "Peter Doe"] Expected result would be: { "Doe" -> ["John", "Peter"] "Silver" -> ["John"]
     */
    static Map<String, List<String>> firstnamesByLastname(final List<Person> people) {
        return Collections.unmodifiableMap(
                people.stream().collect(COLLECT_FIRST_NAMES_BASED_ON_LAST_NAMES)
        );
    }

    private PeopleProcessor() {
        throw new IllegalStateException("Utility class");
    }
}
