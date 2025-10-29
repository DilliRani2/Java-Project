package Day2;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Short.MIN_VALUE+" "+Short.MAX_VALUE);
        System.out.println("Enter Principle Amount:");
        int p=sc.nextInt();
        System.out.println("Enter Rate of Interest:");
        float r=sc.nextFloat();
        System.out.println("Enter Years");
        int t=sc.nextInt();
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your gender(M/F)");
        char gender=sc.next().charAt(0);
        double interest=(p*r*t)/100;
        System.out.println("Interest: "+interest);
        if(interest>1000){
            System.out.println("High Interest Earned");
        }
        else{
            System.out.println("Low Interest Earned");
        }
        for(int i=1;i<=t;i++){
            double ipy=(p*r*i)/100;
            System.out.printf("At the end of %d year, the bank interest is %f%n",i,ipy);
        }
    }
}
