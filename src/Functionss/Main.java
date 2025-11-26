package Functionss;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> func1 = x -> x * 2;
        Function<Integer, Integer> func2 = x -> x * x * x;

        System.out.println(func1.apply(2));
        System.out.println(func2.apply(2));

        Function<Integer, Integer> integerIntegerFunction = func1.andThen(func2);

        System.out.println(integerIntegerFunction.apply(2));

        System.out.println(func1.compose(func2).apply(2));

        Function<Object, Object> identity = Function.identity();
        System.out.println(identity.apply(4));
    }
}
