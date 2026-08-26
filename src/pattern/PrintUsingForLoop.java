package pattern;

public class PrintUsingForLoop {
    public static void main(String[] args) {
        /*
        Print, using For loop
        3  2  1
        2  1
        1
         */

        for(int row = 1; row <= 3; row++){
            for(int col = 3; col >= row; col--){

                System.out.print(row);

            }
            System.out.println();

        }
    }
}
