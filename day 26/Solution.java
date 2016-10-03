import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        final int MAX_FINE = 10000;
        final int MONTH_FINE= 500;
        final int DAY_FINE= 15;
        
        Scanner scan = new Scanner(System.in);
        int[] date = new int[6];
        int fine = 0;
        
        for(int i=0; i<date.length;i++){
            date[i] = scan.nextInt();
        }       
        
        if(date[2] > date[5]){
            fine = MAX_FINE;
        }else if(date[1] > date[4] && date[2] == date[5]){
            fine = MONTH_FINE * (date[1] - date[4]);
        }else if(date[0]> date[3] && date[2] == date[5]){
            fine = DAY_FINE * (date[0] - date[3]);
        } 
        System.out.println(fine);

    }
}