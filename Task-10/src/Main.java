import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nAlgorithm of the program that checks whether the sum of the cubes of the cells of an input 3-digit number is equal to itself\n");

        int number, digit, x, sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        number = scan.nextInt();
        x = number;
        while(number>9){
            digit = number % 10;
            sum+= digit*digit*digit;
            number/=10;
        }
        sum+= number*number*number;
        if (sum == x){
            System.out.println("Your number \"" + x + "\" is Armstrong number");
            System.out.println(x + " = " + sum);
        }else {
            System.out.println("Your number \"" + x + "\" is not Armstrong number");
            System.out.println(x + " != " + sum);
        }
    }
}