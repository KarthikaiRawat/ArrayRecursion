
// Write a recursive function that takes a list of numbers as an input and return product of all numbers in list
import java.util.*;

public class ArrayProduct {

    public static int list(List<Integer> n, int p) {

        if (n.size() == 0)
            return 1;
        else if (n.size() == 1)
            return n.get(0);

        p = n.get(0) * list(n.subList(1, n.size()), p);
        return p;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        System.out.println(list(arr, 0));
    }

}
