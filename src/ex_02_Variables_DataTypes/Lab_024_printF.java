package ex_02_Variables_DataTypes;

public class Lab_024_printF {
    public static void main(String[] args) {
        byte a = 10;
        System.out.printf("Value of a is %d", a);
        //%d -> int, byte, short, - data type
        //%s -> String
        //%f -> float, double
        //%b -> boolean

        int aa =100;
        int bb = 121;
        System.out.printf("formatting the aa = %d and b = %d", aa,bb);

        System.out.println();
        int table = 9;
        System.out.printf("%dx1=%d", table, table * 1);
    }
}
