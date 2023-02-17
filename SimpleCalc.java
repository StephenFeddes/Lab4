import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userExpression;
        double theLeftVal;
        String theOp;
        double theRightVal;
        
        // User keeps entering expressions until they enter "stop"
        while (true) {
            System.out.print("Enter expression: ");
            userExpression = scan.nextLine();

            // If user enters "stop", the program is immediately terminated.
            if (userExpression.equals("stop")) {
                System.out.println("Goodbye.");
                System.exit(0);
            }
    
            // Tries to evaluate the current expression entered by the user
            try {
                String[] components = userExpression.split(" ");

                // If the list of components is beyond 3, we do want not it executed.
                // EX: if "4500 - 300 -" gets entered, the program can execute without an error. However, we do want not this executed
                if (components.length > 3) {
                    System.out.println("Incorrect input, try again.");
                    continue;
                }
                
                theLeftVal = Double.parseDouble(components[0]);
                theOp = components[1];
                theRightVal = Double.parseDouble(components[2]);

                // Takes the inputted doubles and arithmetic operator and prints out the result
                System.out.println(doOperation(theLeftVal, theRightVal, theOp));

            } catch (Exception e) {
                // If user does not enter a properly formatted expression, tell user to try again
                System.out.println("Incorrect input, try again.");
            }
        }
    }

    public static double doOperation(double leftVal, double rightVal, String op) {

        // Calculates a basic expression for the appropriate operator argument
        switch(op) {
            case "+":
                return leftVal + rightVal;
            case "-":
                return leftVal - rightVal;
            case "*":
                return leftVal * rightVal;
            case "/":
                return leftVal / rightVal;
            default:
                System.out.println("Invalid operator!");
                return 0; // Function must return a double
        }
    }
}