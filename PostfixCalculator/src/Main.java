import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String input = null;

        PostfixCalculator pc = new PostfixCalculator();

        Stack test = new Stack();

        // Calculate the result of the postfix expression loaded from a text file and log it
        pc.log(pc.Calculations(test, pc.loadTxt()));


    }
}