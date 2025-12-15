package ex_01_Java_Basic;

public class Lab005_OddFromList {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("ODD numbers between 1 to 10: " + i);
            }
        }
    }
}
