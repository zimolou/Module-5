import java.util.Scanner;

public class FunFactCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth year:");
        int birthyear = input.nextInt();

        System.out.print("Enter your favorite number:");
        int favNumber= input.nextInt();
        
        int age =2025-birthyear;
        int doubleNumber = favNumber*2;
        int square = favNumber * favNumber;

        System.out.println("\nHere are some fun facts:");
        System.out.println("You'll be"+ age+"Years old in 2025");
        System.out.println("Double your favorite number is " +doubleNumber);
        System.out.println("Your favorite number squared is " + square);

        System.out.println("\nWhy don't scientists trust atoms?");
        System.out.println("Because they make up everything!");
        
    }
}