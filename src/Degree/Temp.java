package Degree;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type your temperature in Fahrenheit :");

        double fahrenheit = keyboard.nextDouble();
        double c = ((fahrenheit - 32) * 5 / 9);
        if (c > 37) {
            System.out.println("You are ill!");
        } else {
            System.out.println("The temperature is " + c + "°C");
        }
    }

}
