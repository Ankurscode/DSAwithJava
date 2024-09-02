import java.util.ArrayList;

public class bairw {
    public static void main(String[] args) {
//        int[][] arr=new int[3][4];
//        for (int i=0;i<3;i++){
//            for (int j=0;j<4;j++){
//                arr[i][j]=(int)(Math.random()*10);
//
//            }
//        }
//        for(int i=0;i<3;i++){
//            for (int j=0;j<4;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//    }
        ArrayList<ArrayList<String>> grocrey = new ArrayList<>();
        ArrayList<String> cafelist = new ArrayList<>();
        cafelist.add("Coffe");
        cafelist.add("Morito");
        cafelist.add("Expressro");
        ArrayList<String> hublist = new ArrayList<>();
        hublist.add("hukka");
        hublist.add("beer");
        hublist.add("Alcohol");
        ArrayList<String> marketlist = new ArrayList<>();
        marketlist.add("Cholects");
        marketlist.add("kapechino");
        grocrey.add(cafelist);
        grocrey.add(hublist);
        grocrey.add(marketlist);
        System.out.println(grocrey);

    }

}