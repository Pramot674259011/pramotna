import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
         double cm,inches;        
Scanner scanner = new Scanner(System.in);
                System.out.print("Enter length in cm: ");
        cm = scanner.nextDouble();
        inches = cm / 2.54;
        System.out.println("Length in inches: " + inches);
    }
}
