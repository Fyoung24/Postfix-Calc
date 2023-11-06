import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        String input = s.nextLine();

        Stack test = new Stack();

    PostfixCalculator.Calculations(test, input);



    }
}