package converting;

import java.awt.image.ColorConvertOp;
import java.util.Scanner;

public class Temp
{
    public static void main(String[] args){

        double convertF;
        double celsiusEntry;
        Getstuff celsiusNum1 = new Getstuff();
        Getstuff fahrenNum1 = new Getstuff();

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter a temperature in celsius >>>");
        celsiusEntry =  input.nextDouble();

        convertF = convertFahrenheit(celsiusEntry);
        celsiusNum1.setCelsiusTemp(celsiusEntry);
        System.out.println("The temperature in fahrenheit is" + convertF);

        System.out.println(celsiusNum1.getCelsiusTemp()+ "celsius temperature");
        System.out.println(fahrenNum1.getFahrenheitTemp()+ "fahrenheit temperature");

            public static double convertFahrenheit(double c)
                double convertF;
                convertF = c *(9/5) + 32;
                return convertF;


    }
}
