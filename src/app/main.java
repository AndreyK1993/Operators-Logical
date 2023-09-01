package app;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Input int value a: ");
        int a = sc.nextInt();


        if (0 < a || a < 10001) {
            double res = a * .025;
            System.out.printf("Result is %.2f", res);

        }  if (a > 10001 || a <= 25001) {
            double res = a * .043;
            System.out.printf("Result is %.2f", res);

        }  if (a > 25001) {
            double res = a * .067;
            System.out.printf("Result is %.2f", res);

            sc.close();

        }
    }
}
