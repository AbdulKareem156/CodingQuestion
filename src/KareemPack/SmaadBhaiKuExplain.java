package KareemPack;
import java.util.Scanner;
class MD {
    void Md(int age){
        System.out.println("MD Samad");
        System.out.println(age);
    }
}
class Samad{
    void Samad(){
        System.out.println("Samad");
    }
}

public class SmaadBhaiKuExplain {
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int neg=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=i;k<j;k++){
                    System.out.print(a[j]+" ");
                  /*  neg+=a[k];
                    if(neg<0){
                        sum=sum+1;
                    }


                }
                System.out.println();
                neg=0;
            }
           // System.out.println();
            // neg=0;
        }
       // System.out.println(sum);


       */
           int arr[]={1,-2,4,-5,1};
           int sum=0,neg=0,add;
           int n= arr.length;
        System.out.println(n);
        for(int k=0;k<n;k++){
        for(int i=k;i<n;i++){
            neg=0;
            for(int j=k;j<=i;j++){
                System.out.print(arr[j]+" ");
               neg+=arr[j];
              //  if(neg<0){
                   // System.out.print(neg+"  ");
                   // sum=sum+1;
                }
            if(neg<0){
                System.out.println(neg+"  ");
                sum=sum+1;
            }
            //neg=0;
            System.out.println();
        }
          //  System.out.println();
    }
        System.out.println(sum);
    }
}
