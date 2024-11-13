import java.util.HashMap;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate frequencies
        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Print all unique elements
        System.out.println("Unique elements in the array:");
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
        
        scanner.close();
    }
}
