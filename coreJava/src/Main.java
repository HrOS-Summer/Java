import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(90);
        list.add(40);
        list.add(70);
        list.add(100);

        List<Integer> list2 = list.subList(0, list.size());

        list.add(999);
        List<Integer> lk = new LinkedList<>(list);
//        lk.add(2);
//        lk.add(3);
//        lk.add(5);
//        lk.add(7);
//        lk.add(11);
//        lk.set(1, 33);

        String[] options = {"Add", "Display", "Remove", "Exit"};
        for(int i = 0; i<options.length; i++) {
            System.out.println((i+1) +"."+ options[i]);
        }
    }



}