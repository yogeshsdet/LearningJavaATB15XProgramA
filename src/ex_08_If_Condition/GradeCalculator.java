package ex_08_If_Condition;

import java.util.Scanner;
/*✅ Grade Calculator:
Write a program that calculates and displays the letter grade for a
given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
            A: 90-100
            B: 80-89
            C: 70-79
            D: 60-69
            F: 0-59 */
public class GradeCalculator {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.println("Please enter score value: ");
        int gradeValue = value.nextInt();
        if(gradeValue >= 0 && gradeValue <= 59){
            System.out.println("Grade is F " + "& entered Grade value is: " +  gradeValue);
        } else if(gradeValue >= 60 && gradeValue <= 69) {
            System.out.println("Grade is D " + "& entered Grade value is: " + gradeValue);
        } else if (gradeValue >= 70 && gradeValue <= 79) {
            System.out.println("Grade is C "+ "& entered Grade value is: " + gradeValue);
        } else if (gradeValue >= 80 && gradeValue <= 89) {
            System.out.println("Grade is B " + "& entered Grade value is: "+ gradeValue);
        }else if(gradeValue >= 90 && gradeValue <= 100){
            System.out.println("Grade is A " + "& entered Grade value is: " + gradeValue);
        }else
            System.out.println("Enter value grade is not a valid: " + gradeValue);


    }
}
