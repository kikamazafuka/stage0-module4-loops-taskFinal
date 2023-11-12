package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int row = 1; row<=cathetusLength; row++){

            for (int space = 0; space<cathetusLength-row; space++){
                System.out.print(" ");
            }
            for (int col = row; col>=1; col--){
                System.out.print(col);
            }
            for (int col = 2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
