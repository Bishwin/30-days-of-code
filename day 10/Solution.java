import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        char[] binary = Integer.toBinaryString(n).toCharArray();
        System.out.println(consecutiveOnes(binary));
        
    }
    
    private static int consecutiveOnes(char[] binary){
        int streak=1;
        int max=1;
        for(int i=0;i<binary.length-1;i++){
            if( binary[i]=='1' && binary[i] == binary[i+1] ){
                streak++;
            }else streak =1;
            if(streak > max){
                max = streak;
            }
        }
        return max;
    }
}