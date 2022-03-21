/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Mlima
 */
public class InsertionSort {
        public static int parseResult(String inputParam){
            return Integer.parseInt(inputParam);
        }
        public static String insertionSort(int[] array, int low, int high) {
                        String string5 = "";
                        
                        
                        for ( int i = low  + 1; i < array.length; i++){
        //sotre the value we insert
        int next = array[i];
        //start searching backwards for where we're going to insert
        int ifill = i-1;

        while ( ifill >= 0 && next < array[ifill]){
            array[ifill + 1] = array [ifill];
            ifill--;
                    for (int n:array){ 
                string5 = string5 + n + " ";
                }       
        string5 += "\n";
        }
        //when we we're done we know where our elemen belongs
        array[ifill + 1] = next;

        }
                          return string5; 
         
    }
                        
        }

