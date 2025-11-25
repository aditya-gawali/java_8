import java.util.*;

class Main {
    public static void main(String[] args) {
//        Employee emp = () -> "Software Engineer";
//        System.out.println(emp.getName());
//        Threads tClass = new Threads();
//        Thread t1 = new Thread(tClass);
//        t1.start();
//        for(int i =1; i <= 100; i++){
//            System.out.println("bye_" + i);
//        }
//
//        Runnable runable = ()-> {
//            for(int i =1; i <= 10; i++){
//                System.out.println("hello_" + i);
//            }
//        };
//
//        Thread childThread = new Thread(runable);
//        childThread.start();


//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
////        Collections.sort(list, new MyComparator());
//        Collections.sort(list, (a, b) -> b - a);
//        System.out.println(list);

//        Map<Integer, String> m = new TreeMap<>();
//        m.put(1, "one");
//        m.put(3, "three");
//        m.put(2, "two");
//
//        Map<Integer, String> mm = new TreeMap<>((a, b) -> b - a);
//        mm.put(1, "one");
//        mm.put(3, "three");
//        mm.put(2, "two");
//
//        System.out.println(mm);

        Student s1 = new Student(1, "aditya");
        Student s2 = new Student(2, "karthik");
        Student s3 = new Student(3, "durvesh");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Collections.sort(students, (a, b) -> b.getId() - a.getId());
        System.out.println(students);

    }
}