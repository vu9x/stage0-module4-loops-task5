package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        int middle = height % 2 == 0 ? height / 2: height / 2 + 1;
        int emptyPlace = 0;

        for(int x = 0; x < height; x++) {
            for (int y = 0; y < height; y++) {
                if(y < emptyPlace || y + 1 > height - emptyPlace) {
                    System.out.print(" ");
                } else {
                    System.out.print("8");
                }
            }
            System.out.println();


            if (height % 2 == 0) {
                if (x < middle - 1) {
                    emptyPlace++;
                } else if (x >= middle) {
                    emptyPlace--;
                }
            } else {
                if (x < middle - 1) {
                    emptyPlace++;
                } else if (x >= middle - 1) {
                    emptyPlace--;
                }
            }
        }
    }

    public static void main(String[] args) {
        printHourglassOfGivenSize(0);
    }
}
