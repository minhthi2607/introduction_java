package bai4;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        if (a != 0) {
        double answer = (c - b) / a;
        System.out.println("x = " + answer);
        }else{
            if(b == c){
                System.out.println("The solution is all x");
            }else{
                System.out.println("The equation has no solution");
            }
        }
        scanner.close();
    }
}
