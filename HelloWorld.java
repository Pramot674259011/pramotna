import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("ป้อนตัวเลข 5 ตัว:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("ค่าต่ำสุด: " + min);
        System.out.println("ค่าสูงสุด: " + max);
    }
}


