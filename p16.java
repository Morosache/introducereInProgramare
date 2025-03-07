import java.util.Scanner;

public class p16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        while (n > 0){
            int numarUltim = n % 10;
            System.out.println(numarUltim);
            n = n / 10;

        }
        scanner.close();
    }
}
