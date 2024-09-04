package linearsearch.com;

public class LinearSearchMini {
    public static void main(String[] args) {
        int [] num={1,2,3,-4,-5,6,7};
        System.out.println(mini(num));
    }
    static int mini(int[]arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
