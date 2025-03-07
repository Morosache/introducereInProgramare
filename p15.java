public class p15 {
    public static void main(String[] args) {
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                int suma = 3 + a + 2 + b;

                if (suma% 9 == 0) {
                    int n = 3000 + a * 100 + 20 + b;
                    System.out.println(n);
                }
            }
        }
    }
}
