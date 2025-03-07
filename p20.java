import java.util.Scanner;

public class p20 {
    public static void main(String[] args){
        int reverse = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int numarOriginal = n;

        while(n != 0){
            int numar = n % 10;
            reverse = reverse *10 + numar;
            n /= 10;


        }

        if( numarOriginal == reverse) System.out.println("Numarul este palindrom");
        else System.out.println("Nu este palindrom");

        scanner.close();


    }
}
