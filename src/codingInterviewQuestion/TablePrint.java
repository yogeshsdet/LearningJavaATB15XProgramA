package codingInterviewQuestion;
//Table Print using System.out.printf

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter valid number to show table of: ");
        int j = scan.nextInt();
        //System.out.println("Table of " + j );

        for(int i = 1; i <= 10; i++){
            System.out.println(j * i);
        }
    }
}
