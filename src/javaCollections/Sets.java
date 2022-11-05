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

        createAndPrintSet(hashSet);
        createAndPrintSet(linkedHashSet);
        createAndPrintSet(treeSet);

    }

    public static void createAndPrintSet(Set<String> stringSet) {

        stringSet.add("Toyota");
        stringSet.add("Ford");
        stringSet.add("Renault");
        stringSet.add("Jeep");
        stringSet.add("VW");
        stringSet.add("Audi");

        // Duplicated value in Set
        stringSet.add("Renault");

        // PRINT ALL SET IN THE ROW
        System.out.println(stringSet);

        // ITERATION
        for(String string: stringSet) {
            System.out.println(string);
        }

        // DOES SET CONTAINS A GIVEN ITEM
        if (stringSet.contains("Opel")) {
            System.out.println("Contains 'Opel'");
        } else {
            System.out.println("Set does not contains 'Opel'");
        }

    }
}
