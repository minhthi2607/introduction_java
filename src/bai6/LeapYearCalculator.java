package bai6;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap year : " + year);
                }else{
                    System.out.println("Not leap year : " + year);
                }
            }else{
                System.out.println("Leap year : " + year);
            }
        }else{
            System.out.println("Not leap year : " + year);
        }
    }
}
