import java.util.Scanner;

public class javalab {
    static Scanner s = new Scanner(System.in);
    static int price = s.nextInt(), paid = s.nextInt(), change = paid - price, bills[] = {1000, 500, 100, 50, 20, 10, 5, 1};

    public static void main(String[] args) {
        for (int b : bills) if (change >= b) { System.out.println(b + " บาท: " + change / b); change %= b; }
    }
}
