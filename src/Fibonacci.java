import java.util.ArrayList;
import java.util.List;

/*
 * The goal of the program is to print out all the numbers in the Fibonacci
 * series in the range of 0 to 1,000,000
 */
public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.printNumbers(1000000);
    }
    
    /*
     * Creates an array list, adds the first two numbers in the series, 0 and 1,
     * Calculates the sum of the first number and the second.  Adds the new 
     * number to the array, as long as its value is less than 1,000,000.  
     * Continues to iterate through the values in the array and calculate the
     * sum of the two neighboring numbers at the end of the array in order to
     * find the value of the next number.  
     */
    private void printNumbers(int max) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        int nextNumber = 0;
        for (int i = 0; nextNumber < max; i++) {
            nextNumber = list.get(i) + list.get(i + 1);
            if (nextNumber < max) {
                list.add(nextNumber);
            }
        }
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
