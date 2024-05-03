import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nA program that calculates the factorial of an input number\n");

        int number, fact= 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = scan.nextInt();
        for (int i = number; i > 1; i--) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}