package KareemPack;

//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Concatination {
    public static void main(String[] args) throws IOException {
      // String  s = "1,2,3,5,6,4,8,7";
      //  InputStreamReader s = new InputStreamReader(System.in);
       // BufferedReader x = new BufferedReader(s);
        Scanner x= new Scanner(System.in);
      String z[] = x.nextLine().split(",");
    //  for(String i : z){
      //    System.out.print(i);
      //}
      String num1="";
      int num2=0;
     int  n = z.length;
     int[] ar = new int[n];
     int five =0;
     int eight = 0;
     for(int i =0;i<n;i++){
         ar[i] = Integer.parseInt(z[i]);
         if( ar[i]==5){
             five = i;
         }
         else if(ar[i]==8){
             eight = i;
         }
     }
     for(int i =five;i<=eight;i++){
         num1+=ar[i];
         ar[i]=0;
     }
     for(int num : ar){
         num2+=num;
     }
        System.out.println(num2+Integer.parseInt(num1));
        System.out.println(num2+" "+num1);
    }
}
