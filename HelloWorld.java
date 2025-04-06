import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
                 double numA, numB, numC, average;
Scanner scanner = new Scanner(System.in);
                System.out.print("Enter first number: ");
               numA = scanner.nextDouble();
                System.out.print("Enter second number: ");
          numB = scanner.nextDouble();
                System.out.print("Enter third number: ");
               numC = scanner.nextDouble();
              average = (numA + numB + numC) / 3;
                System.out.println("Average: " + average);
    }
}
