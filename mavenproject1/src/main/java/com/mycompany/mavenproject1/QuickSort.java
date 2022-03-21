/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Arrays;

/**
 *
 * @author Mlima
 */
public class QuickSort {
            public static int parseResult(String inputParam){
            return Integer.parseInt(inputParam);
        }
            
     public static String main(int[] array) 
    {
        String str2 = "";
 
        //sort using quick sort
        str2 = quickSort( array, 0, array.length - 1 );

        System.out.println(Arrays.toString(array));
        return str2;
        
        
    }
 
    public static String quickSort(int[] arr, int low, int high) 
    {
        String qString = "";
         
 
        //finds the pivot element
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];
 
        // makes left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) 
        {
            //Checks that all values on left side array are greater than pivot
            //Checks that all values on left side array are lower than pivot
            while (arr[i] > pivot) 
            {
                j--;
                i++;
            }
            //Checks that all values on left side array are lower than pivot
            while (arr[j] < pivot) 
            {
                i++;
            }
            //comapres both sides to swap and after swapping move the pivot on both arrays
            if (i <= j) 
            {
                qString += swap (arr, i, j);
                i++;
                j--;  
            }
        }
        //Do the same thing to sort the rest
        if (low < j){
            qString += quickSort(arr, low, j);
        }
        if (high > i){
            qString += quickSort(arr, i, high);
        }
        return qString;
    }
     
    public static String swap (int[] array, int x, int y)
    {
        
        String swapString = "";   
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;  
        for (int i = 0; i < 10;i++) {
            swapString += array[i] + " ";      
        }
        swapString += "\n";
        return swapString;
        
    }
}

