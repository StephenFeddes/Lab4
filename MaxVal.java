import java.util.Scanner;

public class MaxVal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double max;
        double[] numbers = new double[3];

        for (int i=0; i < numbers.length; i++) {
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
                    scan.nextLine(); // Cleans out buffer for next scanning
                    break;
                case 2:
                    System.out.print("Enter 3rd number: ");
                    double third_num = scan.nextDouble();
                    numbers[2] = third_num;
                    scan.nextLine(); // Cleans out buffer for next scanning
                    break;
            }
        }

        max = numbers[0];
        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nThe maximum value is " + max);
    }
}