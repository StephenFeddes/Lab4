
public class Numbers {
    public static void main(String[] args) {
        int[] the_num_array = {78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19};
        int nextLargest;

        // Prints each integer in the array and the corresponding integer that is the next largest after it.
        for (int i=0; i < the_num_array.length; i++) {
            nextLargest = nxtLargest(the_num_array, the_num_array[i]);
            System.out.printf("\n%d: %d", the_num_array[i], nextLargest);
        }
    }

    public static int nxtLargest(int[] num_array, int num) {
        int largerNum = num;
        boolean found1stLargerNum = false;

        /* Array is searched simutaneously from both ends until middle is reached. 
        This is more efficient than a simple linear approach, but I am not sure if it is optimal. */
        for (int i=0; i <= num_array.length/2; i++) {
            
            /* First value greater than our inputted number is our initial next largest number. After the initial is found, the
            next largest number can only be a number less than the current largest number but greater than our inputted number. */
            if (num_array[i] > num && (num_array[i] < largerNum || !found1stLargerNum)) {
                largerNum = num_array[i];
                found1stLargerNum = true; 
            }
            
            // Checks value at an index opposite our current i. That is, if i is 0, we check the last i.
            if (num_array[(num_array.length - 1) - i] > num && (num_array[(num_array.length - 1) - i] < largerNum || !found1stLargerNum)) {
                largerNum = num_array[(num_array.length - 1) - i];
                found1stLargerNum = true;
            }
        }

        /*  If the resulting "next largest number" is the same as the one inputted, then there is no element greater than it.
            If there is no element greater than it, then Integer.MAX_VALUE is greater than it, according to the instructions.*/
        if (largerNum == num) {
            return Integer.MAX_VALUE;
        }

        return largerNum; // Returns the next largest number in the array
    }
}