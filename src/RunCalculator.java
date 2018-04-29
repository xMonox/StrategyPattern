import java.util.Scanner;
import java.util.regex.Pattern;

public class RunCalculator {
    static UseOperation useOperation;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Format: [number][operator][number]( no spaces ) \n Types of operations available: +, -, *, /");

        while(true) {
            System.out.println("Input: ");
            String input = scanner.next();
            String[] splitString = input.split("");
            int firstNo = Integer.parseInt(((splitString[0])));
            String operation = splitString[1];
            int secondNo = Integer.parseInt(((splitString[2])));


            switch (operation) {
                case "+":
                    useOperation = new UseOperation(new Addition());
                    useOperation.calculate(firstNo, secondNo);
                    break;
                case "-":
                    useOperation = new UseOperation(new Subtraction());
                    useOperation.calculate(firstNo, secondNo);
                    break;
                case "*":
                    useOperation = new UseOperation(new Multiplication());
                    useOperation.calculate(firstNo, secondNo);
                    break;
                case "/":
                    useOperation = new UseOperation(new Division());
                    useOperation.calculate(firstNo, secondNo);
                    break;
            }

            System.out.println("Result: " + useOperation.calculate(firstNo, secondNo) + "\n");
        }


    }
}
