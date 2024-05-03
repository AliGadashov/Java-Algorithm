import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nA program that calculates multiplication of positive numbers by addition\n");

        int firstNum, secondNum, total = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        firstNum = scan.nextInt();
        System.out.println("Enter the second number: ");
        secondNum = scan.nextInt();
        while (secondNum>0){
            total+= firstNum;
            secondNum--;
        }
        System.out.println("Total: " + total);
    }
}