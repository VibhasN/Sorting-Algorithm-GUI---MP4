/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Mlima
 */
public class SelectionSort {
            public static int parseResult(String inputParam){
            return Integer.parseInt(inputParam);
        }
    public static void swapElements(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static String selectionSort(int[] array, int low, int high) {
            String sString = "";
            
            
            
            //Sort a between indices first and last, inclusive
        //Start at the first index 
        for (int i = low; i < array.length; i++) {
            //Find the smallest value in the array 
            //Initialize with the first element in the unsorted part of the array
            int small = array[i];
            int iSmall = i;

            //Now look for the smallest element
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < small) {
                    small = array[j];
                    iSmall = j;
                }
            }
            //We now know the smallest value in the unsorted array
            if (i != iSmall) { //if the smallest value isn't the first one, swap
                swapElements(array, i, iSmall);
                            for (int n:array){
                sString = sString + n + " ";
            }
            sString += "\n";
            
            
            
           
            
}
}
        return sString;
    }
}