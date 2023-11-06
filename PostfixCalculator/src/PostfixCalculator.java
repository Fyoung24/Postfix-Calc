/*
CZ
11/9/23
FY
 */

import java.util.Scanner;

public class PostfixCalculator {

    Stack stackReg; // Stack to store values

    public static int Calculations(Stack stackReg, String input) {
        int firstNum = 0;
        int secondNum = 0;
        String[] array = null;

        // Split the input string into an array of tokens based on spaces
        array = input.split(" ");

        // Iterate through the array of tokens
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("+") || array[i].equals("-") || array[i].equals("*") || array[i].equals("/")) {
                // If the char is an operator, pop the last two values from the stack and perform the operation
                firstNum = (int) stackReg.pop();
                secondNum = (int) stackReg.pop();

                switch (array[i]) {
                    case "+": {
                        // Add the two values and push the result back onto the stack
                        int newNum = firstNum + secondNum;
                        stackReg.push(newNum);
                        break;
                    }
                    case "-": {
                        // Subtract the two values and push the result back onto the stack
                        int newNum = firstNum - secondNum;
                        stackReg.push(newNum);
                        break;
                    }
                    case "*": {
                        // Multiply the two values and push the result back onto the stack
                        int newNum = firstNum * secondNum;
                        stackReg.push(newNum);
                        break;
                    }
                    case "/": {
                        // Divide the two values and push the result back onto the stack
                        int newNum = firstNum / secondNum;
                        stackReg.push(newNum);
                        break;
                    }
                }
            } else {
                // If the token is a number, push it onto the stack
                stackReg.push(Integer.parseInt(array[i]));
            }
        }

        // The result is at the top of the stack, so return it
        return (int) stackReg.peek();
    }
}
// input.charAt(i)
// Integer.parseInt(input.substring(i))

// String numbers [] = line.split(" ");
// int num = Integer.parseInt(numbers[col]);
