import java.util.Scanner;

public class javalab {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนคำที่ต้องการตรวจสอบ: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " เป็น Palindrome");
        } else {
            System.out.println(input + " ไม่ใช่ Palindrome");
        }
    }
}
