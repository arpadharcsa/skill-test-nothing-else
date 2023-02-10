package com.cgi.boat.interview;

import java.util.Objects;

class Person {

    private final String firstName;
    private final String lastName;

    Person(final String firstname, final String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName)
               && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
