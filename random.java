import java.util.*;

public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] numbers = new int[5];
        

        System.out.println("Enter 5 random 3-digit numbers:");
        
        for (int i = 0; i < 5; i++) {
            int num;
            
            while (true) {
                System.out.print("Enter number " + (i + 1) + ": ");
                num = scanner.nextInt();
                

                if (num >= 100 && num <= 999) {
                    break;
                } else {
                    System.out.println("Please enter a valid 3-digit number.");
                }
            }
            numbers[i] = num;
        }
        
   
        System.out.println("\nEntered numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
        

        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        

        System.out.println("\nMinimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
