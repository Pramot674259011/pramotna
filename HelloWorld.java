
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
                double celsius,fahrenheit;
Scanner scanner = new Scanner(System.in);
                System.out.print("Enter temperature in Celsius: ");
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
