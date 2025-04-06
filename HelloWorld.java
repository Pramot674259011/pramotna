public class HelloWorld {
    public static int fibonacciRec(int n) {
        if (n <= 1) return n;
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    public static void fibonacciLoop(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci (Loop):");
        fibonacciLoop(n);

        System.out.println("\nFibonacci (Recursion):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRec(i) + " ");
        }
    }
}
