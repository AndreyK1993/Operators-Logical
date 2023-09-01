package app;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        double res;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input int value from 0 to 10000 a: ");
        int a = sc.nextInt();

        System.out.println("Input int value from 10001 to 25000 b: ");
        int b = sc.nextInt();

        System.out.println("Input int value from 25001 and bigger c: ");
        int c = sc.nextInt();

       if (0 < a | a <= 10000) {
            double res = a * .025;
           System.out.printf("Result is %.2f"  + res);

        } else if (10000 < b | b < 25000) {

            double res = b * .043;

           System.out.printf("Result is %.2f"  + res);

        } else if (c > 25000) {
            double res = c * .067;
            System.out.printf("Result is %.2f"  + res);

        sc.close();

    }
}