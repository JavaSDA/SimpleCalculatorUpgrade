package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstValue;
	    double secondValue;
	    double answer;


	    // initialize variables
        firstValue = 22;
        secondValue = 7;
        String operator = "f";

	    System.out.println(doArithmetic(firstValue, secondValue, operator));



    }

    public static double doArithmetic(double firstNumber, double secondNumber, String operator) {
        double answer;
        answer = 0;
        switch (operator) {
            case "+":
                answer = firstNumber + secondNumber;
                return answer;
            case "-":
                answer = firstNumber - secondNumber;
//                System.out.println(answer);
                return answer;
            case "*":
                answer = firstNumber * secondNumber;
//                System.out.println(answer);
                return answer;
            case "/":
                answer = firstNumber / secondNumber;
//                System.out.println(answer);
                return answer;
            default:
                System.out.println("Enter a valid operator");
                return answer;
        }
//        return answer;
    }

    // Create a method that checks two numbers and uses a switch to
    // return max, min
}
