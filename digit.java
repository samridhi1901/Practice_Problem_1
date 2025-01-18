import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a single digit number: ");
        int num = scanner.nextInt();
        
        // Declare a String variable instead of char
        String word;
        
        switch (num) {
            case 1: word = "one"; break;
            case 2: word = "two"; break;
            case 3: word = "three"; break;
            case 4: word = "four"; break;
            case 5: word = "five"; break;
            case 6: word = "six"; break;
            case 0: word = "zero"; break;
            case 7: word = "seven"; break;
            case 8: word = "eight"; break;
            case 9: word = "nine"; break;
            default: word = "?"; // If not a single digit number
        }
        
        System.out.println("The corresponding word is: " + word);
    }
}
