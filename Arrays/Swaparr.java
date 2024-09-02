import java.util.Arrays;

public class Swaparr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        swap(arr, 2,1 );
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr ,int i,int o) {
        int temp=arr[i];
        arr[i]=arr[o];
        arr[o]=temp;
    }
}
