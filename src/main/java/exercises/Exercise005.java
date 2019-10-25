package exercises;

public class Exercise005 {


    public int perform006(int numberDone) {
        int theDifference = 0;
        int sumaFirst = 0;
        int sumaSecond = 0;

        for (int i = 1; i < (numberDone + 1); i++) {
            sumaFirst = sumaFirst + i;

        }

        for (int j = 1; j < (numberDone + 1); j++) {
            sumaSecond = sumaSecond + j * j;

        }

        System.out.println(sumaFirst * sumaFirst);
        System.out.println(sumaSecond);
        theDifference = sumaFirst * sumaFirst - sumaSecond;
        return theDifference;
    }


    public void perform006() {
        int i = 0;
        int nn = 1;
        int j = 2;

        while (nn<10001)
         {
            Calculus ccc = new Calculus();

            if (ccc.isItPrimeNumber(j) == true) {
                nn++;
            }
            j++;
        }

        System.out.println(nn + " to " + --j);
    }

}
