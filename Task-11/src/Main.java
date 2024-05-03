import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nAlgorithm of the program that calculates the ratio of the sums of even numbers to the sums of odd numbers of 20 numbers entered from the keyboard\n");

        int odd=0, couple=0, number;
        float ratio;
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <=20; i++) {
            System.out.println("Enter the " + i + ". number: ");
            number = scan.nextInt();
            if (number%2 == 0){
                couple+=number;
            }else {
                odd+=number;
            }
        }
        ratio= couple/odd;
        System.out.println("Ratio: " + ratio + "%");

    }
}