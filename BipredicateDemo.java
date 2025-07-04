package FunctionalInterfaces;

import java.util.function.BiPredicate;

public class BipredicateDemo {
    public static void main(String[] args) {
        /*
         * boolean test(T t,U u)
         * T:first argument to the function 
         * U: second argument to the function
         */
        BiPredicate<Integer,Integer> p1=(n1,n2)->(n1+n2)%2==0;
        System.out.println("Is sum even :"+p1.test(14, 14));
    }
}
