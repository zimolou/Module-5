import java.util.Scanner;

public class Sequencing {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        double price = 0, salesTax, total;

        salesTax = price * 0.0825;
        total = price + salesTax;

        System.out.print("How much is the purcahse price? ");
        price= keyboard.nextDouble();

        System.out.println("Item price:\t" +price);
        System.out.println("Sales tax:\t"+salesTax);
        System.out.println("Total cost:\t"+total);
    }
}
