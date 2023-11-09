import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int perfSquare = 0;
        boolean verify = false;

        // Get user input
        do {
            System.out.println("Give me an integer.");

            if (scanner.hasNextInt()) {
                perfSquare = scanner.nextInt();

                if (perfSquare < 0) {
                    System.out.println("Negative squares result in imaginary numbers. Try again.");
                } else {
                    verify = true;
                }
            } else {
                System.out.println("That was not an integer.");
            }
        } while (!verify);

        // Check for perfect square
        System.out.println("Input: " + perfSquare);
        System.out.println("Output: " + !isDecimal(Math.sqrt(perfSquare)));
    }

    public static boolean isDecimal(double num) {
        String numAsString = Double.toString(num);

        if (numAsString.endsWith(".0")) {
            return false;
        } else if (numAsString.contains(".")) {
            return true;
        } else {
            return false; // if the double isn't formatted as x.0, rare but could happen?
        }
    }
}