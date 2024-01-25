import java.util.Scanner;
/**
 * Demo class to prompt user to select an engine.
 *
 * @author Grant Noble
 * @version 1/25/2024
 */
public class Demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Chevy LT4 engine \n" 
        + "or 2 for Toyota 2JZ engine:");
        
        int userInput = scanner.nextInt();
        
        Engine carEngine;
        if (userInput == 1) {
            carEngine = new Chevy_LT4();
        } else if (userInput == 2) {
            carEngine = new Toyota_2JZ();
        } else {
            System.out.println("Invalid input");
            return;
        }
        
        carEngine.start();
    }
}
