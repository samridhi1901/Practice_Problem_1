import java.util.*;
public class prime {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 10:");
        
                for (int num = 2; num <= 10; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPrime(int num) {
                for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}

