package javaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        // DUPLICATED VALUES ARE ACCEPTABLE
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("ArrayList:");
        addAndPrintList(arrayList);
        System.out.println();
        System.out.println("LinkedList:");
        addAndPrintList(linkedList);

        System.out.println();

        System.out.println("Time spent for adding values in ArrayList " + doTimeCalculation(arrayList) + " ms");
        System.out.println("Time spent for adding values in LinkedList " + doTimeCalculation(linkedList) + " ms");
    }

    public static void addAndPrintList(List<Integer> list) {

        list.add(2);
        list.add(5);
        list.add(33);
        list.add(9);
        list.add(2);

        for (Integer integer : list) {
            System.out.println("Item " + integer);
        }

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
