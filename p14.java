public class p14 {
    public static void main(String[] args) {
        for (int num1 = 17; num1 <= 1000; num1 += 17) {
            for (int num2 = 19; num2 <= 1000; num2 += 19) {

                if (num1 + num2 == 1000) {
                    System.out.println("Perechea de numere care dau adunate 1000 este " + num1 + " si " + num2);

                }
            }

        }
        for (int num1 = 13; num1 <= 1000; num1 += 13) {
            for (int num2 = 7; num2 <= 1000; num2 += 7) {

                if (num1 + num2 == 1000) {
                    System.out.println("Perechea de numere care dau adunate 1000 este " + num1 + " si " + num2);

                }
            }
        }
    }
}
