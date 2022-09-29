package model;

public class Calculator {
    public static float calculator(float firstOperand, float secondOperand, char operator ){
        switch (operator){
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if(secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Could not be shared out for 0");
            default:
                throw new RuntimeException("Invalid operation");
        }
    }

}
