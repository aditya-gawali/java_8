package Comsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<List<Integer>> consumer1 = x -> System.out.println(x);

        consumer1.accept(Arrays.asList(1,2,3,4,5,6,7));

        Consumer<Integer> c2 = System.out::println;
        Consumer<Integer> c3= System.out::println;

        c2.andThen(c3).accept(2);

    }
}
