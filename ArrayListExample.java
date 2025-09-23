import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample  {
       public static void main (String[] args)  {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        System.out.println("Original ArrayList: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList: " + numbers);
        System.out.println("Iterating through the list:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
        
       }
}