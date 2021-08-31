public class Max {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int c = 2;
        int d = 5;

        max(a,b,c,d);

    }

    public static void max(int a, int b, int c, int d) {
        // write your code here
        if (a>b  && a>c && a > d){
            System.out.println("a");
        }
        if (b>a && b>c && b>d ){
            System.out.println("b");
        }
        if (c>b && c>a && c>d ){
            System.out.println("c");
        }
        if (d>b && d>a && d>c ){
            System.out.println("a");
        }
    }
}
