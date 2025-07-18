import java.net.Inet4Address;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(2));

        Predicate<String> startWithV = s -> s.charAt(0) == 'v';
        Predicate<String> endWithL = s -> s.charAt(s.length() -1) == 'l';

        System.out.println(startWithV.and(endWithL).test("vikas"));
        System.out.println(startWithV.or(endWithL).test("vikas"));

        System.out.println(startWithV.negate().test("Vipul"));
    }
}
