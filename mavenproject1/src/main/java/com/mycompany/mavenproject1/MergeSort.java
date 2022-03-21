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

        int mid = (low+high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        str = merge(array, low, mid, high);
        return str;
    }
    
    public static String merge(int[] array, int low, int mid, int high) {
        String string7 = "";
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = low; i < high + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                for (int n:array){
                string7 = string7 + n + " ";
            }
                string7 += "\n";
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                   array[i] = leftArray[leftIndex];
                   leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        return string7;
    }
    
    
}
