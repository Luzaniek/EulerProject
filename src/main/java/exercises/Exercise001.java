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


}




