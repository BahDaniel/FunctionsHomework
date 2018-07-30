package Date;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        int x, y;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What time is it? ");
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        if (x > 23) {
            System.out.println("Incorrect time!");
        } else if (y > 59) {
            System.out.println("Incorrect time!");
        } else {
            System.out.println("The time is " + x + ":" + y + " now");
        }
    }
}