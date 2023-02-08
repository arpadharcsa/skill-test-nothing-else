package com.cgi.boat.interview;

class NameStatistic {
    private static final String FIRSTNAME_STATISTIC_PRINTABLE_FORMAT = "%s: %d";
    private final String name;
    private long occurency;

    static NameStatistic from(String name) {
        return new NameStatistic(name, 1L);
    }

    NameStatistic(String name, long occurency) {
        this.name = name;
        this.occurency = occurency;
    }

    NameStatistic incrementOccurency() {
        ++this.occurency;
        return this;
    }

    @Override
    public String toString() {
        return String.format(FIRSTNAME_STATISTIC_PRINTABLE_FORMAT, name, occurency);
    }
}
