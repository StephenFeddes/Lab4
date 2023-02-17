import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {

        double min;
        ArrayList<double[]> csvArrayList = csvTo2DArrayList("input.csv");

        // Initial index for the top row indexes (AKA indexes for the top of the columns)
        int col_top_index = 0;

        // Checks columns for their smallest value
        for (int col=0; col < (csvArrayList.get(0).length); col++) {

            // Initial value for the minimum. It is the value in the first index of the current column
            min = csvArrayList.get(0)[col_top_index]; 

            for (int row=0; row < (csvArrayList.toArray().length); row++) {

                /* If current value in the column is less than the previously
                assumed minimum in the column, it becomes the new minimum. */
                if (csvArrayList.get(row)[col] < min) {
                    min = csvArrayList.get(row)[col];
                }
            }

            // Print's the column number and smallest value in that column
            System.out.printf("COLUMN %d: %.1f\n", col_top_index+1, min);

            col_top_index += 1; // Next index on the top row (AKA first index on top of next column)
        }
    }

    // Takes a csv file, converts it to an ArrayList of double arrays, and returns that ArrayList
    public static ArrayList<double[]> csvTo2DArrayList(String filePath) {
        ArrayList<double[]> csvLines = new ArrayList<double[]>();
        double num;
        double[] row;

        // Parses the lines of the file and returns an ArrayList containing arrays of the doubles each line had
        try {
            Scanner inputFile = new Scanner(new File(filePath));
            String[] tokens;
            
            // Parses each value on a line, adds it to a double array, and adds that double array to the ArrayList. Repeats.
            while (inputFile.hasNextLine()) {

                tokens = inputFile.nextLine().split(",");
                row = new double[tokens.length]; // Array the size of the number of tokens on a line

                for (int i=0; i < tokens.length; i++) {
                    num = Double.parseDouble(tokens[i]);
                    row[i] = num; // Adds the parsed token to the current row (double array)
                }
                
                // Adds an array of doubles (row) to our ArrayList 
                csvLines.add(row);
            }

        } catch (FileNotFoundException e) {}
        
        return csvLines;
    }
}