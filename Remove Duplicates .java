import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] uniqueArray = Arrays.stream(array).distinct().toArray();

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
        scanner.close();
    }
}
