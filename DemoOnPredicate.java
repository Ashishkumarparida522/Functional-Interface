package FunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class DemoOnPredicate {

    public static void main(String[] args) {
        /*
         * it is availiable in java.util.function package 
         * boolean test(T x)
         */
        Predicate<Integer>p1=num->num>=18;
        Scanner sc =new Scanner(System.in);
        int age =sc.nextInt();
        boolean isElligble=p1.test(20);
        if(isElligble)
        System.out.println("u r elligible for voting");
        else
        System.out.println("u r not elligble for voting");

        sc.close();


    }
    
}
