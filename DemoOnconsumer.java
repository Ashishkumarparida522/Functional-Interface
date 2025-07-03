package FunctionalInterfaces;

import java.util.function.Consumer;

public class DemoOnconsumer {

    /*
     * predefined functional interface availiable in java.util.function sub package

     */
    public static void main(String[] args) {

        Consumer<Integer>c1=num->System.out.println(num);
        c1.accept(12);

        Consumer<String>c2=s->System.out.println(s);
        c2.accept("ashish");

        Consumer<Character>c3=s->System.out.println(s);
        c3.accept('c');




        
    }
    
}
