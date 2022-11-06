package javaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        // SETS STORES ONLY UNIQUE VALUES
        HashSet<String> hashSet = new HashSet<>(); // RANDOMLY UNSORTED
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(); // AS ADDED IN SET
        TreeSet<String> treeSet = new TreeSet<>(); // SORTED SET (ALPHABETICALLY IN THIS CASE)

        addElements(hashSet);
        addElements(linkedHashSet);
        addElements(treeSet);

        showElements(hashSet);
        System.out.println();
        showElements(linkedHashSet);
        System.out.println();
        showElements(treeSet);

    }

    public static void addElements(Set<String> strings) {

        strings.add("Toyota");
        strings.add("Ford");
        strings.add("Renault");
        strings.add("Jeep");
        strings.add("VW");
        strings.add("Audi");

        // Adding duplicated value in Set
        strings.add("Renault");

        // PRINT ALL SET IN THE ROW
        System.out.println(strings);

    }

    public static void showElements(Set<String> strings) {

        for(String string: strings) {
            System.out.println(string);
        }

        // DOES SET CONTAINS A GIVEN ITEM
        if (strings.contains("Opel")) {
            System.out.println("Contains 'Opel'");
        } else {
            System.out.println("Set does not contains 'Opel'");
        }
    }
}
