import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int count=0;
        
        while(scan.hasNext()){
            a[count] = scan.nextInt();
            count++;
        }
        
        int totalSwaps=0;        
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;                    
                    numberOfSwaps++;
                    totalSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        System.out.println("Array is sorted in "+totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
           
    }
}