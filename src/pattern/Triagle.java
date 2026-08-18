package pattern;

public class Triagle {
    public static void main(String[] args){
    /* Pattern - Triagle
     *
     **
     ***
     */
    for(int row = 1; row <= 3; row++){

        for(int col = 1; col <= row; col++){
            System.out.print("*");
            }
        System.out.println();
        }
    }
}
