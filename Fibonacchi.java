import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int term = input.nextInt();

        int firstNum = 0;
        int secondNum = 1;

        int count = 0;
        while (count <= term) {
            int temp = secondNum;
            secondNum = firstNum + secondNum;
            firstNum = temp;

            count++;

        }
        System.out.println(secondNum);
    }

}
