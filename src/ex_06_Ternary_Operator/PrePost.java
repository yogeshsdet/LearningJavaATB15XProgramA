package ex_06_Ternary_Operator;

public class PrePost {
    static void main(String[] args) {

        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);

    }
}
