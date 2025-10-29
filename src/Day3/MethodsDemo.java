package Day3;

public class MethodsDemo {
    public static void main(String[] args){
        add();
        sub(20,30);
       // double result=mul();
       // System.out.println(re9sult);
        System.out.println(mul());
        System.out.println(div(5,2));
    }
    //no return type without arguments
    public static void add(){
        int num1=10;
        int num2=20;
        int sum =num1+num2;
        System.out.println(sum);
    }
    //No return type with args
    public static void sub(int num1,int num2){
        int sub= Math.abs(num1-num2);
        System.out.println(sub);
    }
    //Return type without args
    public static double mul(){
        int num1=40;
        int num2=55;
        double mul =num1*num2;
        return mul;
    }
    //Return type with args
    public static double div(int num1,int num2){
        double div=(double)num1/num2;
        return div;

    }
}
