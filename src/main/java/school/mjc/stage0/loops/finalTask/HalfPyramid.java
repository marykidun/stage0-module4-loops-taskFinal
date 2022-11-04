package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = cathetusLength; i > 0; i--) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = cathetusLength; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
