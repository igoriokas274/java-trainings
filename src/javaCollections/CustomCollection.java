package javaCollections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " : " + name;
    }

}

public class CustomCollection {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Dan");
        Person person2 = new Person(2, "Sam");
        Person person3 = new Person(3, "John");
        Person person4 = new Person(1, "Sam");

        Map<Person, Integer> linkedHashMap = new LinkedHashMap<>();
        Set<Person> linkedHashSet = new LinkedHashSet<>();

        linkedHashMap.put(person1, 1);
        linkedHashMap.put(person2, 2);
        linkedHashMap.put(person3, 3);
        linkedHashMap.put(person4, 1);

        System.out.println(linkedHashMap); // Data from toString method in Person class

        for (Person person: linkedHashMap.keySet()) {
            System.out.println(person + " : " + linkedHashMap.get(person));
        }

        System.out.println();

        linkedHashSet.add(person1);
        linkedHashSet.add(person2);
        linkedHashSet.add(person3);
        linkedHashSet.add(person4);

        System.out.println(linkedHashSet); // Data from toString method in Person class

        for (Person person: linkedHashSet) {
            System.out.println(person);
        }

    }
}
