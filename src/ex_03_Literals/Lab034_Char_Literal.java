package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'B';
        System.out.println(c2);

        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //Blank space

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("YogeshGaikwad");
        System.out.println("Yogesh"+new_line+"Gaikwad");
        System.out.println("Yogesh\nGaikwad");
        System.out.println("Yogesh"+tab_line+"Gaikwad");
        System.out.println("Yogesh"+back_space+"Gaikwad");
        System.out.println("Yogesh"+carriage_return+"Gaikwad");

        System.out.println(" -------- ");

        char c10 = 'A';
        char rupees = '₹';
        System.out.println(rupees);

        char my_laugh_smile = '\u1f60';
        System.out.println(my_laugh_smile);

        char c11 = '\u1F60';
        System.out.println(c11);

        int binary = 0b1010;
        int he = 0xFF;
        long amount = 1_00_000L;
        System.out.println(amount);

        char c = 'A';
        System.out.println(c);

    }
}
