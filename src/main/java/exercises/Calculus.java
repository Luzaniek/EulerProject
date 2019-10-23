package exercises;

public class Calculus {
    int n;


    public boolean checkPrimeNumber(int n) {

        boolean numberIsPrime = true;
        int m = (n / 2);
     //   System.out.println("m równa się : " + m);

        for (int i = 2; i < (m + 1); i++) {
           // System.out.println("Sprawdzamy " + i);
            if (n % i == 0) {

                numberIsPrime = false;
        //        System.out.println(n + " nie jest liczba pierwsza");
                break;
            }
        }
        return numberIsPrime;
    }

    public boolean checkPrimeBigNumber(long nn) {

        boolean bigNumberIsPrime = true;
        long m = (nn / 2);
        //   System.out.println("m równa się : " + m);

        for (long i = 2; i < (m + 1); i++) {
            // System.out.println("Sprawdzamy " + i);
            if (nn % i == 0) {

                bigNumberIsPrime = false;
                //        System.out.println(n + " nie jest liczba pierwsza");
                break;
            }
        }
        return bigNumberIsPrime;
    }


}

