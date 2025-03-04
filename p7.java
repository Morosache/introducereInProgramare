import java.util.Scanner;

public class p7 {

    public static void main(String[] args) {
        int n, i, mediaAritmetica, num;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("n:");
        n = scanner.nextInt();

        for( i = 0; i <= n; i++){
            System.out.print("Introdu un numar: ");
            num = scanner.nextInt();
            suma += num;
        }

        mediaAritmetica = suma / n;

        System.out.println("Media aritmetica este: " + mediaAritmetica);
        scanner.close();
    }
}

