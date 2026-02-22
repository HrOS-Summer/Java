package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
        List<Integer> lk = new LinkedList<>();

        lk.add(1);
        lk.add(2);
        lk.add(3);
        lk.add(5);
        lk.add(8);
        lk.add(13);
        lk.add(21);

        System.out.println(lk);

        ListIterator<Integer> iterator = lk.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.previous());
    }
}
