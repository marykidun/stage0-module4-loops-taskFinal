package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public static void printTable(int numberTableToPrint){
        int number = 1;
        for (int i = 0; i <=10; i++) {
            if (numberTableToPrint < 0) {
                System.out.println("Use positive number");
                break;
            } else {
            System.out.print(number * i + " ");


            }
        }
    }
    public static void main(String[] args) {
        printTable(5);
    }
}
