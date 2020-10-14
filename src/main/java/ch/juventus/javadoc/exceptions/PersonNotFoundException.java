package ch.juventus.javadoc.exceptions;

public class PersonNotFoundException extends Exception {

    public PersonNotFoundException(String message) {
        super(message);
    }

    public PersonNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
