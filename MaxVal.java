import java.util.Scanner;

public class MaxVal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double max;
        double[] numbers = new double[3]; // Array of three numbers inputted by the user

        // Get's user to input three numbers
        for (int i=0; i < numbers.length; i++) {

            // Sligtly adjusted questions are asked on each iteration
            switch(i) {

                case 0: 
                    System.out.print("Enter 1st number: ");
                    double first_num = scan.nextDouble();
                    numbers[0] = first_num;
                    scan.nextLine(); // Cleans out buffer for next scanning
                    break;

                case 1:
                    System.out.print("Enter 2nd number: ");
                    double second_num = scan.nextDouble();
                    numbers[1] = second_num;
                    scan.nextLine();
                    break;

                case 2:
                    System.out.print("Enter 3rd number: ");
                    double third_num = scan.nextDouble();
                    numbers[2] = third_num;
                    scan.nextLine(); 
                    break;
            }
        }

        /* Initially sets the max to the first element in the array. The resulting max value returned is the
        last value that was larger than previous values after all the values have been iterated through */
        max = numbers[0];
        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nThe maximum value is " + max);
    }
}