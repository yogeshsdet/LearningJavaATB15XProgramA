package ex_06_Ternary_Operator;

public class Lab066_To_Even_Odd {
    static void main(String[] args) {
        int num = 15;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
