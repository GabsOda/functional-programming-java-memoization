import java.util.Scanner;
import java.util.function.Function;

public class Program {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------"); 

        System.out.print("| Number: "); 

        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();
         
        int sum = 0; 
        long start = System.currentTimeMillis();

        Function<Integer, Integer> function = y -> num % y; 

        Function<Integer, Integer> results = Memoizer.memoize(function);  

        for(int i = 1; i <= num; i++){
            if(results.apply(i) == 0){
                sum += i; 
            }
        }

        System.out.println("------------------- RESULT -----------------------"); 

        System.out.println("| Sum result = " + sum);

        System.out.println("| ~ runtime: " + (System.currentTimeMillis() - start) + " ms");

        System.out.println("--------------------------------------------------");
        
        sc.close(); 
    }
}