package KareemPack;

import java.util.Scanner;

public class CodeVita {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
       int  N =Integer.parseInt(s.nextLine());
      //  int n =Integer.parseInt(s.nextLine());
     //   int n = s.nextInt();
        String[] z1 = s.nextLine().split(" ");
       String[] z = s.nextLine().split(" ");
       int x = z.length;
       int  arr[] =new int[x];
       for(int j=0;j< z1.length;j++){
           for (int i = 0; i < x; i++) {
               arr[i] = Integer.parseInt(z[i]);
               System.out.print(arr[i]+" ");
           }}
      /*  Scanner s= new Scanner(System.in);
        int  N =Integer.parseInt(s.nextLine());
        //  int n =Integer.parseInt(s.nextLine());
        String[] z = s.nextLine().split(" ");
        int x = z.length;
        int  arr[] =new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = Integer.parseInt(z[i]);
            System.out.print(arr[i]+" ");
        }


       */
       }



}
