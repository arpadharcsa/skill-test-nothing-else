package com.cgi.boat.interview;

import java.util.List;
import java.util.Optional;

class CSVPeopleSetup implements PeopleSetup {
    private List<Person> persons;

    CSVPeopleSetup(String csvData) {
        persons = Optional.ofNullable(csvData)
                .map(PersonSerializer::deserialize)
                .orElseThrow();
    }

    @Override
    public List<Person> load() {
        return persons;
    }
}
