import java.util.Scanner;

public class p4 {
    public static void main(String[] args){
        int num1, num2, num3, min;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu un numar: ");
        num1 = scanner.nextInt();
        System.out.print("Introdu un numar: ");
        num2 = scanner.nextInt();
        System.out.print("Introdu un numar: ");
        num3 = scanner.nextInt();

        if(num1 < num2 && num1 < num3){
            min = num1;
        } else min = Math.min(num2, num3);

        System.out.println(min);


        scanner.close();


    }
}
