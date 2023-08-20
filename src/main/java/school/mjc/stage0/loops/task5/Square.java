package school.mjc.stage0.loops.task5;

public class Square {
    public static void printSquareFrom8s(int sideLength){
        for(int x = 0; x < sideLength; x++){
            for(int y = 0; y < sideLength; y++) {
                if(x == 0 || x == sideLength-1) {
                    System.out.print("8");
                } else if (y == 0 || y == sideLength - 1) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSquareFrom8s(0);
    }
}
