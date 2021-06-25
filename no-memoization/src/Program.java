import java.util.Scanner;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------"); 

        System.out.print("| Number: "); 

        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt(); 

        long start = System.currentTimeMillis();

        System.out.println("------------------- RESULT -----------------------"); 

        System.out.println("| Sum result = " + 
            IntStream.rangeClosed(1, num)
                .filter(i -> num % i == 0)
                .sum()
        );

        System.out.println("| ~ runtime: " + (System.currentTimeMillis() - start) + " ms");

        System.out.println("--------------------------------------------------"); 

        sc.close(); 

    }   
}