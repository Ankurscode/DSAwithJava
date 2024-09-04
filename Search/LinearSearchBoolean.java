package linearsearch.com;

public class LinearSearchBoolean {
    public static void main(String[] args) {
        int[]nums={1,2,3,45,5};
        int target=95;
        boolean ans=linear(nums, target);
        System.out.println(ans);

    }
    static boolean linear(int arr[],int target){
        if(arr.length==0){
            return false;
        }
        for(int index=0;index<arr.length;index++){
            int result=arr[index];
            if(result==target){
                return true;
            }
        }
        return false;
    }
//    static int linear(int arr[],int target){
//        if(arr.length==0){
//            return Integer.MAX_VALUE;
//        }
//        for(int index=0;index<arr.length;index++){
//            int result=arr[index];
//            if(result==target){
//                return index;
//            }
//        }
//        return Integer.MAX_VALUE;
//    }
}
