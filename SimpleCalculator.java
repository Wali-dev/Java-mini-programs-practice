import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        System.out.println("Please enter two numbers: ");
        Scanner input = new Scanner(System.in);

        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float res = 0;

        System.out.println("Enter the operation(+ , - , *, /): ");
        Scanner op = new Scanner(System.in);
        char oparend = op.next().trim().charAt(0);

        if (oparend == '+' || oparend == '-' || oparend == '*' || oparend == '/') {
            if (oparend == '+') {
                res = num1 + num2;
            } else if (oparend == '-') {
                res = num1 - num2;
            } else if (oparend == '*') {
                res = num1 * num2;
            } else if (oparend == '/') {
                res = num1 / num2;
            }
        } else {
            System.out.println("Enter a valid operator and run the program again");
        }

        System.out.println(res);
    }
}