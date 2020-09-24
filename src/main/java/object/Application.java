package object;


public class Application {
    public static void main(String[] args){

        Address address = new Address("Altstetterstrasse", 147, 8048, "Zürich");
        Person person = new Person("Mike","Jenni",address,36,false);
        System.out.println(person);




        Address address1 = new Address("Altstetterstrasse", 147, 8048, "Zürich");
        Person person1 = new Person("Mike","Jenni",address,36,false);

        Address address2 = new Address("Altstetterstrasse", 147, 8048, "Zürich");
        Person person2 = new Person("Mike","Jenni",address,36,false);

        System.out.println(person1.equals(person2));
        }
    }

