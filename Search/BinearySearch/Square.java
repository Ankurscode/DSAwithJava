import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x= in.nextInt();
        System.out.println(mySqrt(x));

    }
        static int mySqrt(long x) {
            long l=1;
            long r=x+1;

            while(l<r){
                long mid=(l+r)/2;
                if(mid>x/mid){
                    r=mid;
                }
                else{
                    l=mid+1;
                }
            }

            return (int)l-1;
        }

}
