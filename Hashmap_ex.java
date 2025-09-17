import java.util.HashMap;
import java.util.Map;   

public class Hashmap_ex {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their corresponding grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 90);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Diana", 92);

        // Displaying the contents of the HashMap
        System.out.println("Student Grades: " + studentGrades);

        // Accessing a value using its key
        String studentName = "Bob";
        if (studentGrades.containsKey(studentName)) {
            int grade = studentGrades.get(studentName);
            System.out.println(studentName + "'s grade: " + grade);
        } else {
            System.out.println(studentName + " not found in the records.");
        }

        // Iterating through the HashMap
        System.out.println("All Student Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing a key-value pair
        studentGrades.remove("Charlie");
        System.out.println("After removing Charlie: " + studentGrades);

        // Checking the size of the HashMap
        System.out.println("Total number of students: " + studentGrades.size());
    }
}