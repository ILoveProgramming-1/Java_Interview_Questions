import java.util.Scanner;
public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();
        if (number < 0) {
            System.out.println("Square root of a negative number is undefined in real numbers.");
        } else {
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is " + squareRoot);
        }
        scanner.close();
    }
}
