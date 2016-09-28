import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
            for(int i =0; i<n;i++){
                int num = scan.nextInt();
                System.out.println(isPrime(num) ? "Prime" : "Not prime" );
            }
            
        }
    public static boolean isPrime(int n){
        if(n==1)return false;
        if(n==2)return true;
        
        if(n%2==0)return false;
        
        for(int i=3;i<n;i+=2){
            if(n%i==0) return false;
        }
        
        return true;
    }
    
}