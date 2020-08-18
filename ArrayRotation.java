import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        //Left array rotation
        int k=0;
        int temp;

        //loop d many times
        for(int i=0;i<d;i++){
            temp=a[0];
            for(k=0;k<n-1;k++){
                a[k]=a[k+1];
            }
            a[k]=temp;
        }
        //Print array elements
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
        scanner.close();
    }
}
