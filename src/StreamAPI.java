import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        // create stream
//
//        List<Integer>  list = List.of(1,2,3,4);
//        Stream<Integer> stream = list.stream();
//
//        int[] nums = {1,2,3,4,5};
//        Stream<Integer> integerStream = Arrays.stream(nums).boxed();
//
//        Stream<Integer> str = Stream.of(1,2,3,4,5);
//
//        Stream<Integer> iterate = Stream.iterate(0, n -> n + 1).limit(100);
//
//        Stream<String> generate = Stream.generate(() -> "Hello");

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> collect = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(collect);

        List<Integer> list1 = collect.stream().map(x -> x / 2).toList();
        System.out.println(list1);

        List<Integer> list2 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a,b) -> b -a)
                .limit(4)
                .skip(1)
                .peek(System.out::println)
                .toList();

        Integer list3 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .max((a,b)-> a - b)
                .get();

        System.out.println(list3);



    }
}
