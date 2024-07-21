import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("The binary equivalent of decimal " + decimal + " is: " + binary);
        scanner.close();
    }
}
