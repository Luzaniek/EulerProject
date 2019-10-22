import exercises.Exercise001;
import exercises.FirstClass;

public class StartEuler {



    public static void main(String[] args) {
        System.out.println("Ala ma kota");

        Exercise001 e001 = new Exercise001();
        System.out.println("The answer: " +  e001.perform001(1000));

        Exercise001 e002 = new Exercise001();
        System.out.println("The answer: " +  e002.perform002(4000000));

    }
}
