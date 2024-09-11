import java.util.*;
public class Convet1Dto2D {

    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int m=2;
        int n=2;
        System.out.println(construct2DArray(original,m,n));
    }
        static int[][] construct2DArray(int[] original, int m, int n) {
            int[][]second2D=new int[m][n];
            if(original.length!=m*n){
                return new int[0][0];
            }
            for(int i=0;i<original.length;i++){
                second2D[i/n][i%n]=original[i];
            }
            for(int[]row:second2D){
                System.out.println(Arrays.toString(row));
            }
            return second2D;
        }

}
