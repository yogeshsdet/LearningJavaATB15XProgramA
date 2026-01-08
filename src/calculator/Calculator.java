package calculator;

public class Calculator {


    public static void main(String[] args) {
        //Calculator result = new Calculator();
        Add AddResult = new Add();
        Sub SubtractionResult = new Sub();
        Multi MultiplicationResult = new Multi();
        Divi DivisionResult = new Divi();

        AddResult.addition(5,6);
        AddResult.addition1(4,4,4);

        //Decimal value
        AddResult.addition2(5.3,6.6);
        AddResult.addition4(930.99, 23.22,33.33);

        //subtraction
        SubtractionResult.subtraction(333,33);
        SubtractionResult.subtraction1(4,4,4);

        //Decimal value
        SubtractionResult.subtraction2(5.3,6.6);
        SubtractionResult.subtraction3(930.99, 23.22,33.33);

        //Multiplication
        MultiplicationResult.multiplication(5,6);//30
        MultiplicationResult.multiplication1(4,9,8);//288
        //Multiplication for decimal values
        MultiplicationResult.multiplication2(9.1,8.9);//80.99
        MultiplicationResult.multiplication3(6.6,5.5,4.4);//159.62

        //Division
        DivisionResult.Division(6,2);
        //Division for decimal values
        DivisionResult.Division2(6.2,2.0);
    }
}
