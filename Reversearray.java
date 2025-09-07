import java.util.Arrays;
public class Reversearray {

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        while (start < end) {

            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[]originalarray = {1, 2, 3, 4, 5};
        System.out.println("Original Array:"+Arrays.toString(originalarray));
        reverseArray(originalarray);
        System.out.println("Reversed Array:"+Arrays.toString(originalarray));

        
    }

    
    }



       

    
    

