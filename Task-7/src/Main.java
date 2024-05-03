import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nA program that calculates division of positive numbers by subtraction\n");
        int divided, divider, residue, division = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the divided: ");
        divided = scan.nextInt();
        System.out.println("Enter the divider: ");
        divider = scan.nextInt();

        while (divided>divider){
            divided -= divider;
            division++;
        }
        residue = divided;
        System.out.println("Division = " + division + " and residue = " + residue) ;
    }
}