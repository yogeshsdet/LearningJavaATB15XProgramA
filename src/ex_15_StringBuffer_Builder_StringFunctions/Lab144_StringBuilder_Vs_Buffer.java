package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        //String - 90%
        String s0 = "Yogesh";
        String s1 = new String("Yash");

        //less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Yogesh");
        StringBuilder stringBuilder = new StringBuilder("YASH");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
