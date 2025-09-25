
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + list);

        // Accessing elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // Removing elements
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // Iterating through the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }   


    
}
