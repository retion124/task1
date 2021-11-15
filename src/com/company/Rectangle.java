package com.company;


import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: ");
        double side1 = scanner.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double side2 = scanner.nextDouble();
        double areaCalculator = (side1 * side2);
        double perimeterCalculator = (side1 + side2) * 2;


        System.out.println("Площадь прямоугольника: " + areaCalculator);
        System.out.println("Периметра прямоугольника: " + perimeterCalculator);
    }
}