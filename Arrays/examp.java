import java.util.Scanner;

public class examp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers of row");
        int num= in.nextInt();
        System.out.println("Enter the numbers of colums ");
        int cols=in.nextInt();
        int [][] arr=new int[num][cols];
        for (int row =0;row< arr.length;row++ ) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
            for (int row =0;row< arr.length;row++ ){
                for (int col=0;col<arr[row].length;col++){
                    System.out.println(arr[row][col]);
                }

        }
    }
}
