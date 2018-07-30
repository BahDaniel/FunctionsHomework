package get.Max;

import java.util.Scanner;

public class GetMax {
    public static void main(String[] args) {

        int a, b, c;

        Scanner maxVal = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        a = maxVal.nextInt();
        b = maxVal.nextInt();
        c = maxVal.nextInt();

        int maxab = GetMax.getMax(a, b);
        int maxabc = GetMax.getMax(maxab, c);
        System.out.println("The Highest Number Is: " + maxabc);
    }
    public static int getMax(int a, int b) {

        if (a > b) {
            return a;
        }
        return b;

    }
}
