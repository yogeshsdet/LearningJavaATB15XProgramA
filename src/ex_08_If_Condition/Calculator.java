package ex_08_If_Condition;

import java.util.Scanner;

public class Calculator {
    int result;
    public void addition(int p, int q){
        result = p + q;
        System.out.println(result);
    }
    public void subtraction(int p, int q){
       result = p - q;
        System.out.println(result);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 values: ");
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();

        Calculator demo = new Calculator();
        demo.addition(val1, val2);
        demo.subtraction(val1,val1);
    }
}
