import javax.naming.InsufficientResourcesException;
import java.net.Inet4Address;
import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {

        Function<String, Integer> function = x -> x.length();
        Function<String, String> func2 = s -> s.substring(0,3);
        System.out.println(function.apply("aditya"));
        System.out.println(func2.apply("aditya"));


        Function<Integer, Integer> f1 = x -> x * 2;
        Function<Integer,Integer> f2 = x -> x * x * x;

        System.out.println(f1.andThen(f2).apply(2));
        System.out.println(f2.andThen(f1).apply(2));

        System.out.println(f1.compose(f2).apply(2));

        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("aditya"));
    }
}
