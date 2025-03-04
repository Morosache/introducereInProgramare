import java.util.Scanner;

public class p5 {
    public static void main(String[] args){
        int n, i;
        int suma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("n:");
        n = scanner.nextInt();

        for( i = 0; i < n; i++){
            if(i % 2 == 0) suma += i;
        }
        System.out.println(suma);
        scanner.close();
    }
}
