package com.example.tasks.calculator;

import java.util.Random;
import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Double operand1 = new Random().nextDouble() * 100;
        Double operand2 = new Random().nextDouble() * 100;
        System.out.printf("%.2f, %.2f\nArithmetic sign: %n", operand1, operand2);
        Scanner scanner = new Scanner(System.in);
        try {
             String sign = scanner.nextLine();
            System.out.printf("%.2f %s %.2f = %.2f", operand1, sign, operand2, calcForSign(sign, operand1, operand2));
        }catch (IllegalArgumentException e){
            System.err.println("Error occurred, message: " + e.getMessage());
        }
    }
    public static Double calcForSign(String sign, Double a, Double b) throws IllegalArgumentException {
        switch (sign){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": {
                if(b==0) throw new IllegalArgumentException("Can't divide by 0");
                return a/b;
            }
            default: throw new IllegalArgumentException(String.format("Unrecognized sign '%s'", sign));
        }
    }
}
