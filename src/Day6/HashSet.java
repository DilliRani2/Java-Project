package Day6;

import java.util.*;

public class HashSet {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Citrus Fruit");
        System.out.println(hs.size());
        System.out.println(hs);
        hs.remove("Citrus Fruit");
        System.out.println(hs);
        Set<String> fruits=new HashSet<>();
        fruits.add("Blueberry");
        fruits.add("Cherry");
        hs.addAll(fruits);
        System.out.println(hs);

        List<String> list=new ArrayList<>(hs);
        System.out.println(list.get(3));

        for(String fruit:hs){
            System.out.println(fruit);
        }

        Iterator<String> it=hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
