import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    //연산자 정의
    private final String[] operationType = {"+","-","*","/"};

    //입력된 수식 계산(연산식)
    public int calculate(String expression) {
        //배열로 수식 분리
        String [] input = expression.split(" ");
        //초기 결과 값 설정
        int result = Integer.parseInt(input[0]);
        //초기 연산자 설정
        String operator = null;

        for(int i = 1; i < input.length; i++) {
            //만약 연산자일 경우: 검증 메서드
            if(isPermittedOperation(input[i])){
                operator = input[i];
            }
            //숫자일 경우 :계산 메서드
            else{
                result = partCalculate(operator, result, input[i]);
            }
        }
        return result;


    }





    //수식 파트 계산기
    public int partCalculate(String operator, int result, String input) {
        switch(operator){
            case "+":
                return result + Integer.parseInt(input);
            case "-":
                return result - Integer.parseInt(input);
            case "*":
                return result * Integer.parseInt(input);
            case "/":
                return result / Integer.parseInt(input);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    //연산자 파트 계산기
    public boolean isPermittedOperation(String input){
        for(String operation : operationType){
            if(input.equals(operation))return true; //연산자일 경우
        }
        return false;   //연산자가 아닌 숫자일 경우
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String expression = "2 + 3 * 4 / 2";
        int result = calculator.calculate(expression);
        System.out.println("Result: " + result); // Result: 10
    }




}
