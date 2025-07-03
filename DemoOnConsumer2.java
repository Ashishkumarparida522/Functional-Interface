package FunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class DemoOnConsumer2 {
    public static void main(String[] args) {
        Function<Integer,Integer> fn1=num->num*num*num;
        /*
         * R apply(T,R)
         * T-input ,R-return type
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int no=sc.nextInt();

        System.out.println("cube of"+no+" is :"+fn1.apply(no));
        sc.close();
        
        

    }
    
}
