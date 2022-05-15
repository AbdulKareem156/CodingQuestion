package KareemPack;

import java.util.Scanner;
class karem{
    int prime(int sum){
        int j,cnt=0;
      for( j=2;j<sum/2;j++){
          if(sum%j==0)
              cnt++;
      }
      if(cnt==0)
          return 1;
      else
          return 0;
    }
}

public class PrimeSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       karem t = new karem();
        int k=0;
        int a[]=new int[25];
        int x = sc.nextInt();
        int h=x;

        for(int i=2;i<=x;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                   count++;
                }

            }
            if(count==0){
                a[k]=i;
                k++;
                System.out.print(i+" ");
            }

        }
        System.out.println();
        int c=0,sum=2,g=0,o=0;
        for(int i=0;i<k;i++){
            if(sum<=h) {
                sum = sum + a[i + 1];
                c = t.prime(sum);
            }
           if(c==1){
               System.out.println(sum);
               o++;
        }}
       // System.out.println();
        System.out.println("The number primes are");
        System.out.println(o);
       // System.out.println(g);

    }

}
