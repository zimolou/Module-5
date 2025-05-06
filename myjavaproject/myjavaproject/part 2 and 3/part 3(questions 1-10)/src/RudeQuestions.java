import java.util.Scanner;

public class RudeQuestions {
    public static void main(String[] args){
        String name;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is your name?");
        name = keyboard.next();

        System.out.print("Hi," + name +"!How old are you?");
        age = keyboard.nextInt();

        System.out.println("So you are"+age+". eh? That's not very old.");
        System.out.print("How much do you weight, "+name+"?");
        weight =keyboard.nextDouble();


        System.out.println(weight + "!Better keep taht quiet!!");
        System.out.print("Fianlly, what's your income, " + name +"?");
        income=keyboard.nextDouble();

        System.out.println("Hopefully that is" + income +"Per hour");
        System.out.println("and not per year!");
        System.out.println("Well, thanks for answering my rude questions.");
        System.out.println(name +".");
    }
}
