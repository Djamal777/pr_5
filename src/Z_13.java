import java.util.Scanner;

public class Z_13 {
    public static void rec() {
        Scanner in = new java.util.Scanner(System.in);
        int x = in.nextInt();
        if (x > 0) {
            int y = in.nextInt();
            System.out.println(x);
            if (y > 0) {
                rec();
            }
        }
    }
    public static void main(String[] args) {
        rec();
    }
}