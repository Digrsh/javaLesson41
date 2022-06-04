package Lesson3;

public class Main {

    public static void main(String[] args){

        int[] tels = {1,1,0,0,1,0,1,1,0,0};

        for (int i = 0; i < tels.length; i++) {

            if(tels[i]==1) {
                tels[i]=0;
            }
            else tels[i]=1;

            System.out.print(tels[i] + " ");
    }
        System.out.println();

        int[] tels2 = new int[100];
        for (int i = 0; i < tels2.length; i++) {
            tels2[i] = i + 1;
        }
        for (int i = 0; i < tels2.length; i++) {
            System.out.print(tels2[i] + " ");
        }
        System.out.println();

        int[] tels3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < tels3.length; i++) {
            if (tels3[i] < 6) {
                tels3[i] *= 6;
            }
        }
        for (int i = 0; i < tels3.length; i++) {
            System.out.print(tels3[i] + " ");
        }
        System.out.println();

        int [][] tels4 = new int [10][10];
        for (int i = 0; i < tels4.length; i++) {
            for (int j = 0; j < tels4[0].length; j++) {
                if (i  == j) {
                    tels4[i][j] = 1;
                }
                if (j == i) {
                    tels4[i][j] = 1;
                }
                System.out.print(tels4[i][j] + " ");
            }
            System.out.println();
        }

}
}


