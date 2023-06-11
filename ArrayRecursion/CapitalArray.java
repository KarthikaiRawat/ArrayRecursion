// Write recursive function that takes an array of words and returns an array containing all words capitalized
// i/p : ["foo", "bar", "world"]
// o/p : ["FOO", "BAR", "WORLD"]

import java.util.*;

public class CapitalArray {

    public static List<String> list(List<String> n) {
        List<String> c = new ArrayList<>();
        List<String> p = new ArrayList<>();

        if (n.isEmpty()) {
            return p;
        }

        p.add(n.get(0).toUpperCase());
        c = list(n.subList(1, n.size()));

        p.addAll(list(c));
        return p;
    }

    public static void main(String[] args) {
        List<String> n = new ArrayList<>();
        n.add("foo");
        n.add("fopo");

        n.add("too");

        n.add("koo");
        System.out.println(list(n));

    }

}
