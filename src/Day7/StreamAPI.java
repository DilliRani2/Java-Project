package Day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,45,55,60,78);
        Stream<Integer> s=list.stream();
    /*
    filter()
    map()

    sum()
    max()
    min()
    count()

     */
        long start_time=System.nanoTime();
        int sum=0;
        for(int x:list){
            if(x%2==0){
                sum+=x;
            }
        }
        long end_time=System.nanoTime();
        System.out.println("For loop timings: "+(end_time-start_time));
        long start_time1=System.nanoTime();
//        List<Integer> list1=list.stream().filter(temp->temp%2==0).collect(Collectors.toList());
        Integer value=list.stream().filter(temp->temp%2==0).mapToInt(Integer::intValue).sum();
        long end_time1=System.nanoTime();
        System.out.println("Stream timing: "+(end_time1-start_time1));
    }

}
