package com.cgi.boat.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class PersonSerializer {
    static String serialize(List<Person> persons) {
        return persons.stream()
                .map(p -> String.format("%s,%s", p.getFirstName(), p.getLastName()))
                .collect(Collectors.joining("\n"));
    }

    static List<Person> deserialize(String csv) {
        return Arrays.stream(csv.split("\n"))
                .map(line -> {
                    String[] props = line.split(",");
                    return new Person(props[0], props[1]);
                }).collect(Collectors.toList());
    }
    private PersonSerializer(){
        throw new IllegalStateException();
    }
}
