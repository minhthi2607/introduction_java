package bai7;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Enter your weight in kilograms: ");
        weight = scanner.nextDouble();
        System.out.println("Enter your height in meters: ");
        height = scanner.nextDouble();
        bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if(bmi < 18){
            System.out.println("Underweight: " + bmi );
        }else if(bmi < 25){
            System.out.println("Normal weight: " + bmi );
        }else if(bmi < 30){
            System.out.println("Overweight: " + bmi );
        }else{
            System.out.println("Obese: " + bmi );
        }
    }
}
