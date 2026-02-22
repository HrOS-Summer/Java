package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        //ArrayDeque class is concrete implementation of Deque interface

        //add elements
        //Stack behavior: LIFO
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        System.out.print("Deque elements: ");
        System.out.println(dq);

        System.out.print("First element: ");
        System.out.println(dq.peekFirst());

        //remove elements
        dq.pollFirst();
        System.out.print("Updated deque: ");
        System.out.println(dq);


        System.out.println();

        Deque<Integer> dqQ = new ArrayDeque<>();
        //Queue behavior: FIFO
        dqQ.offerLast(10);
        dqQ.offerLast(20);
        dqQ.offerLast(30);
        dqQ.offerLast(40);

        System.out.print("Deque elements: ");
        System.out.println(dqQ);

        System.out.print("First element: ");
        System.out.println(dqQ.peekFirst());

        //remove elements
        dqQ.pollFirst();
        System.out.print("Updated deque: ");
        System.out.println(dqQ);
    }
}
