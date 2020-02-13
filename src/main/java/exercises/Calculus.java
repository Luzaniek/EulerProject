package exercises;

import java.sql.SQLOutput;

import static java.lang.Math.sqrt;

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


    public String changingOrder(String oldString) {
        String newString = "";
        int oldStringlenght = oldString.length();
        int i;
        for (i = 0; i < oldStringlenght; i++) {
            String charOfString = Character.toString(oldString.charAt(i));
            newString = charOfString + newString;
        }
        return newString;
    }


    public boolean isItPrimeNumber(int p) {
        boolean nnn = true;

        double pp = sqrt(p);
        //System.out.println(pp);
        int kk = (int) Math.ceil(pp) + 1;
        int dp;
        // System.out.println("pierwiatsek zaokraglony w gore to: " + kk);
        boolean primeValue = true;

        for (int i = 2; i < kk; i++) {
            dp = p % i;
            if (dp == 0) {

                //   System.out.println(p + " nie jest liczbą pierwszą. bo dzieli się przez: " + i);
                primeValue = false;
                break;
            }

        }
        if (primeValue == true) {
            System.out.println(p + " jest to liczba pierwsza");
        }
        return primeValue;
    }


    public void isItReallyPrimeNumber(int liczba) {
        double pierwiastek = Math.sqrt(liczba);
        double ppp = Math.ceil(pierwiastek);
        int qqq = (int) ppp;
        System.out.println(qqq);
        boolean eee = true;

        for (int i = 2; i < qqq; i++) {
            int yyy = liczba % i;
            if (yyy == 0) {
                System.out.println("nie jest pierwsza");
                System.out.println("dzieli sie przez " + i);
                eee = false;
                break;

            }
        }
            if (eee == true) {

            System.out.println("liczba " + liczba + " jest pierwsza");
            }


        }


    }




