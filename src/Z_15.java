public class Z_15 {
    public static int rec(int n) {
        if (n < 10){
            return n;
        }
        else{
            System.out.print(n % 10 + " ");
            return rec(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(rec(2323245));
    }
}
