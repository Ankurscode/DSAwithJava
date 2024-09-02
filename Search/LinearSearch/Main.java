package linearsearch.com;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 4, 56, 3, 5, 2, 8, 9};
        int target = 123;
        int ans = learsearch(nums, target);
        System.out.println(ans);
    }

    static int learsearch(int arr[], int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for (int index = 0; index < arr.length; index++) {
            int result = arr[index];
            if (result == target) {
                return index;
            }

        }
        return Integers.MAX_VALUE;
    }
}
