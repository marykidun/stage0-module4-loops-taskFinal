package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int number = (int) Math.pow(numberToPrint, power);
        for (int i = 1; i <= power; i++) {
            System.out.println(number);
            break;


        }

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
