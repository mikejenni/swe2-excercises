package collections;

import object.Person;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Collections {

    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        queue();
        hashMap();
        linkedHashMap();
        treeMap();
    }

  /*  static void arrayList(){


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
            tiere.remove(3);

        }catch (IndexOutOfBoundsException exception){
            System.err.println(exception);
        }

        tiere.remove(2);

        tiere.remove("a");

        tiere.clear();



    }

   */
    static void arrayList() {
        List<String> animals = new ArrayList<>();
        animals.add("Hund");
        animals.add("Katze");
        animals.add("Maus");
        animals.add("Vogel");
        animals.add("Elefant");
        System.out.println(animals.size());
        animals.add(2, "Tieger");
        System.out.println(animals);
        System.out.println(animals.contains("Katze"));
        animals.get(0);
        animals.remove(4);
        animals.remove("Hund");
        // animals.remove(20); -> java.lang.IndexOutOfBoundsException
        animals.remove("Kuh"); // Nichts passiert, kein Element wird gelöscht
        animals.forEach(animal -> System.out.println(animal));
        animals.clear();
    }
    static void linkedList(){

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
    static void hashSet() {
        Set<Person> people = new HashSet<>();
        Person peter = new Person("Peter", "Müller");
        people.add(new Person("Linda", "Krüger"));
        people.add(new Person("Linda", "Krüger"));
        people.add(new Person("Hans", "Muster"));
        people.add(new Person("Vorname", "Nachname"));
        people.add(peter);
        System.out.println(people.isEmpty());
        System.out.println(people.size());
        System.out.println(people.contains(peter));
        people.remove(peter);
        System.out.println(people);
        people.forEach(person -> System.out.println(person));
    }

    static void linkedHashSet(){

        Set<Person> persons = new LinkedHashSet<>();

        persons.add(new Person("Marino", "Bantli"));
        persons.add(new Person("Mike", "Jenni"));
        persons.add(new Person("Yanik", "Schupli"));





    }
     static void treeSet(){

        /*Set<Person> persons = new TreeSet<>(new PersonComperator());

         persons.add(new Person("Marino", "Bantli"), new PersonComperator());
         persons.add(new Person("Mike", "Jenni"));
         persons.add(new Person("Yanik", "Schupli"));

         System.out.println(persons.size());

         System.out.println(persons);*/

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

    static void queue() {
        Queue<Person> queue = new LinkedList();
        queue.add(new Person("Peter", "Meier"));
        queue.add(new Person("Linda", "Krüger"));
        queue.add(new Person("Hans", "Muster"));
        queue.add(new Person("Vorname", "Nachname"));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.forEach(person -> System.out.println(person));
    }

    static void linkedHashMap() {
        Map<Integer, Person> peopleMap = new LinkedHashMap<>(10,0.75f,true);
        peopleMap.put(0, new Person("Peter", "Meier"));
        peopleMap.put(1, new Person("Linda", "Krüger"));
        peopleMap.put(2, new Person("Linda", "Krüger"));
        peopleMap.put(3, new Person("Hans", "Muster"));
        peopleMap.put(4, new Person("Vorname", "Nachname"));
        System.out.println(peopleMap);
        peopleMap.get(0);
        peopleMap.get(3);
        System.out.println(peopleMap);
        peopleMap.forEach((index, person) -> System.out.println(index + ": " + person.getFirstName() + " " + person.getLastName()));
    }


}
