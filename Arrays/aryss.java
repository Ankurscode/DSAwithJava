import java.util.ArrayList;
import java.util.Scanner;

public class aryss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       ArrayList< ArrayList<Integer>> list = new ArrayList<>(10);
//        list.add(56);
//        list.add(54);
//        list.add(66);
//        list.add(58);
//        list.add(54);
//        list.add(23);
////        System.out.println(list.contains(54));
//        System.out.println(list);
//      list.remove(5);
//        System.out.println(list);
//        for (int i = 0; i < 5; i++) {//input
//            list.add(in.nextInt());
//        }
//        for (int i = 0; i < 5; i++) {//input
//            System.out.println(list.get(i));//pass index here to get any element in array . list[index] wil not work here
//        }
//        System.out.println(list);

        for (int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                list.get(i).add(in.nextInt());

            }

        }
        System.out.println(list);
    }
}
