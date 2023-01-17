import java.util.Arrays;

public class FibonacciRunner {
    public static void main (String[] args) {
        // TEST constructor
        System.out.println("--- TEST CONSTRUCTOR ---");
        Fibonacci fib0 = new Fibonacci(2);
        int[] seq0 = fib0.getSequence();
        System.out.println(Arrays.toString(seq0));

        Fibonacci fib1 = new Fibonacci(6);
        int[] seq1 = fib1.getSequence();
        System.out.println(Arrays.toString(seq1));

        Fibonacci fib2 = new Fibonacci(15);
        int[] seq2 = fib2.getSequence();
        System.out.println(Arrays.toString(seq2));

        // TEST getIndexOf
        System.out.println("--- TEST getIndexOf ---");
        System.out.println(fib2.getIndexOf(1));
        System.out.println(fib2.getIndexOf(13));
        System.out.println(fib2.getIndexOf(144));
        System.out.println(fib2.getIndexOf(987));
        System.out.println(fib2.getIndexOf(100));
        System.out.println(fib2.getIndexOf(600));

        // TEST extendBy
        System.out.println("--- TEST extendBy ---");
        fib0.extendBy(3);
        System.out.println(Arrays.toString(fib0.getSequence()));
        fib1.extendBy(5);
        System.out.println(Arrays.toString(fib1.getSequence()));
        fib2.extendBy(2);
        System.out.println(Arrays.toString(fib2.getSequence()));

        //TEST prediction
        System.out.println("--- TEST prediction ---");
        Fibonacci fib3 = new Fibonacci(5);
        int[] seq3 = fib3.getSequence();
        System.out.println(Arrays.toString(seq3));
        seq3[0] = 100;

        int[] seq4 = fib3.getSequence();
        System.out.println(Arrays.toString(seq4));

        //QUESTION 7
        System.out.println("--- QUESTION 7 ---");
        Fibonacci fibonacci[] = new Fibonacci[3];
        fibonacci[0] = fib0;
        fibonacci[1] = fib1;
        fibonacci[2] = fib2;
        for (Fibonacci temp:fibonacci) {
            System.out.println(temp.getSequence().length);
        }
    }
}