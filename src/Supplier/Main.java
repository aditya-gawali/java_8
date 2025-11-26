package Supplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> sup1 = () -> 1;
        System.out.println(sup1.get());

        Predicate<Integer> predicate = x -> x % 2 ==0;
        Supplier<Integer> supplier = () -> 100;
        Consumer<Integer> consumer = System.out::println;
        Function<Integer, Integer> function = x -> x * 2;

        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }
     }
}
