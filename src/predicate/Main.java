package predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 10;
        System.out.println(predicate.test(11));

        Predicate<String> startWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endWithLetterL = x -> x.toLowerCase().endsWith("l");

        Predicate<String> and = startWithLetterV.and(endWithLetterL);
        Predicate<String> or = startWithLetterV.or(endWithLetterL);

        System.out.println(and.test("vipul"));

        System.out.println(startWithLetterV.negate().test("vipul"));

        Student s1 = new Student("Vipul", 1);
        Student s2 = new Student("Ram", 2);

        Predicate<Student> studentPredicate = x -> x.getId() > 1;

        System.out.println(studentPredicate.test(s1));
        System.out.println(studentPredicate.test(s2));

        Predicate<Object> predicate1 = Predicate.isEqual("vipul");
        System.out.println(predicate1.test("vipul"));
    }

    private static class Student{
        String name;
        int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
