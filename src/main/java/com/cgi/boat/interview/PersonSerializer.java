package com.cgi.boat.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

final class PersonSerializer {

    private static final String SERIALIZATION_FORMAT = "%s,%s";
    private static final String SEPARATOR = ",";
    private static final String LINE_BREAK = "\n";

    static String serialize(final List<Person> persons) {
        return persons.stream()
                .map(p -> String.format(SERIALIZATION_FORMAT, p.getFirstName(), p.getLastName()))
                .collect(Collectors.joining("\n"));
    }

    static List<Person> deserialize(final String csv) {
        return Arrays.stream(csv.split(LINE_BREAK))
                .map(line -> {
                    String[] props = line.split(SEPARATOR);
                    return new Person(props[0], props[1]);
                }).collect(Collectors.toList());
    }

    private PersonSerializer() {
        throw new IllegalStateException();
    }
}
