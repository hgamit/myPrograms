package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {
	
	public static int numberNeeded(String first, String second) {
        int delChar = 0;
       // boolean delFlag = false;
        char[] chars1 = first.toCharArray();
        char[] chars2 = second.toCharArray();
        
        for(int i=0;i<chars1.length;i++){
            for(int j=0;j<chars2.length;j++){
            
                if(chars1[i] == chars2[j]){
                    
                	 delChar += 2;  
                  // System.out.print(chars1[i]+""+chars2[j]);
                    
                }
        }
        }
        
        return chars1.length+chars2.length-delChar;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
     //   for (int i = 0, n = a.length(); i < n; i++) {
   // char c = a.charAt(i);System.out.println(c);
//}
        System.out.println(numberNeeded(a, b));
    }

}
