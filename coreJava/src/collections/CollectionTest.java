package collections;

import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for(int x: list) {  // this for loop also calls the hasNext() and next()
            System.out.println(x);
        }
    }
}
