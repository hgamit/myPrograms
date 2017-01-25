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
    
    static void bubbleSortE(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  //looping each index
                 for(int j=1; j < (n-i); j++){  //Each loop fixes one element
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                 }  
         } 
    }
    public static void bubbleSort(int[] x) {
        //printArray("Initial", x);
        
        int endPosition = x.length - 1; // last array index
        int swapPosition;
        int scount=0;
        
        while( endPosition > 0 ) {
            swapPosition = 0;
            
            //lopp moving bigger element towards end
            for(int i = 0; i < endPosition; i++) {
                
                if( x[i] > x[i + 1] ){
                    // Swap elements 'i' and 'i + 1':
                    scount++;
                    int tmp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = tmp;
                    
                    swapPosition = i;
                    printArray("switched", x);
                } // end if
                
                //printArray("Current", x);
            } // end for
            
          printArray("val", x);
            
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