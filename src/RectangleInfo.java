import java.util.Scanner;

public class RectangleInfo {
    static double input(String ask, Scanner scanner){
        double val = 0;
        boolean running = true;

        do{
            System.out.println(ask);

            if(scanner.hasNextDouble()){
                val = scanner.nextDouble();
                running = false;
            }else{
                System.out.println("Failed to input valid data: " + scanner.nextLine());
            }
        }while(running);

        scanner.nextLine();
        return val;
    }

    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double height = input("Enter the height of your rectangle", scanner);
        double width = input("Enter the width of your rectangle", scanner);

        System.out.println("The area of the rectangle is " + width*height + " and the perimeter is " + Math.floor(height*2 + width*2));
        System.out.println("The length of the diagonal is " + Math.sqrt(Math.pow(height,2) + Math.pow(width,2)));

        scanner.close();
    }
}
