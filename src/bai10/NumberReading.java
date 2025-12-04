package bai10;

import java.util.Scanner;

public class NumberReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid number");
            }
        } else if (number < 20 && number >= 10) {
            switch (number) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
                default:
                    System.out.println("Invalid number");

            }
        } else if (number >= 20 && number < 100) {
            switch (number) {
                case 20:
                    System.out.println("Twenty");
                    break;
                case 30:
                    System.out.println("Thirty");
                    break;
                case 40:
                    System.out.println("Forty");
                    break;
                case 50:
                    System.out.println("Fifty");
                    break;
                case 60:
                    System.out.println("Sixty");
                    break;
                case 70:
                    System.out.println("Seventy");
                    break;
                case 80:
                    System.out.println("Eighty");
                    break;
                case 90:
                    System.out.println("Ninety");
                    break;
                default:
                    System.out.println("Invalid number");
            }
        } else if (number >= 100 && number < 1000) {
            switch (number) {
                case 100:
                    System.out.println("One hundred");
                    break;
                case 200:
                    System.out.println("Two hundred");
                    break;
                case 300:
                    System.out.println("Three hundred");
                    break;
                case 400:
                    System.out.println("Four hundred");
                    break;
                case 500:
                    System.out.println("Five hundred");
                    break;
                case 600:
                    System.out.println("Six hundred");
                    break;
                case 700:
                    System.out.println("Seven hundred");
                    break;
                case 800:
                    System.out.println("Eight hundred");
                    break;
                case 900:
                    System.out.println("Nine hundred");
                    break;
                default:
                    System.out.println("Invalid number");

            }
        }


    }
}
