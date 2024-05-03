import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nAlgorithm of the program that displays the squares of the numbers between the two entered numbers on the screen\n");

        int min, max;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter min number: ");
        min = scan.nextInt();
        System.out.println("Enter max number: ");
        max = scan.nextInt();

        for (int i = 1; i <= max ; i++) {
            if((i*i)>min){
                if((i*i)<=max){
                    System.out.println( i + " => " + i*i );
                }else {
                    break;
                }
            }
        }
    }
}