package Day6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<>();
        hm.put(101,"Apple");
        hm.put(102,"Orange");
        hm.put(103,"Banana");
        hm.put(104,"Pineapple");
        System.out.println(hm);
        System.out.println(hm.size());
        hm.remove(102);
        System.out.println(hm);
        System.out.println(hm.get(104));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());

        for(int key:hm.keySet()){
            System.out.println(hm.get(key));
        }
        Iterator<Map.Entry<Integer,String>>it=hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> pair=it.next();
            System.out.println(pair.getKey()+"->"+pair.getValue());
        }
    }
}
