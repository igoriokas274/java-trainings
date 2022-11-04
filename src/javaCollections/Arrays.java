package javaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Time spent for adding values in ArrayList " + doTimeCalculation(arrayList) + " ms");
        System.out.println("Time spent for adding values in LinkedList " + doTimeCalculation(linkedList) + " ms");
    }

    public static long doTimeCalculation(List<Integer> values) {

        long start = System.currentTimeMillis();

        // Bulk inserting values to List
        for (int i = 0 ; i < 1E5; i++) {
            values.add(i);
        }

        long end = System.currentTimeMillis();

        return (end - start);


    }
}
