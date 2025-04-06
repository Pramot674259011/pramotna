import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
                int factNum, factorial;l
Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int factNum = scanner.nextInt();
                int factorial = 1;
                for (int i = 1; i <= factNum; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial: " + factorial);
        
                scanner.close();
}
}    
