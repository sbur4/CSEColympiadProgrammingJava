import java.util.Scanner;

/**
 * Consider an algorithm that takes as input a positive integer n. If n is even,
 * the algorithm divides it by two, and if n is odd, the algorithm multiplies it
 * by three and adds one. The algorithm repeats this, until n is one. For
 * example, the sequence for n=3 is as follows: 3→10→5→16→8→4→2→1
 * <p>
 * Your task is to simulate the execution of the algorithm for a given value of
 * n.
 * <p>
 * Input:The only input line contains an integer n. Output: Print a line that
 * contains all values of n during the algorithm. Constraints: 1≤n≤106 Example -
 * Input: 3 / Output: 3 10 5 16 8 4 2 1
 */

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class WeirdAlgorithm {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your integer");
        int n = userInput.nextInt();

        while (n != 1) {
            if (n == 1 || n <= 1 || n >= 100) {
                System.out.println("Not avaliable!");
                System.exit(0);
            } else if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
        userInput.close();
    }
}