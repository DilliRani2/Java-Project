package Day7;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        try {
//            System.out.println(num1 / num2);
            String s=null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception "+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        finally {
            sc.close();
        }
//        String s="Apple";
//        System.out.println(Integer.parseInt(s));
//        int[] array={1,2,3,4,5};
//        System.out.println(array[5]);
//        String s=null;
//        System.out.println(s.length());

        System.out.println("Last line of the program");
    }
}
