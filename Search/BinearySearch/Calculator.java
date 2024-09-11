import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first operand:");
        int operand1 = scanner.nextInt();

        System.out.println("Enter the operator (+ or -):");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second operand:");
        int operand2 = scanner.nextInt();


        if (operand1 < 0 || operand2 < 0) {
            System.out.println("Cannot perform the operation: One of the operands is negative.");
            return;
        }


        if (operand1 > 99 || operand2 > 99) {
            System.out.println("Cannot perform the operation: One of the operands is more than two digits.");
            return;
        }

        int result = 0;
        if (operator == '+') {
            result = operand1 + operand2;
        } else if (operator == '-') {
            result = operand1 - operand2;
        } else {
            System.out.println("Invalid operator. Only + and - are allowed.");
            return;
        }


        System.out.println("The result is: " + result);
    }
}
