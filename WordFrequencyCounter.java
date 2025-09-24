import java.util.HashMap;
import java.util.Scanner;

public class 
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input text
        System.out.println("Enter a sentence or paragraph:");
        String text = scanner.nextLine();

        // Convert text to lowercase and split into words
        String[] words = text.toLowerCase().split("\\W+");

        // HashMap to store word frequency
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Update word count
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Print results
        System.out.println("\nWord Frequencies:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " : " + wordCount.get(word));
        }

        scanner.close();
    }
}
