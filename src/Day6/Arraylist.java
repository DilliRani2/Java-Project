package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add("Apple");
        list.add(101);
        list.add('C');
        list.add(true);
        list.add(null);
        list.add("Apple");

        System.out.println(list.size());
        System.out.println(list);

        list.remove(3);
        list.remove("Apple");
        System.out.println(list);

        list.add(3, "Orange");
        System.out.println(list);

        list.set(4, false);
        System.out.println(list);

        System.out.println(list.get(5));

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(array));
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for (Integer temp : list1) {
            System.out.println(temp);
        }

        System.out.println("------------------");

        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
