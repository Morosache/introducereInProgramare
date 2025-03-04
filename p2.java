import java.util.Scanner;

public class p2 {
    public static void main(String[] args){
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu un numar: ");
        num = scanner.nextInt();

        if(num < 1 || num > 5){
            System.out.println("INVALID");
        }

        switch(num){
            case 1:
                System.out.println("UNU");
                break;
            case 2:
                System.out.println("DOI");
                break;
            case 3:
                System.out.println("TREI");
                break;
            case 4:
                System.out.println("PATRU");
                break;
            case 5:
                System.out.println("CINCI");
        }




        scanner.close();
    }
}
