package KareemPack;

import java.util.*;

public class findelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List s = new ArrayList();
        /* int n=s.size();
        s.add(1);
        s.add(2);
        s.add(3);
        if(s.contains(11)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

         */

        int i = 0;

       /*    while (sc.hasNext()) {
                if(s.size()<=n){
                s.add(sc.next());
            }
                else {
                    break;
                }
      }
        System.out.println(s);




        for(i=0;i<n;i++){
            s.add(sc.next());
        }
        System.out.println(s);
*/

        int n = sc.nextInt();
        int value = sc.nextInt();
        for (i = 0; i < n; i++) {
            s.add(sc.next());
        }
        System.out.println(s);
         Set ss =new HashSet(s);
        System.out.println(ss);
         if (!ss.contains(value)) {
            System.out.println("found");
        } else  {
            System.out.println("not found");
        }

    }}


