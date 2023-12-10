import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //Write a basic calculator program that takes two numbers and an
        // operator (+, -, *, /) as input and performs the corresponding
        // operation

        Scanner scanner = new Scanner(System.in);
        //prompt the user to input the first number
        System.out.println("input the first number");
        int numOne = Integer.parseInt(scanner.nextLine());
        //prompt the user to input the second number
        System.out.println("input the second number");
        int numTwo = Integer.parseInt(scanner.nextLine());
        //prompt the user to input the operand
        System.out.println("type the operand you want to use ? +,*,/,-");
        String operand = scanner.nextLine();
        calculate(numOne,numTwo,operand);
    }
    static void calculate(int numOne, int numTwo, String operand) {
        if (operand.equals("+")) {
            int result = numOne + numTwo;
            System.out.println(result);
        } else if (operand.equals("-")) {
            int result = numOne - numTwo;
            System.out.println(result);
        } else if (operand.equals("/")) {
            int result = numOne/numTwo;
            System.out.println(result);
        } else if (operand.equals("*")) {
            int result = numOne * numTwo;
            System.out.println(result);
        } else {
            System.out.println("invalid input!");
        }
    }
}
