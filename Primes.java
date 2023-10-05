public class Primes {
        public static void main(String[] args) {
                int nValues = 50;
                for (int i = 2; i <= nValues; i++) {
                        double sqrt = Math.sqrt(i);
                        if (i == 2) {
                                System.out.println(i);
                                continue;
                        }
                        for (int j = 2; j <= sqrt; j++) {
                                if (i % j == 0) {
                                        // System.out.println("reached");
                                        break;
                                }
                                // System.out.println("reached again");
                                if (j == (int) sqrt) {
                                        System.out.println(i);
                                }
                        }
                }

        }
}
