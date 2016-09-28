import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        
        for(int i = 1; i <= testCase; i++){
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            String s = in.next();
            char[] charArray = s.toCharArray();
            
            for(int j = 0; j < s.length(); j++){
                if(j%2==0){
                    even.append(charArray[j]);
                } else odd.append(charArray[j]);
            }
            System.out.println(even + " " + odd);
        }
    }
}