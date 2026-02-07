import java.util.Scanner;

public class FuelCosts {
    static double input(String ask){
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        double num = 0;

        do{
            System.out.println(ask);
            if(scanner.hasNextDouble()){
                num = scanner.nextDouble();
                running = false;
            }else{
                System.out.println("Failed to input valid data: " + scanner.nextLine() + " Try again!");
            }
        }while(running);

        scanner.nextLine();
        return num;
    }

    void main(String[] args){
        double gallons = input("What is the number of gallons of gas in your tank?");
        double mpg = input("How many miles do you get per gallon?");
        double price = input("How much does a gallon cost in dollars?");

        System.out.println("The cost for you to drive 100 miles is " + 100/mpg * price);
        System.out.println("Your care can go " + gallons*mpg + " miles on a full tank of gas!");

    }
}
