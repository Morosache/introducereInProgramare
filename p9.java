import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        int n;
        boolean prim = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        n = scanner.nextInt();

        if(n == 0 || n == 1) prim = false;
        else if(n % 2 == 0 && n != 2) prim = false;
        else for(int i = 3; i*i <= n; i = i+2){
            if(n % i == 0){
                prim = false;
                break;
            }
            }

        System.out.println(prim);

        scanner.close();




    }

}
