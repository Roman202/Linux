import java.util.Scanner;

public class EngineeringCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Інженерний калькулятор");
        System.out.println("====================");
        System.out.println("Введіть операцію (+, -, *, /, sin, cos, tan, sqrt): ");
        String operator = scanner.next();
        
        if (operator.equals("sin") || operator.equals("cos") || operator.equals("tan") || operator.equals("sqrt")) {
            System.out.println("Введіть число: ");
            double num1 = scanner.nextDouble();
            performUnaryOperation(num1, operator);
        } else {
            System.out.println("Введіть перше число: ");
            double num1 = scanner.nextDouble();
            System.out.println("Введіть друге число: ");
            double num2 = scanner.nextDouble();
            performBinaryOperation(num1, num2, operator);
        }
    }
    
    public static void performBinaryOperation(double num1, double num2, String operator) {
        double result = 0;
        switch(operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Непідтримувана операція!");
        }
        System.out.println("Результат: " + result);
    }
    
    public static void performUnaryOperation(double num, String operator) {
        double result = 0;
        switch(operator) {
            case "sin":
                result = Math.sin(num);
                break;
            case "cos":
                result = Math.cos(num);
                break;
            case "tan":
                result = Math.tan(num);
                break;
            case "sqrt":
                result = Math.sqrt(num);
                break;
            default:
                System.out.println("Непідтримувана операція!");
        }
        System.out.println("Результат: " + result);
    }
}

