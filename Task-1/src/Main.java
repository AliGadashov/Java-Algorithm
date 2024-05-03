import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b , c;
        Scanner read = new Scanner(System.in);
        System.out.println("\nA program that adds the sum of two numbers\n");
        System.out.println("Enter first number: ");
        b = read.nextInt();
        System.out.println("Enter second number: ");
        c = read.nextInt();
        a = b + c;
        System.out.println("Sum of " + b + " and " + c + " is " + a);
    }
}