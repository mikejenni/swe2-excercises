package ch.juventus.javadoc.exceptions;

import object.Person;

public class PersonRepository {

    public Person findById(int id) throws PersonNotFoundException{

        throw new PersonNotFoundException(String.format("No Person with ID: %d", id));

    }

    public void addPerson() {
        throw new IllegalArgumentException("This is not valid");
    }


}
