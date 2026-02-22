package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println(q.peek());
        System.out.println(q.poll());  //removes and returns the removed element
        System.out.println(q.peek());
        System.out.println(q.isEmpty());  // from collection interface
    }
}
