package javaCollections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructures {

    // Initial data. Can be loaded from the DB or from the File (as xml, json, etc.)
    public static String[] vehicles = {"ambulance", "helicopter", "guard boat"};
    public static String[][] drivers = {
            {"Bob", "John", "Marry", "Helen"}, // drives Ambulance
            {"Joe", "Sam", "Fred"}, // drives Helicopter
            {"Tom", "Emily", "Gloria", "Heather"} // drives Guard boat
    };

    public static void main(String[] args) {

        Map<String, Set<String>> personnel = new HashMap<>();

        for(int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];
            Set<String> driverSet = new LinkedHashSet<>();

            for(String driver: driversList) {
                driverSet.add(driver);
            }

            personnel.put(vehicle, driverSet);
        }

        // Console output to list drivers of Helicopter
        {
            Set<String> driversList = personnel.get(("heLICOpter").toLowerCase());

            for (String driver: driversList) {
                System.out.println(driver);
            }
        }

        System.out.println();

        // Iterate through all values
        for (String key: personnel.keySet()) {

            System.out.print(key); // prints key value
            System.out.print(": "); // prints semicolon in the same line after key value

            Set<String> driversList = personnel.get(key);

            for (String driver: driversList) {
                System.out.print(driver);
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
