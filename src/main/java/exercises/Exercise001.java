package exercises;

public class Exercise001 {
    int k;
    int suma = 0;

    public int perform001(int k) {
        for (int i = 0; i < k; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma = suma + i;
            }
        }
        return suma;
    }

    public int perform002(int k) {
        int n0;
        int n1 = 1;
        int n2 = 1;
        int summa = 0;
        System.out.println(n1);
        System.out.println(n2);
        do {
            n0 = n1;
            n1 = n2;
            n2 = n2 + n0;

            System.out.println(n2);
            if (n2 % 2 == 0) {
                summa = summa + n2;
                System.out.println("suma: " + summa);
            }
        }
        while (n2 < k);
        return summa;
    }

    public long perform003(long k) {

        long h = k / 2 + 1;
        long ii = 1;
        for (long i = h; i > 1; i--) {

            if (k % i == 0) {
                Calculus number = new Calculus();
                boolean kk = number.checkPrimeBigNumber(i);
                if (kk == true) {
                    ii = i;
                    break;
                }
            }
        }
        return ii;
    }


    public void perform004() {
        int i;
        int j;
        int l;
        int product;
        int maxNumberPalindrom = 0;
        int ii = 0;
        int jj = 0;
        int maxPalindrom = 1;
        for (i = 999; i > 99; i--) {
            for (j = 999; j >99; j--) {
                product = i * j;
                String productString = Integer.toString(product);
                System.out.println(productString);
                l = productString.length();
                Calculus kkk = new Calculus();
                String turnedProductString = kkk.changingOrder(productString);
                System.out.println(productString + " oraz " + turnedProductString);
                if (productString.equals(turnedProductString)) {
                    if (product > maxNumberPalindrom ){
                        maxNumberPalindrom = product;
                        ii = i;
                        jj = j;
                    }

                }



            }

            System.out.println(ii + " x " + jj + " = " + maxNumberPalindrom);
//                m++;
//                System.out.println(m + " Product " + i + " times " + j +" = " + product);

        }

    }
}







