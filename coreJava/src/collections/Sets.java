package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(4);
        s.add(6);
        s.add(30);
        s.add(4);
        s.add(9);

//        System.out.println(s);
//        s.remove(4);
//        System.out.println(s);

        Set<Integer> st = new HashSet<>();
        st.add(12);
        st.add(30);
        st.add(4);
        st.add(5);

//        System.out.println(s);
//        System.out.println(st);
//        s.retainAll(st);
//        System.out.println("After retaining");
//
//        System.out.println(s);
//        System.out.println(st);
//
//        System.out.println(s);
//        System.out.println(st);
        s.removeAll(st);  // s intersection st

        //System.out.println(s);

        Set<Integer> lkhs = new LinkedHashSet<>();
        lkhs.add(100);
        lkhs.add(200);
        lkhs.add(300);
        lkhs.add(400);
        lkhs.add(500);

        System.out.println(lkhs);
    }
}
