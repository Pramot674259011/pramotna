import java.util.Arrays;
import java.util.Scanner;

public class javalab {
    static Scanner s = new Scanner(System.in);
    static int n = s.nextInt(), i, numbers[] = new int[n];

    public static void main(String[] args) {
        for (i = 0; i < n; i++) numbers[i] = s.nextInt();
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
