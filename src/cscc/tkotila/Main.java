package cscc.tkotila;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double conversion = 5.0 / 9.0;

        int input = 0;

        while (input > -460) {
            System.out.print("Enter a temperature in Fahrenheit to convert: ");
            input = scanner.nextInt();
            System.out.printf("Temperature in Celsius: %.2f%n", (input - 32) * conversion);
        }
    }
}
