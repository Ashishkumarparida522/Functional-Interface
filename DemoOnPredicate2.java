package FunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class DemoOnPredicate2 {
    public static void main(String[] args) {
        Predicate<String>p2=s->s.equalsIgnoreCase("Ashish");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name =sc.next();
        
            System.out.println("Are u ashish?"+" "+p2.test(name));
            sc.close();

    }
    
}
