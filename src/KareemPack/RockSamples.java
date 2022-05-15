package KareemPack;

import java.util.Scanner;

public class RockSamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[1000];
        int s,t,l1=0,l2=0,c=0;
        System.out.println("Enter the no elements");
        s= sc.nextInt();
        System.out.println("Enter the no of ranges");
        t=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<s;i++){
           a[i]=sc.nextInt();
        }

        for(int i=0;i<t;i++){
            System.out.println("Enter the range");
            l1=sc.nextInt();
            l2=sc.nextInt();
            for(int j=0;j<s;j++){
                if(a[j]>=l1&&a[j]<=l2){
                    c++;
                    //System.out.println(c);
                }
                //System.out.println(c);
                //c=0;
            }
            System.out.println(c);
            c=0;
        }
     //   System.out.println(c);

    }
}
