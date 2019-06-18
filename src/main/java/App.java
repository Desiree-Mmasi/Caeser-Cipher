import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();
        Scanner myScanner = new Scanner(System.in);
        boolean runProgram = true;

        while (runProgram) {
            System.out.println("Welcome to a Caesar Ciphar program. Would you like to encrypt or decrypt a statement or would you like to exit?");
            String userAnswer = myConsole.readLine();


            if (userAnswer.equals("encrypt")) {
                System.out.println("Please enter a statement that you would like to encrypt:");
                String statement = myConsole.readLine();

                System.out.println("Please enter an encryption key");
                int key = myScanner.nextInt();

                CaeserCipher userEncryption = new CaeserCipher(statement, key);
                String encryption = userEncryption.isActuallyEncrypted(statement, key);

                System.out.println("The encrypted statement is: " + encryption);
    };
}
