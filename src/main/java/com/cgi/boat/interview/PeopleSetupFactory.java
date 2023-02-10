package com.cgi.boat.interview;

import java.util.Optional;

final class PeopleSetupFactory {
    static final String DEFAULT = "default";
    static final String CSV = "csv";

    static PeopleSetup create(final String type, final String csv) {
        final PeopleSetup setup;
        final String typeOfPeopleSetup = Optional.ofNullable(type).orElse(DEFAULT);
        switch (typeOfPeopleSetup) {
            case CSV:
                setup = new CSVPeopleSetup(csv);
                break;
            case DEFAULT:
            default:
                setup = new InMemoryPeopleSetup();
        }
        return setup;
    }

    private PeopleSetupFactory() {
        throw new IllegalStateException();
    }
}
