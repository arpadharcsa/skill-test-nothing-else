package com.cgi.boat.interview;

import java.util.List;
import java.util.Objects;

class CSVPeopleSetup implements PeopleSetup {
    private List<Person> persons;

    CSVPeopleSetup(String csv) {
        Objects.requireNonNull(csv);
        persons = PersonSerializer.deserialize(csv);
    }

    @Override
    public List<Person> load() {
        return persons;
    }
}
