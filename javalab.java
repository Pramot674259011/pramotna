import java.util.Scanner;

public class javalab {
    static Scanner s = new Scanner(System.in);
    static int n = s.nextInt(), i;

    public static void main(String[] args) {
        for (i = 1; i <= 12; i++) System.out.println(n + " x " + i + " = " + (n * i));
    }
}
