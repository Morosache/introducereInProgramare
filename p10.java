public class p10 {
    public static void main(String[] args){
        int numar = 1001;

        // Căutăm cel mai mic număr prim mai mare decât 1000
        while (true) {
            boolean estePrim = true;

            for (int i = 2; i * i <= numar; i++) {
                if (numar % i == 0) {
                    estePrim = false;
                }
            }

            if (estePrim) {
                System.out.println("Cel mai mic număr prim mai mare decât 1000 este: " + numar);
                break;
            }

            numar++;
        }

        }

    }

