package KareemPack;

import java.util.Scanner;

public class Candis1 {
    int p,q;
    void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower  number");
        p= sc.nextInt();
        System.out.println("Enter the Higher number");
        q= sc.nextInt();
    }
    void happy(){
        int sum=0,r,n;
        for(int i=p;i<=q;i++){
           n=i;
           sum=0;
           while (sum!=1&&sum!=4){
               sum=0;
               while (n>0){
                   r=n%10;
                   sum=sum+r*r;
                   n=n/10;
               }
               n=sum;
           }
           if(sum==1){
               System.out.print(i+" ");
           }
        }
    }
    public static void main(String[] args) {
        Candis1 s=new Candis1();
        s.sum();
        s.happy();
    }
}
