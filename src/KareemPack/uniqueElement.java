package KareemPack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class uniqueElement {
    public static void main(String[] args) {
     //   BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        Scanner s=new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String st[] = s.nextLine().split(",");
        int l=st.length;
        HashSet<Integer> ns=new HashSet<>();
       // int count =0;
        for(int i=0;i<l;i++){
            ns.add(Integer.parseInt(st[i]));


        }
        System.out.println(ns.size()-n);
    }
}
