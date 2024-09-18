public class Tuition {
    public static void main(String[] args) {
        futureTuition();

    }
    public static void futureTuition () {


        double T1 = 10000;
        double finalTuition = T1 * 2;

        double currentAmount = 10000;

        for (int i = 1; currentAmount < finalTuition; i++) {
            currentAmount += currentAmount * 7 / 100;
            if (currentAmount > finalTuition) {

                System.out.printf("The amount of years it would take is %d to be %.2f", i, currentAmount);
            }
        }
    }
}