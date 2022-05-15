package KareemPack;

import java.util.Scanner;

public class Candis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum=1,sec=0;
        int t = s.nextInt();
        for(int i=1;i<=t;i++){
            int n=s.nextInt();
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
                if(j>=2){
                sum=j+sum;
                sec=sum+sec;
            }}
        }
        System.out.println();
        System.out.println();
        System.out.println(sec);
    }
}
