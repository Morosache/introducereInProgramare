import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        int n;
        int factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            factorial *= i;
        }

        System.out.println(factorial);
        scanner.close();
    }
}
