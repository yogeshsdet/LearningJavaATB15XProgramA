package pattern;

public class BlankArray {
    public static void main(String[] args) {
    /*
    3  2  1
    3  2
    3
     */
        for (int row = 1; row <= 3; row++) {
            for (int col = 3; col >= row; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
