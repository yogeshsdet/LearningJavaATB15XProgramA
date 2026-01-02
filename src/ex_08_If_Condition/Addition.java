package ex_08_If_Condition;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 values: ");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int addition = i + j;
        System.out.println("Addition of values: " + addition);
    }
}
