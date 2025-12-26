package ex_08_If_Condition;

import java.util.Scanner;

/*
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine if the
 triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
 or scalene (no sides are equal). Use an if-else statement to classify the triangle.

 */
public class TriangleClassifier_Assignment {
    static void main(String[] args) {
        System.out.println("Enter triangle size (values): ");
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    if(a == b && a == c){
        System.out.println("It is a Acute triangle");
    } else if (a == b || b == c){
        System.out.println("It is a Isosceles triangle");

    }else{
        System.out.println("It is a Scalene triangle");

    }

    }
}
