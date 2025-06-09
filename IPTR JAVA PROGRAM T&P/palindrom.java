import java.util.Scanner;
public class palindrom {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num =sc.nextInt();
            System.out.println(num);
            int original = num;
            int reversed = 0;

            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
    }
}