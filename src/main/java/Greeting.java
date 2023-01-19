
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Print to the console "What's your name?"
        System.out.println("What's your name?");

        // Store the users input to the string variable 'inputted name'
        String inputted_name = scanner.nextLine();

        // Print out "Hi " then the users inputted name
        System.out.println("Hi " + inputted_name);
    }
}
