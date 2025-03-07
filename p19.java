import java.util.Scanner;

public class p19 {
    public static void main(String[] args){
        int reverse = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        while(n != 0){
            int numar = n % 10;
            reverse = reverse *10 + numar;
            n /= 10;
        }
        System.out.println(reverse);
        scanner.close();


    }
}
