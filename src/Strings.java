import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) throws FileNotFoundException {
        String str1 = "Hello World 123";
        String str2 = new String("abc");
        String str3 = "abc";
        str2=str2.intern();
//        System.out.println(str1 == str2);

        Scanner scanner = new Scanner(new File("C:\\Users\\xaker\\Skillfactory\\Module2\\src\\test.txt"));

        while (!scanner.hasNextInt()){
            System.out.println(scanner.next());
        }
        System.out.println(scanner.nextInt()%5);

    }
}
