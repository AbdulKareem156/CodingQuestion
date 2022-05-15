package KareemPack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //  int n= sc.nextInt();
        //int d= sc.nextInt();
    //    int g=sc.nextInt();
        ArrayList<ArrayList<Integer>> s = new ArrayList<>(3);
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(3);
        l2.add(4);
        ArrayList<Integer> l3=new ArrayList<>();
        l3.add(5);
        l3.add(6);
        s.add(l1);
        s.add(l2);
        s.add(l3);
        System.out.println(l1);
        System.out.println(s.get(0).get(0));


    /*    ArrayList [][] a = new ArrayList [3][3];
        a[0][0].add(1);
        a[0][1].add(2);
        a[0][2].add(3);
        a[1][0].add(4);
        a[1][1].add(5);
        a[1][2].add(6);
        a[2][0].add(7);
        a[2][1].add(8);
        a[2][2].add(9);
        System.out.println(a[0][1]);

     */

    }
}
