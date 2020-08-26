import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
 
  
  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 
  
  int n = Integer.parseInt(bufferedReader.readLine().trim());
 
 
  StringBuilder[] sb = new StringBuilder[100];
  for (int i = 0; i < 100; i++) {
    sb[i] = new StringBuilder();
  }
 
  
  for (int i = 0; i < n / 2; i++) {
 
    
    String s = bufferedReader.readLine();
 
   
    String[] split = s.split(" ");
 
    
    int index = Integer.parseInt(split[0]);
 
   
    sb[index].append("- ");
  }
 
  // **** append strings with same index to respective string builder ****
  for (int i = n / 2; i < n; i++) {
 
    
    String s = bufferedReader.readLine();
 
   
    String[] split = s.split(" ");
 
   
    int index = Integer.parseInt(split[0]);
    sb[index].append(split[1] + " ");
  }
 
  
  StringBuilder result = new StringBuilder();
  for (int i = 0; i < 100; i++) {
    result.append(sb[i].toString());
  }
  System.out.println(result.toString());
 
  
  bufferedReader.close();
}
}