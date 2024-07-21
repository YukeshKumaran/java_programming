import java.util.Scanner;

public class StringToIntegerConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
      
        try {
            int result = Integer.parseInt(input);
            System.out.println("The integer value is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Cannot convert to integer.");
        }

        scanner.close();
    }
}
