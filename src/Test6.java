import java.io.*;
import java.util.*;
///Given a string, S, of length N that is indexed from 0 to N-1, print its
/// even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) even.append(s.charAt(j));
                else odd.append(s.charAt(j));
            }

            System.out.println(even + " " + odd);
        }
    }
}