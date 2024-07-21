import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println("The sum of all elements in the array is: " + sum);
        scanner.close();
    }
}
