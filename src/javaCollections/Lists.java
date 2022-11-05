package javaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        // DUPLICATED VALUES ARE ACCEPTABLE
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(33);
        arrayList.add(9);
        arrayList.add(2);

        for (Integer integer : arrayList) {
            System.out.println("Item " + integer);
        }

        System.out.println();

        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(33);
        linkedList.add(9);
        linkedList.add(2);

        for (Integer integer : linkedList) {
            System.out.println("Item " + integer);
        }

        System.out.println();

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
