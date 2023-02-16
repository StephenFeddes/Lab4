
public class Numbers {
    public static void main(String[] args) {
        int[] the_num_array = {78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19};
        int nextLargest;
        nxtLargest(the_num_array, 1);
        for (int i=0; i < the_num_array.length; i++) {
            nextLargest = nxtLargest(the_num_array, the_num_array[i]);
            System.out.printf("\n%d: %d", the_num_array[i], nextLargest);
        }
    }

    public static int nxtLargest(int[] num_array, int num) {
        int largerNum = num;
        boolean found1stLargerNum = false;

        for (int i=0; i <= num_array.length/2; i++) {
            
            if (num_array[i] > num && (num_array[i] < largerNum || !found1stLargerNum)) {
                largerNum = num_array[i];
                found1stLargerNum = true;
            }
            if (num_array[(num_array.length - 1) - i] > num && (num_array[(num_array.length - 1) - i] < largerNum || !found1stLargerNum)) {
                largerNum = num_array[(num_array.length - 1) - i];
                found1stLargerNum = true;
            }
        }

        if (largerNum == num) {
            return Integer.MAX_VALUE;
        }
        return largerNum;
    }
}