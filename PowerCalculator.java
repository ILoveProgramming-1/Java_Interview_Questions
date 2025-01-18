import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble(); 
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        double resultUsingMathPow = Math.pow(base, exponent);
        System.out.println("Result using Math.pow: " + resultUsingMathPow);
        double resultManual = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            resultManual *= base;
        }
        if (exponent < 0) {
            resultManual = 1 / resultManual;
        }
        System.out.println("Result using manual calculation: " + resultManual);
        scanner.close();
    }
}