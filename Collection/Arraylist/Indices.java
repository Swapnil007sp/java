import java.util.ArrayList;

public class Indices {
    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();

        list.add("name");
        list.add(23);
        list.add(123.45);

        // System.out.println(list);

        ArrayList list2 = new ArrayList<>();

        list2.add("language");
        list2.add(12);
        list2.add(23.45);

        System.out.println(list.addAll(list2)); // list2 added in
        // System.out.println(list); /

        System.out.println(list.remove(4));
        System.out.println(list);

        System.out.println(list.containsAll(list2));
        // System.out.println(list.get(2));

        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }

        // ArrayList numbers = new ArrayList<>();
        // numbers.add(12);
        // numbers.add(24);
        // numbers.add(54);

        // // we cannot directly convert object into int..
        // for (int i = 0; i < numbers.size(); i++) {
        // System.out.println(numbers.get(0));
        // }
    }
}