package KareemPack;

import java.util.Scanner;
import java.util.ArrayList;
public class Arratistt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
     ArrayList<Integer> list=new ArrayList<>();
     int n= sc.nextInt();
     for(int i=0;i<n;i++){
         int d=sc.nextInt();
         for(int j=0;j<d;j++){
             int item=sc.nextInt();
             list.add(item);
         }
         mainList.add(list);

     }
/*
     int r=sc.nextInt();
     for(int k=0;k<r;k++){
         int row=sc.nextInt();
         int col=sc.nextInt();
         try {


             int m = mainList.get(row-1).get(col-1);
             System.out.println(m);
         }
       catch (Exception e){
           System.out.println("Error");
       }
       }
      //  System.out.println(mainList);

 */
    }
}
