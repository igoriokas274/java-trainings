package recursion;

public class App {

    public static void main(String[] args) {

        // E.g. Factorial of 4 calculates as 4*3*2*1

        System.out.println(factorial(8));

    }

    public static int factorial(int value) {

        if (value == 1) {
            return 1;
        }

        return factorial(value - 1) * value; // method calls itself

    }
}
