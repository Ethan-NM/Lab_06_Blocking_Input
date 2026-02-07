import java.util.Scanner;

public class CtoFConverter {
    void main(){
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        double c;

        do{
            System.out.println("Please enter a temperature in Celsius!");

            if(scanner.hasNextDouble()){
                c = scanner.nextDouble();
                double f = (c*9/5) + 32;
                System.out.println("Your temperature in Fahrenheit is: " + f);
                running = false;
                scanner.nextLine();
            }else{
                System.out.println("Bad input: " + scanner.nextLine() + " Try again!");
            }

        } while(running);


        scanner.close();
    }
}
