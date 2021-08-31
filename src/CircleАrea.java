import java.util.Scanner;

public class CircleАrea {
   static Scanner scanner = new Scanner(System.in);
    static double r =0;
    static final double PI = 3.14;
    static double s = 0;
    public static void main(String[] args) {
        System.out.println("Enter radius of your circle. ");
        getR();

    }

    static public double getCircleArea(double r,double PI){
     return PI*(r*r);
    }

    static public void  getR(){
        if (scanner.hasNextInt()){
            r = scanner.nextInt();
            s = getCircleArea(r,PI);
            System.out.println("Area of your circle is " + s);
        } else {
            System.out.println("Your enter is not contain a number. Try again. ");
            scanner.next();
            getR();
        }
    }
}
