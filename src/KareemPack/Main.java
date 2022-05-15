package KareemPack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
/*class i {
    static HashSet<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'O', 'U', 'I', 'a', 'e', 'o', 'i', 'u'));

    static String getRuler(String Kingdom) {
        int lastChar = Kingdom.charAt(Kingdom.length() - 1);
        if (vowels.contains(lastChar)) return "Alice";
        if (lastChar == 'y' || lastChar == 'Y') return "Nobody";
        else return "Bob";
    }
}

 */
public class Main {
   static HashSet<Character> vowels = new HashSet<>(Arrays.asList('A','E','O','U','I','a','e','o','i','u'));
      static String getRuler(String Kingdom){
          int lastChar = Kingdom.charAt(Kingdom.length()-1);
          if(vowels.contains(lastChar)) return "Alice";
          if(lastChar=='y'||lastChar=='Y') return "Nobody";
          else return "Bob";
      }


    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int T= in.nextInt();
        for(int i=0;i<T;i++){
            String Kingdom = in.next();
            System.out.println("case"+i+":"+Kingdom+"is ruled by"+getRuler(Kingdom));
        }
    }
}
