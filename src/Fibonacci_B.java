/*
 * The goal of the program is to print out all the numbers in the Fibonacci
 * series in the range of 0 to 1,000,000
 */
public class Fibonacci_B {
    
    public static void main(String[] args) {
        Fibonacci_B f = new Fibonacci_B();
        f.calculteNumbers(1000000);
    }
    
    /*
     * Given the first two numbers, 0 and 1, in the series, calculates the next
     * numbers and prints them.   
     */
    private void calculteNumbers(int max) {
        int a = 0;
        int b = 1;
        print(a, max);
        print(b, max);
        while (b < max) {
            int c = a + b;
            print(c, max);
            a = b;
            b = c;
        }
    }
    
    private void print(int num, int max) {
        if (num < max) {
            System.out.println(num);
        }
    }
}
