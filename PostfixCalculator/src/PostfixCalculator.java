/*
CZ
11/9/23
FY
 */

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class PostfixCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an expression in postfix notation (separated by spaces): ");
        String input = s.nextLine();

        Stack stackReg = new Stack();
        Stack stackInv = new Stack();

        int length = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                stackReg.push(i);
                length++;
            }
        }

        for (int i = 0; i < length; i++) {
            stackInv.push(stackReg.pop());

        }

        for (int i = 0; i < stackInv.size(); i++) {
            System.out.println(stackInv.pop());
        }
    }
}
