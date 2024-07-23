import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args){

        System.out.println("Please enter two numbers: ");
        Scanner input = new Scanner(System.in);

        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        System.out.println("Enter the operation(+ , - , *, /): ");
        Scanner op = new Scanner(System.in);

        String oparend = op.next();
System.out.println("");

        
    }
}