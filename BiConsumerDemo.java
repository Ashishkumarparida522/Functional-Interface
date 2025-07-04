package FunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        /*
         * void accept (T t,U u)
         */
        BiConsumer<Integer,String>updateVariables=(num,str)->
        {
            num =num*2;
            str=str.toUpperCase();
            System.out.println("updated values :"+num+" , "+str);
        };
        int number=15;
        String text ="ashish";
        updateVariables.accept(number, text);
        System.out.println(number+" "+text);
    }
    
}
