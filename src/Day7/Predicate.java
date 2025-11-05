package Day7;


/*
Predicate is a interface used to execute the conditions repeatedely.
It is having only one method called test
 */
/*
interface Predicate{
    public boolean test(int x);
}
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Predicate {
    public static void main(String[] args) {
        Predicate<Integer> p= temp -> temp%2==0;
        System.out.println(p.test(45));
        System.out.println(p.test(26));

        Predicate<Integer> p1=temp->temp>20;
        System.out.println(p1.test(12));
        System.out.println(p1.test(200));

        List<Integer> list= Arrays.asList(10,20,30,45,55,60,78);
        /*
        and
        or
        negate
         */
        System.out.println("Print all the numbers which satisfy both the conditions/predicate");
        m1(p.or(p1),list);
        System.out.println("print all odd numbers");
        m1(p.negate(),list);

    }
    public static void m1(Predicate<Integer> p,List<Integer> list){
        for(int x:list){
            if(p.test(x)){
                System.out.println(x+" ");
            }
        }
    }

}
