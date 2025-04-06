import java.util.Random;
import java.util.Scanner;

public class javalab {
    static Random r = new Random();
    static Scanner s = new Scanner(System.in);
    static int t = r.nextInt(100) + 1, g;

    public static void main(String[] args) {
        do {
            g = s.nextInt();
            System.out.println(g < t ? "ต่ำไป!" : g > t ? "สูงไป!" : "ถูกต้อง!");
        } while (g != t);
    }
}
