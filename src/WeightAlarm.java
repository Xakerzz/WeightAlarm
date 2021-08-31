import java.text.DecimalFormat;
import java.util.Scanner;

public  class WeightAlarm {
    static Scanner scanner = new Scanner(System.in);
    static  int optionBinary = 0;
    public static void main(String[] args) {
        double weight = getWeightРeight();
        double height = getWeightРeight();

        indexWeight(weight,height);
    }

    static   public double getWeightРeight(){
      double wh;

      if (optionBinary == 0) {
          System.out.println("Enter your weight.");

      }else {
          System.out.println("Enter your height.");
      }
      if (scanner.hasNextInt()) {
          wh = scanner.nextInt();
      } else {
          System.out.println("In your enter has not a number, try again.");
          scanner.next();
          wh = getWeightРeight();
      }
      optionBinary = 1;
      return wh;
  }

  static public void indexWeight(double weight, double height){
        height = height/100;
        double indexWeight = weight/(height*height);
      DecimalFormat df = new DecimalFormat("##.#");
        System.out.print("Your index is : " + df.format(indexWeight) + " Describe - ");
        if (indexWeight < 19){
            System.out.print("You have the Underweight");
        }
        if (indexWeight > 19 && indexWeight < 25 ){
            System.out.print("Your indexWeight is normal, Well done!");
        }
        if (indexWeight > 25 && indexWeight < 30){
            System.out.print("Your indexWeight is not normal,you need check it! ");
        }
        if (indexWeight > 30){
            System.out.print("You need call a doctor!!");
        }
  }
}
