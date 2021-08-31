import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static int isEternalBinary = 0;
    static int result = 0;

    public static void main(String[] args) {
        while (isEternalBinary == 0) {
            int number1 = getInt();
            System.out.println(number1 + " ");
            char operation = getOperation();
            if (operation == 'c') {
                result = 0;
                isEternalBinary = 0;
                System.out.println("your result: " + result);
            } else {
                if (operation == '+' || operation == '-' || operation == '/' || operation == '*') {
                    System.out.println(number1 + " " + operation);
                    int number2 = getInt();
                    if (operation == '/' && number2 == 0) {
                        System.out.println(number1 + " " + operation + " " + number2 + " = ");
                        System.out.println("You can't divide by zero.");
                    } else {
                        calculator(number1, operation, number2);
                        System.out.println(number1 + " " + operation + " " + number2 + " = " + " " + result);
                        System.out.println("Your result: " + result);
                    }
                } else {
                    if (operation == 's') {
                        System.out.println("Good bye!!!");
                        System.exit(0);
                    } else {
                        System.out.println("Your operation is wrong, try again.");
                    }
                }
            }

            while (isEternalBinary == 1) {
                char operation2 = getOperation();
                if (operation2 == 'c') {
                    result = 0;
                    isEternalBinary = 0;
                    System.out.println("your result: " + result);
                } else {
                    if (operation2 == '+' || operation2 == '-' || operation2 == '/' || operation2 == '*') {
                        System.out.println(result + " " + operation2);
                        int number3 = getInt();
                        if (operation2 == '/' && number3 == 0) {
                            System.out.println(result + " " + operation2 + " " + number3 + " = ");
                            System.out.println("You can't divide by zero.");
                        } else {
                            System.out.print(result);
                            calculator(result,operation2, number3);
                            System.out.println( " " + operation2 + " " + number3 + " = " + " " + result);
                            System.out.println("Your result: " + result);
                        }
                    } else {
                        if (operation2 == 's') {
                            System.out.println("Good bye!!!");
                            System.exit(0);
                        } else {
                            System.out.println("Your operation is wrong, try again.");
                        }
                    }
                }
            }
        }
    }

    public static int getInt() {
        int operand;

        if (isEternalBinary == 0) {
            System.out.println("Enter your number.");
        } else {
            System.out.println("Enter your next number.");
        }
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        } else {
            System.out.println("In your enter has not a number, try again.");
            scanner.next();
            operand = getInt();
        }
        return operand;
    }

    public static char getOperation() {
        char operation = 0;
        System.out.println("Enter your operation.");
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);

        }
        return operation;
    }

    public static void calculator(int num1, char operation, int num2) {

        switch (operation) {
            case '+':
                result = num1 + num2;
                isEternalBinary = 1;
                break;
            case '-':
                result = num1 - num2;
                isEternalBinary = 1;
                break;
            case '*':
                result = num1 * num2;
                isEternalBinary = 1;
                break;
            case '/':
                result = num1 / num2;
                isEternalBinary = 1;
                break;
        }
    }
}










