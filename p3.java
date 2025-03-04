import java.util.Scanner;

public class p3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        boolean pare, impare;

        System.out.print("Introdu un numar: ");
        num1 = scanner.nextInt();
        System.out.print("Introdu un numar: ");
        num2 = scanner.nextInt();

        pare = (num1 % 2 == 0) && (num2 % 2 == 0);
        impare = (num1 % 2 == 1) && (num2 % 2 == 1);


        if(pare){
            System.out.println((num1 + num2) / 2);
        } else if (impare) {
            System.out.println(num1 * num2);
        }
        else {
            System.out.println(num1 + num2);
        }

        scanner.close();
    }
}
