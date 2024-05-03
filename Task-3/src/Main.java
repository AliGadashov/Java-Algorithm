import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nA program that calculates the sum of cubes of numbers from 1 to a given number\n");
        int number, sum = 0;
        System.out.println("Enter the number: ");
        Scanner read = new Scanner(System.in);
        number = read.nextInt();
        for (int i = 1; i <= number; i++) {
            sum += i*i*i;
        }
        System.out.println("Form 1 to " + number + " sum of cubes is " + sum);
    }
}