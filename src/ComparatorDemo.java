import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>(List.of(1,2,3));

        System.out.println(li);
//        Collections.sort(li,(a,b)-> b -a);
        Collections.sort(li,new MyComparator());
        System.out.println(li);
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b){
        return b - a;
    }
}
