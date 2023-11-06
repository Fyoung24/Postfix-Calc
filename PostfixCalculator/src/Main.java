import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner s = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Please enter an expression in postfix notation (separated by spaces):");

        // Read the input from the user
        String input = s.nextLine();

        // Create a Stack object to store values
        Stack test = new Stack();

        // Call the Calculations method from the PostfixCalculator class to evaluate the expression
        PostfixCalculator.Calculations(test, input);
    }
}