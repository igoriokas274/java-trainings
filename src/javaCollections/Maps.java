package javaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>(); // UNSORTED MAP OR SORTING NOT GUARANTEED
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(); // AS ADDED MAP
        TreeMap<Integer, String> treeMap = new TreeMap<>(); // SORTED MAP

        listMap(hashMap);
        System.out.println();
        listMap(linkedHashMap);
        System.out.println();
        listMap(treeMap);

    }

    public static void listMap(Map<Integer, String> map) {

        map.put(1, "Toyota");
        map.put(4, "Dodge");
        map.put(7, "Opel");
        map.put(3, "Honda");
        map.put(8, "Renault");
        map.put(2, "Fiat");
        map.put(5, "Ford");
        map.put(9, "BMW");
        map.put(6, "Seat");
        map.put(0, "Skoda");

        System.out.println(map); // Prints all keys with values

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
