import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static Scanner scanner = new Scanner(System.in);
    static public int countTry = 0;
    static public int spanOfNumbers = 0;
    static int spanMin = 0;
    static int spanMax = 0;

    public static void main(String[] args) {
        getSpanOfNumbers();
        int pcNumb = pcNumber();
        int userNumb = userNumber();
        compareNumbers(pcNumb, userNumb);
        System.out.println("PC number was: " + pcNumb );

    }

    static public void getSpanOfNumbers() {
        int spanA = 0;
        int spanB = 0;
        System.out.println("Enter your span of numbers for guessing");
        System.out.println("Begin of span.");
        if (scanner.hasNextInt()) {
            spanA = scanner.nextInt();
            System.out.println("End of span.");
            spanB = scanner.nextInt();
            if (spanA < spanB) {
                spanOfNumbers = spanB - spanA;
                spanMin = spanA;
                spanMax = spanB;
            } else {
                spanOfNumbers = spanA - spanB;
                spanMin = spanB;
                spanMax = spanA;
            }
            System.out.println("Enter number of tries to guess.");
            countTry = scanner.nextInt();

        } else {
            System.out.println("Enter your span of numbers for guessing again");
            scanner.next();
            getSpanOfNumbers();
        }

    }


    static public int pcNumber() {
        Random rand = new Random();
        int randInt;
        randInt = rand.nextInt(spanOfNumbers + 1);
        randInt += spanMin;
        System.out.println("PC has made a number between " + spanMin  + " and " + spanMax);
        return randInt;
    }

    static public int userNumber() {
        int userNumb = 0;
        System.out.println("Enter your number please (" + spanMin + "-" + spanMax + ")." );
        if (scanner.hasNextInt()) {
            userNumb = scanner.nextInt();
        } else {
            System.out.println("You entered not number, try again.");
            scanner.next();
            userNumb = userNumber();

    }
        return userNumb;
}

    static  public void compareNumbers (int a, int b){

            if (a == b) {
                System.out.println("Well done, you guessed the number!");
                System.exit(0);
            } else {
                while (countTry != 1) {
                    if (a < b) {
                        countTry--;
                        System.out.println("You have " + countTry + " tries to guess pc number!");
                        System.out.println("PС number is less than your number.");
                        int userNumber = userNumber();
                        compareNumbers(a, userNumber);
                    } else {
                        countTry--;
                        System.out.println("You have " + countTry + " tries to guess pc number!");
                        System.out.println("PC number is more than your number.");
                        int userNumber = userNumber();
                        compareNumbers(a, userNumber);
                    }

                }

            }


    }
}
