import java.util.Scanner;

public class p12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();
        if(n < 2)
        for( int i = 2; i * i <= n; i++){
            if(n % i == 0) System.out.println(i + " ");


        scanner.close();

    }
}}
