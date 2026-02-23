package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {
    public static void main(String[] args) {
        //Queue implementation using a LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.addLast("a");  // enqueue
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");

        System.out.println(list);
        String s = list.removeFirst();   //dequeue
        System.out.println(list);
        System.out.println(list.getFirst()); //acting as peek method of a queue
        //System.out.println(list.peek()); // we can use peek method itself (on a linkedList) as LinkedList class implements Deque interface

        //Queue implementation
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);     //enqueue
        q.offer(2);
        q.offer(3);

        System.out.println(q.peek());
        System.out.println(q.poll());  //removes and returns the removed element  (dequeue operation)
        System.out.println(q.peek());
        System.out.println(q.isEmpty());  // from collection interface

        //ArrayBlockingQueue
        Queue<Integer> q2 = new ArrayBlockingQueue<>(2);
        q2.add(10);
        q2.add(20);
        System.out.println(q2);
        //q2.add(30);  // IllegalStateException: Queue full
        q2.offer(40); //No exception (returns false)
    }
}
