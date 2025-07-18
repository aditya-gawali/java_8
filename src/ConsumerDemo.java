import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("aditya");

        Consumer<List<Integer>> consumer1 = li ->{
            for (int i : li){
                System.out.println( i );
            }
        };
        Consumer<List<Integer>> consumer2 = li ->{
            for (int i : li){
                System.out.println( i  + 100);
            }
        };

        consumer1.andThen(consumer2).accept(Arrays.asList(1,2,3,4));
    }
}
