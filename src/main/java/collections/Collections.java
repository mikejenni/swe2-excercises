package collections;

import object.Person;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Collections {


    static void arrayList(){


        List<String> tiere = new ArrayList<>();
        tiere.add("Hund");
        tiere.add("Elefant");
        tiere.add("Fledermaus");
        tiere.add("Maus");
        tiere.add("Katze");

        System.out.println(tiere.size());

        tiere.add(2,"Vogel");

        System.out.println(tiere);

        if(tiere.contains("Hund")) {
            System.out.println("exists");

        }

        System.out.println(tiere.get(2));

        tiere.remove(1);

        tiere.remove("Hund");

        try {
            tiere.remove(99);

        }catch (IndexOutOfBoundsException exception){
            System.err.println(exception);
        }

        tiere.remove(99);

        tiere.remove("a");

        tiere.clear();



    }

    static void LinkedList(){

        List<String> tiere = new LinkedList<>();
        tiere.add("Hund");
        tiere.add("Elefant");
        tiere.add("Fledermaus");
        tiere.add("Maus");
        tiere.add("Katze");

        System.out.println(tiere.size());

        System.out.println(tiere.indexOf("Maus"));

        System.out.println(tiere.indexOf("Wal"));

        System.out.println(tiere.get(1));

        System.out.println(((LinkedList)tiere).getFirst());
        System.out.println(((LinkedList)tiere).getLast());

        System.out.println(((LinkedList)tiere).removeFirst());
        System.out.println(((LinkedList)tiere).removeLast());
    }

    static void linkedHashSet(){

        Set<Person> persons = new LinkedHashSet<>();

        persons.add(new Person("Marino", "Bantli"));
        persons.add(new Person("Mike", "Jenni"));
        persons.add(new Person("Yanik", "Schupli"));





    }
     static void treeSet(){

        Set<Person> persons = new TreeSet<>(new PersonComperator());

         persons.add(new Person("Marino", "Bantli"), new PersonComperator());
         persons.add(new Person("Mike", "Jenni"));
         persons.add(new Person("Yanik", "Schupli"));

         System.out.println(persons.size());

         System.out.println(persons);

     }

     static void hashMap(){

        Map<String,List<Person>> persons= new HashMap<>();

        List<Person> arrPersons = new ArrayList<>();

         arrPersons.add(new Person("Marino", "Bantli"));
         arrPersons.add(new Person("Mike", "Jenni"));
         arrPersons.add(new Person("Yanik", "Schupli"));

         List<Person> friends = new ArrayList<>();
         friends.add(new Person("Robin", "Portner"));
         friends.add(new Person("Fritz", "Mueller"));

         persons.put("family", arrPersons);
         persons.put("office", null);
         persons.put("friends", friends);


         System.out.println(persons.size());

         System.out.println(persons.entrySet());

         System.out.println(persons.keySet());

         System.out.println(persons);
     }

     static void treeMap(){
        Map<Integer, Person> persons = new TreeMap<>();
        persons.put(0, new Person("A", "A"));
        persons.put(0, new Person("B", "A"));
        persons.put(1, new Person("C", "A"));
        persons.put(1, new Person("D", "A"));
        persons.put(2, new Person("E", "A"));

         System.out.println(persons);



     }





}
