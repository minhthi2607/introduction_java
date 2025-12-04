package bai9;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;

        System.out.println("Enter the amount of money: ");
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("VND: " + vnd);

    }
}
