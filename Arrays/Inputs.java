import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //arryas of primitives
//            int[] arr = new int[5];
//            for (int i=0;i<arr.length;i++){
//                arr[i]= in.nextInt() ;
//
//            }
////            System.out.println(Arrays.toString(arr));//it convert arrays to string and print it
////            for (int i=0;i<arr.length;i++){
////                System.out.print(arr[i] + " ");
////
////                for(int num:arr){ //for every  element in array , print the elemment
////                    System.out.println(num);//here num represent  to elements of array
//                }
            String[] str = new String[5];
            for (int i = 0; i < str.length; i++) {
                str[i] = in.next();
            }
            System.out.println(Arrays.toString(str));
        }

        }





