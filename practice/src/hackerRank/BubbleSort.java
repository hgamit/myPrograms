package hackerRank;

import java.io.*;
import java.util.*;

public class BubbleSort {
    private static void printArray(String s, int[] x) {
        System.out.print(s + " Array: "); 
        for(int i : x){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void bubbleSort(int[] x) {
        //printArray("Initial", x);
        
        int endPosition = x.length - 1; // last array index
        int swapPosition;
        int scount=0;
        
        while( endPosition > 0 ) {
            swapPosition = 0;
            
            for(int i = 0; i < endPosition; i++) {
                
                if( x[i] > x[i + 1] ){
                    // Swap elements 'i' and 'i + 1':
                    scount++;
                    int tmp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = tmp;
                    
                    swapPosition = i;
                } // end if
                
                //printArray("Current", x);
            } // end for
            
            endPosition = swapPosition;
        } // end while
        
        System.out.println("Array is sorted in "+scount+" swaps.\n"+"First Element: "+x[0]+"\nLast Element: "+x[x.length - 1]);


       // printArray("Sorted", x);
    } // end bubbleSort
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] unsorted = new int[n];
        for(int i = 0; i < n; i++) {
            unsorted[i] = scanner.nextInt();
        }
        scanner.close();
        
        bubbleSort(unsorted);
    }
}