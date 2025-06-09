import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            System.out.println(number);
            if(number/2==0)
            {
                System.out.println("even number");
            }
            else
            {
                System.out.println("odd number");
            }
        }
    }
}
