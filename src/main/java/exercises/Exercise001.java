package exercises;

public class Exercise001 {
    int k;

    public int perform001(int k) {
        int suma = 0;
        for (int i = 0; i < k; i++) {
            if (i % 3 == 0 || i%5 == 0) {
                suma = suma + i;
            }
        }
        return suma;
    }
}




