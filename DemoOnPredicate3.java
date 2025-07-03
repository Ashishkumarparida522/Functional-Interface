package FunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class DemoOnPredicate3 {
    public static void main(String[] args) {
        Predicate<String> p3=s->s.toLowerCase().startsWith("a");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();

        System.out.println(name+" Your name starts with 'R'"+p3.test(name));
        sc.close();
        
    }
    
}
