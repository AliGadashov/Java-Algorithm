import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nA program that calculates the sum of the squares of two numbers entered by the user\n");
        int firstNum, secondNum, sum = 0;

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        firstNum  = read.nextInt();
        System.out.println("Enter the second number: ");
        secondNum  = read.nextInt();
        sum = (firstNum*firstNum + secondNum*secondNum);
        System.out.println("The sum of the squares is " + sum);
    }
}