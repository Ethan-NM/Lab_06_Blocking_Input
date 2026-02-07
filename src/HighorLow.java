import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    static void main(String[] args){
        Random gen = new Random();
        int guessNum = gen.nextInt(1,10) + 1;
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter a number, and I will tell you if it is higher, lower, or correct!");

            if(scanner.hasNextInt()){
                int guess = scanner.nextInt();

                if(guess > 10 || guess < 1){
                    System.out.println("Failed to enter a valid integer 1-10: " + scanner.nextLine());
                    continue;
                }

                if(guess > guessNum){
                    System.out.println("Your number was higher than the number: " + guessNum);
                }else if(guess < guessNum){
                    System.out.println("Your number was lower than the number: " + guessNum);
                }else{
                    System.out.println("You guess the number correctly! The number was: " + guessNum);
                }
                running = false;
            }else{
                System.out.println("Failed to enter a valid integer 1-10: " + scanner.nextLine());
            }
        }while(running);
        scanner.close();
    }
}
