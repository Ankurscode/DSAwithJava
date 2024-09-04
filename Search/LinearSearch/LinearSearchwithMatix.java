package linearsearch.com;

import java.util.Arrays;

public class LinearSearchwithMatix {
    public static void main(String[] args) {
    int[][]arr={
            {10,20 ,30,40},
            {55,88,99,101},
            {120,122,123}
    };
    int target=123;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            }
            if (arr[r][c] > target) {
                c--;
            }
            else if(arr[r][c]<target){
                r++;
            }

        }
        return new int[]{-1, -1};
    }
}