/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Mlima
 */
public class MergeSort {
           public static int parseResult(String inputParam){
            return Integer.parseInt(inputParam);
        }
    public static String mergeSort(int[] array, int low, int high) {
        String str = "";
        if (high <= low) return str;

        int mid = low+(high-low)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        str = merge(array, low, mid, high);
        return str;
    }
    
    public static String merge(int[] array, int low, int mid, int high) {
        String mString = "";
        // Find sizes of two subarrays to be merged
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];
        // Initial indexes of first and second subarrays
        int i = 0;
        int j = 0;
        // Initial index of merged subarray array
        int k = low;
        while (i < n1 && j < n2) {
            for (int n:array){
                mString = mString + n + " ";
            }
                mString += "\n";
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
  
        //Copy remaining elements of L[] if any 
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
  
        //Copy remaining elements of R[] if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
                return mString;

    }

    }
    
    

