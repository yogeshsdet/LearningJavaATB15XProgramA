package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("YASH");
        stringBuffer.append("Tech");
        System.out.println(stringBuffer);

        String s1 = "Manas";
        String s2 = s1 + "Tech";
        System.out.println(s2);

    }
}
