package Day6;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        String[] fruits={"Apple","Orange","Banana","Apple","Orange","Banana","Apple","Orange","Banana","Pineapple"};
        Map<String,Integer> freq=new HashMap<>();
        for(String fruit:fruits){//Apple Orange Banana Apple Orange
            if(freq.containsKey(fruit)){
                freq.put(fruit,freq.get(fruit)+1);
            }
            else{
                freq.put(fruit,1);
            }

        }
        System.out.println(freq);
    }
}
