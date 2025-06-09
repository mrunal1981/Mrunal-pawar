import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        try (Scanner Scanner = new Scanner(System.in)) {
            int number = Scanner.nextInt();
            int fact=1;
            for(int i=1;i<=number;i++) {
                fact=fact*i;
            }
            System.out.println(fact);
        }
    }
}
