package com.cgi.boat.interview;

import java.util.List;

interface PeopleSetup {
    /**
     * Load the list of persons who should be analysed by the application
     * @return List of {@link Person}
     */
    List<Person> load();
}
