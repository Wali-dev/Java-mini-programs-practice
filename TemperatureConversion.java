import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args){
        System.out.print("Enter the temp. in Celsius:");

        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();

        float tempF = (tempC*9)/5+32;

        System.out.println("In Fahrenheit the temp. is : "+tempF);
    }
}
