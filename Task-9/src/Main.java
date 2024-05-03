import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nAlgorithm of the program that records the number of parts of the entered positive number\n");

        double number;
        int i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        number = scan.nextDouble();

        while (number>9){
            number/= 10;
            i++;
        }
        System.out.println("Your number has " + i + " digit");
    }
}