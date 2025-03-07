import java.util.Scanner;

    public class p17 {
        public static void main(String[] args){
            int max = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("n: ");
            int n = scanner.nextInt();

            while (n > 0){
                int numarUltim = n % 10;
                n = n / 10;

                if(numarUltim > max) max = numarUltim;

            }
            System.out.println(max);
            scanner.close();
}
}
