package ch.juventus.javadoc.exceptions;

public class Application {
    public static void main(String[] args) {


        PersonRepository pRepo1 = new PersonRepository();
        try {
            pRepo1.findById(42);
        } catch (PersonNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        try {
            pRepo1.addPerson();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("huhuu");

    }
}
