package KareemPack;
import java.util.*;
public class Hex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int c = 0; c < t; c++) {
            int n = s.nextInt();
            char[][] Bored = new char[n][];
            for (int i = 0; i < n; i++) {
                Bored[i] = s.next().toCharArray();
            }
            String Statues = GetStatues(Bored);
            System.out.println("Case #" + c + ": " + Statues);
        }
    }
        static String GetStatues (char[][] Bored){
            return "";
        }
    }

