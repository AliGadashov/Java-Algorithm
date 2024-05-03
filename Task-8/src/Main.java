import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nAlgorithm of the program that finds the remainder of the division of the entered positive number by any number\n");
        int divided, divider, residue;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the divided: ");
        divided = scan.nextInt();
        System.out.println("Enter the divider: ");
        divider = scan.nextInt();

        while (divided>divider){
            divided -= divider;
        }
        residue = divided;
        System.out.println("Residue = " + residue) ;
    }
}
