public class maxitem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 13, 20};
        System.out.println(maxRang(arr, 0, 3));
    }

    static int maxRang(int[] arr, int start, int end) {
        int maxva = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxva) {
                maxva = arr[i];
            }

        }
        return maxva;
    }

        static int max ( int[] arr){
            int maxval = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxval) {
                    maxval = arr[i];
                }

            }
            return maxval;
        }
    }

