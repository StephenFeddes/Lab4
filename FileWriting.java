import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String userInput;

        // Tries to write to a file strings that a user inputs
        try {

            PrintWriter pw = new PrintWriter("userStrings.txt");

            // Keeps asking user to input strings, and writes the input to a file until user enters "DONE"
            while (true) {

                System.out.print("Enter a string to write to file: ");
                userInput = scan.nextLine();

                // Terminates program after user enters "DONE, before "DONE" can be written to the file
                if (userInput.equals("DONE")) {
                    pw.close();
                    System.exit(0);
                }

                // Writes the user's string to a separate line in the file
                pw.println(userInput);
            }
        } catch (FileNotFoundException e) {}
    }
}