import java.util.Scanner;

public class praamot
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeNum;
        boolean isPrime;

        System.out.print("Enter a number: ");
        primeNum = scanner.nextInt();
        isPrime = primeNum > 1;

        for (int i = 2; i <= Math.sqrt(primeNum); i++) {
            if (primeNum % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}


