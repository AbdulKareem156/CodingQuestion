package KareemPack;

import java.util.Scanner;
public class ConsecutivePrimeSum {
    static int prime(int b) {
        int j, cnt = 1;
        for (j = 2; j <= b/2; j++) {
            if (b%j == 0) {
                cnt = 0;
            }
        }
        if (cnt == 0)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        ConsecutivePrimeSum t = new ConsecutivePrimeSum();
        Scanner sc = new Scanner(System.in);
        int [] a = new int[25];
        int k=0;
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int cnt;
        for(int i=2;i<=n;i++){
             cnt =1;
            for(int j=2;j<=n/2;j++){
                if(i%j==0)
                    cnt=0;
                }
                if(cnt==1) {
                    //   int k;
                    a[k] = i;
                    k++;
                }
        }
        int count=0;
        int c;
        for(int i=0;i<k;i++){
            int sum=0;
            sum=sum+a[i];
           c=t.prime(sum);
            if(c==1)
           count++;    // int count=0;
        }
        System.out.println(count);
    }
}
