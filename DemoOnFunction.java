package FunctionalInterfaces;

import java.util.function.Function;

public class DemoOnFunction {

    public static void main(String[] args) {
        Function<String,Integer> f1=s->s.length();
       
        System.out.println( f1.apply("ashish"));
    }
}