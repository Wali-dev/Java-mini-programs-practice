import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers to find out the largest one: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        if(num1>num2){

            if (num1>num3) {
                System.out.println("The largest number is : "+ num1);
            }
        }
        else if(num2>num1){

            if (num2>num3) {
                System.out.println("The largest number is : "+ num2);
            }
        }
        else{
            System.out.println("The largest number is : "+ num3);
        }

    }
}