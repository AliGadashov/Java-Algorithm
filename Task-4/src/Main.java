import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nA program that calculates the age of a person who enters a date of birth\n");
        int birthdayYear, year , age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter this year: ");
        year = scan.nextInt();
        System.out.println("Enter your birthday year: ");
        birthdayYear = scan.nextInt();
        age = year-birthdayYear;
        System.out.println("You are " + age + " years old");
    }
}