package bai3;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width, height, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của hình của nhật: ");
        width = scanner.nextFloat();
        System.out.println("Nhập vào chiều rộng của hình chữ nhật: ");
        height = scanner.nextFloat();

        area = width * height;
        System.out.println("Diện tích hình chữ nhật là : " + area);
        scanner.close();
    }
}
