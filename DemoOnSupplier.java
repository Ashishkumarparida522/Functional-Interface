
package FunctionalInterfaces;

import java.util.function.Supplier;

public class DemoOnSupplier {

    public static void main(String[] args) {
        /*
         * public abstract T get();
         * 
         */
        Supplier<String> s=()->"ashish";
        System.out.println(s.get());
        
    }

}