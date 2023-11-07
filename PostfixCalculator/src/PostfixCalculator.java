/*
CZ
11/9/23
FY
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PostfixCalculator {

    Stack stackReg;
    String input;


    public void loadTxt () {
        try {
            InputStream is = getClass().getResourceAsStream("/txtFile/Postfix_Test.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String input = br.readLine();

            br.close();

        } catch (Exception e) {

        }


    }


    public static int Calculations (Stack stackReg, String input) {
        int firstNum = 0;
        int secondNum = 0;
        String[] array = null;

        for(int i = 0; i < input.length(); i++) {
            array = input.split(" ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("+") || array[i].equals("-") || array[i].equals("*") || array[i].equals("/") ) {
                firstNum = (int) stackReg.pop();
                secondNum = (int) stackReg.pop();
                switch(array[i]) {
                    case "+": {
                        int newNum = firstNum + secondNum;
                        stackReg.push(newNum);
                        break;
                    }

                    case "-": {
                        int newNum = firstNum - secondNum;
                        stackReg.push(newNum);
                        break;
                    }

                    case "*": {
                        int newNum = firstNum * secondNum;
                        stackReg.push(newNum);
                        break;
                    }

                    case "/": {
                        int newNum = firstNum / secondNum;
                        stackReg.push(newNum);
                        break;
                    }
                }
            } else {
                stackReg.push(Integer.parseInt(array[i]));
            }
        }
        return (int) stackReg.peek();

    }

}
// input.charAt(i)
// Integer.parseInt(input.substring(i))

// String numbers [] = line.split(" ");
// int num = Integer.parseInt(numbers[col]);
