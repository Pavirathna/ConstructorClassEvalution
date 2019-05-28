package auxo;

import java.util.Scanner;

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 values :");
        SimpleCalculator calculator = new SimpleCalculator();
        double firstNumber=sc.nextDouble();
        double secondNumber=sc.nextDouble();
        calculator.setFirstNumber(firstNumber);
        calculator.setSecondNumber(secondNumber);
        System.out.println("Addition Result:"+calculator.getAdditionalResult());
        System.out.println("Subtraction Result:"+calculator.getSubtractionResult());
        System.out.println("Multiplication Result :"+calculator.getMulitiplicationResult());
        System.out.println("Division Result :"+calculator.getDivisionResult());

    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;

    }

    public double getSecondNumber() {
        return firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionalResult() {
        double addtionResult=firstNumber+secondNumber;
        return addtionResult;
    }

    public double getSubtractionResult() {
        double subtractionResult=firstNumber-secondNumber;
        return subtractionResult;
    }

    public double getMulitiplicationResult() {
        double mulResualt=firstNumber*secondNumber;
        return mulResualt;
    }

    public double getDivisionResult() {
        if(secondNumber==0)
        {
            return 0;
        }
        else {
            double divisionResult =firstNumber / secondNumber;
            return divisionResult;
        }

    }
}