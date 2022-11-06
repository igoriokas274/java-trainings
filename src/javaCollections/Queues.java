package javaCollections;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {

    public static void main(String[] args) {

        // (head) <- oooooooooooooooo <- (tail) FIFO (first in, first out)

        //////////////// add(), element(), remove() ////////////////
        Queue<Integer> q1 = new ArrayBlockingQueue<>(3);

        // System.out.println(q1.element()); // Empty Queue. Gets NoSuchElementException

        try {
            q1.add(10);
            q1.add(20);
            q1.add(30);
            q1.add(40);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage() + ". No more elements can be added in the Queue #1.");
        }

        System.out.println("The Head of Queue is: " + q1.element());

        for (Integer value: q1) {
            System.out.println("Queue #1: " + value);
        }

        try {
            System.out.println("Queue #1 Removing: " + q1.remove());
            System.out.println("Queue #1 Removing: " + q1.remove());
            System.out.println("Queue #1 Removing: " + q1.remove());
            System.out.println("Queue #1 Removing: " + q1.remove());
        } catch (NoSuchElementException e) {
            System.out.println("No more elements in the Queues #1 to remove.");
        }

        System.out.println("\n");

        //////////////// offer(), peek(), poll() ////////////////
        Queue<Integer> q2 = new ArrayBlockingQueue<>(3);

        System.out.println("The Header of Queue #2 is " + q2.peek());

        q2.offer(10);
        q2.offer(20);
        q2.offer(30);
        q2.offer(40);

        System.out.println("The Header of Queue #2 is " + q2.peek());

        for (Integer value: q2) {
            System.out.println("Queue #2: " + value);
        }

        System.out.println("Queue #1 Removing: " + q2.poll());
        System.out.println("Queue #1 Removing: " + q2.poll());
        System.out.println("Queue #1 Removing: " + q2.poll());
        System.out.println("Queue #1 Removing: " + q2.poll()); // Gives null element

    }
}
