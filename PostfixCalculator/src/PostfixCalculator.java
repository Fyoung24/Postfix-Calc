/*
CZ
11/9/23
FY
 */

import javafx.geometry.Pos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class PostfixCalculator {

    Stack stackReg;
    String input;
    int answer;

    // Load a postfix expression from a text file and return it as a string
    public String loadTxt() {
        try {
            // Open a resource file and read its contents
            InputStream is = PostfixCalculator.class.getResourceAsStream("/txtFile/Postfix_Test.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            // Read the first line of the file as the postfix expression
            input = br.readLine();

            // Close the file reader
            br.close();

        } catch (Exception e) {
            // Handle any exceptions that may occur when reading the file
        }

        return input;
    }

    // Perform calculations on the postfix expression and return the result
    public int Calculations(Stack stackReg, String input) {
        int firstNum = 0;
        int secondNum = 0;
        String[] array = null;

        // Split the input string into an array of tokens separated by spaces
        for (int i = 0; i < input.length(); i++) {
            array = input.split(" ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("+") || array[i].equals("-") || array[i].equals("*") || array[i].equals("/") || array[i].equals("%")) {
                firstNum = (int) stackReg.pop();
                secondNum = (int) stackReg.pop();
                switch (array[i]) {
                    case "+": {
                        // Perform addition and push the result onto the stack
                        int newNum = firstNum + secondNum;
                        stackReg.push(newNum);
                        break;
                    }

                    case "-": {
                        // Perform subtraction and push the result onto the stack
                        int newNum = firstNum - secondNum;
                        stackReg.push(newNum);
                        break;
                    }

                    case "*": {
                        // Perform multiplication and push the result onto the stack
                        int newNum = firstNum * secondNum;
                        stackReg.push(newNum);
                        break;
                    }

                    case "/": {
                        // Perform division and push the result onto the stack
                        int newNum = secondNum / firstNum;
                        stackReg.push(newNum);
                        break;
                    }

                    case "%": {
                        // Perform mod and push the result onto the stack
                        int newNum = secondNum % firstNum;
                        stackReg.push(newNum);
                        break;
                    }
                }
            } else {
                // If the token is not an operator, convert it to an integer and push it onto the stack
                stackReg.push(Integer.parseInt(array[i]));
            }
        }

        // Get the final answer from the stack
        answer = (int) stackReg.peek();
        return answer;
    }

    // Log the result to a text file
    public void log(int answer) throws IOException {
        String newAnswer = String.valueOf(answer);

        // Try to write the result to a log file
        try {
            // Create a FileWriter to write to the "log.txt" file
            FileWriter fWriter = new FileWriter("log.txt");

            // Write the result along with the original expression to the file
            fWriter.write("This is the answer to " + input + ": " + newAnswer);

            // Print the result to the console
            System.out.println(newAnswer);

            // Close the file writer
            fWriter.close();
        } catch (IOException e) {
            // Handle exceptions if there's an issue with writing to the file
            System.out.print(e.getMessage());
        }

    }
}