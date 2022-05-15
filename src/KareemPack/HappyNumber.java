package KareemPack;

import javax.swing.plaf.IconUIResource;
import java.util.*;
class Samadbhai{
    void Samad(){
        System.out.println("Samad is a DBMS Topper");
    }
}
public class HappyNumber {
    int n,k;
    public void HappyNum(int arr[],int n,int k){

       Scanner a = new Scanner(System.in);

         int i=0,count=0;
           for(i=0;i<n;i++)  {
      int sum=0,r;
      int x=arr[i];
        for(int j=x-k;j<=x+k;j++){
            n=j;
            sum=0;
            while (sum!=1&&sum!=4){
                sum=0;
                while (n>0){
                    r=n%10;
                    sum+=(r*r);
                    n=n/10;
                }
                n=sum;
            }
            if(sum==1){
                count++;
                System.out.print(j+" ");
               // System.out.println(count);
            }

        }
              // System.out.println(count);
      }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
       /* System.out.println("Enter the size");
        int  n= a.nextInt();
       System.out.println("Enter the k");
        int  k=a.nextInt();
        System.out.println("Array");
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=a.nextInt();
        }
      HappyNumber z = new HappyNumber();
      z.HappyNum(arr,n,k);

        */
      Samadbhai obj = new Samadbhai();
      obj.Samad();
      //  System.out.println();
    }
}
