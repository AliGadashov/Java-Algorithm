import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nAlgorithm of the program that finds the sum of negative ones, the sum of even ones and the number of divisible by 7 from the 25 numbers entered from the keyboard and prints it on the screen\n");

        int neg= 0, even = 1, number;
        int seven = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <=25; i++) {
            System.out.println("Enter the " + i + ". number: ");
            number = scan.nextInt();
            if (number%2 == 0){
                even*=number;
            }
            if (number<0){
                neg+=number;
            }
            if (number%7==0){
                seven++;
            }
        }
        System.out.println("The sum of negative ones: " + neg);
        System.out.println("The sum of even ones: " + even);
        System.out.println("The number of divisible by 7 : " + seven);
    }
}