package ex_08_If_Condition;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 values: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int value = a-b;
        System.out.println("Subtraction of values: " + value);

    }
}
