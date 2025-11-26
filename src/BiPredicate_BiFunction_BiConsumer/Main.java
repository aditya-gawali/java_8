package BiPredicate_BiFunction_BiConsumer;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> predicate = (x,y)-> x % 2 == 0 && y %2 == 0;

        System.out.println(predicate.test(2,4));

        BiFunction<Integer,Integer,Integer> function = (x,y)-> x + y;

        System.out.println(function.apply(1,2));

        BiConsumer<Integer,Integer> consumer = (x,y)-> System.out.println(x + " " + y);
        consumer.accept(1,2);
    }
}
