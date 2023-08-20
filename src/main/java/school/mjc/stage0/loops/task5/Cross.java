package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int middleNumber = sideLength / 2 + 1;

        for(int x = 1; x <= sideLength; x++){
            for(int y = 1; y <= sideLength; y++) {
                if(x == middleNumber) {
                    System.out.print("8");
                } else if (y == middleNumber) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
