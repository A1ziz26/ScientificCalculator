import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root function (√x)");
            System.out.println("6. Factorial function (x!)");
            System.out.println("7. Natural logarithm (ln(x))");
            System.out.println("8. Power function (x^b)");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    double num3 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num4 = scanner.nextDouble();
                    System.out.println("Result: " + (num3 - num4));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    double num5 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num6 = scanner.nextDouble();
                    System.out.println("Result: " + (num5 * num6));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    double num7 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num8 = scanner.nextDouble();
                    if (num8 != 0) {
                        System.out.println("Result: " + (num7 / num8));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    double number1 = scanner.nextDouble();
                    System.out.println("Square root of " + number1 + " is: " + Math.sqrt(number1));
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    int number2 = scanner.nextInt();
                    System.out.println("Factorial of " + number2 + " is: " + factorial(number2));
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    double number3 = scanner.nextDouble();
                    System.out.println("Natural logarithm of " + number3 + " is: " + Math.log(number3));
                    break;
                case 8:
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + " raised to the power of " + exponent + " is: " + Math.pow(base, exponent));
                    break;
                case 9:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
            }
        } while (choice != 9);

        scanner.close();
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
