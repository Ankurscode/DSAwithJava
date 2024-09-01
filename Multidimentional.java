import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimentional {
    public static void main(String[] args) {

//        int [][] arr=new int[3][];
//        int [][] arr={
//                {1 , 2 , 3},
//                {4 , 5 ,6},
//                {7 , 8 , 9}
//        };
        Scanner in=new Scanner(System.in);
        int [][] arr =new int[3][3];
        System.out.println(arr.length);
        for (int row=0;row< arr.length;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
//            for (int row=0 ;row< arr.length;row++){
//                for (int col=0;col<arr[row].length;col++){
//                    System.out.print(arr[row][col]+" ");
//                }
//
//                System.out.println();
//            }
        for(int row=0;row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        }


    }

