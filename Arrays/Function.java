import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
        int[] nums={2,4,5,5,6,7};
        System.out.println(Arrays.toString(nums));
        chage(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void chage(int[]arr){
        arr[3]=8;
    }
}
