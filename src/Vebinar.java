import java.sql.Array;
import java.util.Arrays;

public class Vebinar {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 10;
//        if (a > b){
//            System.out.println("a is greater than b");
//        } else if (a == b){
//            System.out.println("a equals b");
//        }
//        else {
//            System.out.println("b is greater than a");
//        }
//    }
//    int c = 0;
//    int d = 0;
//    int  h =0;
public static void main(String[] args) {
    int arr[];
    int [] arr1= {1,2,3,4,5};
    int [] arr2= new int[20];
    int [] arr3 = new int[]{1,2,3,4,5};
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(arr3));
    int a = 20;
    int b =35;
//    while (b > a){
//        System.out.println("1: " + (b-a));
//        a++;
//    }
//
//    do {
//        System.out.println("2: " + (b-a));
//        a++;
//    }while (b>a);

    for (int i = 0; i <arr1.length ; i++) {
        System.out.println(i + ": " + arr1[i]);
    }

    for (int item:arr1) {
        if (item==3){
            continue;
        }
        System.out.println(item);
    }
}




}
