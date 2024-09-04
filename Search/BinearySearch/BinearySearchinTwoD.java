import java.util.Arrays;

public class BinearySearchinTwoD {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=14;
        System.out.println(Arrays.toString(seacrch(arr,target)));
    }
    //search between the col provided
    static int[] Binary(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    //
    static int[] seacrch(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length - 1;
        if (row == 1) {
            return Binary(matrix, 0, 0, col - 1, target);
        }
        //run the loop till 2 rows are  remaining
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;
        while (rStart < rEnd - 1)//while this is true it will have more then two rows
        {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        //now we have  two  rows
        //check weather the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart +1, cMid};
        }
            //search in 1st half
            if (target <= matrix[rStart][cMid - 1]) {
                return Binary(matrix, rStart, 0, cMid - 1, target);
            }
            //search in 2nd half
            if (target <= matrix[rStart][cMid + 1] && target >= matrix[rStart][col - 1]) {
                return Binary(matrix, rStart, cMid + 1, col - 1, target);
            }
            //search in 3rd half
            if (target <= matrix[rStart + 1][cMid - 1]) {
                return Binary(matrix, rStart + 1, 0, cMid - 1, target);
            }
            //search in 4th half
            else {
                return Binary(matrix, rStart + 1, cMid + 1, col - 1, target);
            }


        }


    }





