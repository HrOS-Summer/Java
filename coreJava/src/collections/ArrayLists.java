package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        System.out.println(list);
        System.out.println(list.reversed());

        int prevElement = list.set(1, 33);
        System.out.println("Replaced element = " + prevElement);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2);

        List<Integer> list3 = list2.subList(1, 4);
        System.out.println(list3);

    }
}
