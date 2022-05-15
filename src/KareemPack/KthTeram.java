package KareemPack;

import javax.swing.*;
import java.util.Scanner;

public class KthTeram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count =0;
        System.out.println("Enter the no and factor term");
        int n=s.nextInt();
        int k=s.nextInt();
        for(int i=n;i>=1;i--) {
            if (n % i == 0) {
                count++;
            }
            if (count == k){
                System.out.println(i);
                break;
        }}
          if(count!=k)
                System.out.println(1);

    }
}
