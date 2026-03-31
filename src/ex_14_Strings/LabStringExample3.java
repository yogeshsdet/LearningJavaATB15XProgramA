package ex_14_Strings;

public class LabStringExample3 {
    public static void main(String[] args) {
        String s = "java".substring(2);
        System.out.println(s);

        // "unhappy".substring(2) returns "happy" "
        // Harbison".substring(3) returns "bison"
        // "emptiness".substring(9) returns "" (an empty string)

        char[] arr = "Java".toCharArray();
        System.out.println(arr);// ['J', 'aa', 'v', 'a']

        boolean b = " ".isBlank();
        boolean b1 = "".isEmpty();

        System.out.println("Blank " + b);
        System.out.println("Empty " + b1);

        String s2 = "ab".repeat(3);
        String s3 = "Yogesh".repeat(3);
        System.out.println(s2);
        System.out.println(s3);

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);

        System.out.println("=".repeat(10));
        System.out.println("Here we got!");
        System.out.println("=".repeat(10));
        }
}
