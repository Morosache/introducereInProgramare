
import java.util.Scanner;

public class p1 {
    public static void main(String[] args){
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu un numar: ");
        num = scanner.nextInt();

        if(num > 5 && num <= 10){
            System.out.println("ADMIS");
        } else if (num < 1 || num > 10) {
            System.out.println("INVLAID");
        }
        else{
            System.out.println("RESPINS");
        }

        scanner.close();
    }
}
