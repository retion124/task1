package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: ");
        double side1 = scanner.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double side2 = scanner.nextDouble();


        System.out.println("Площадь прямоугольника: " + rec.areaCalculator(side1, side2));
        System.out.println("Периметра прямоугольника:" + rec.perimetrCalculator(side1, side2));
    }
}



