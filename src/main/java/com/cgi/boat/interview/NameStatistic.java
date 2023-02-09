package com.cgi.boat.interview;

import java.util.Objects;

class NameStatistic implements Comparable<NameStatistic> {
    private static final String FIRSTNAME_STATISTIC_PRINTABLE_FORMAT = "%s:%d";
    private final String name;
    private final long occurency;

    static NameStatistic from(String name, long occurency) {
        return new NameStatistic(name, occurency);
    }

    NameStatistic(String name, long occurency) {
        this.name = name;
        this.occurency = occurency;
    }

    @Override
    public String toString() {
        return String.format(FIRSTNAME_STATISTIC_PRINTABLE_FORMAT, name, occurency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NameStatistic that = (NameStatistic) o;
        return occurency == that.occurency && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occurency);
    }

    @Override
    public int compareTo(NameStatistic that) {
        final int comparationResultByOccurence = Long.compare(that.occurency, occurency);

        if (comparationResultByOccurence != 0) {
            return comparationResultByOccurence;
        }

        return String.CASE_INSENSITIVE_ORDER.compare(name, that.name);
    }
}
