import java.util.Scanner;

public class p18 {
    public static void main(String[] args){
        int min = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        while (n > 0){
            int numarUltim = n % 10;
            n = n / 10;

            if(numarUltim < min) min = numarUltim;

        }
        System.out.println(min);
        scanner.close();
    }
}
