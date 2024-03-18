/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.array03foreach;

import java.util.Arrays;

/**
 *
 * @author kevin
 */
public class Array03ForEach {

    public static void main(String[] args) {
        double array[] = {3.5, 2.75, 9, -4.5};
        
        System.out.println("Without Order:");
        for (double value: array){
            System.out.print(value + " ");
        }
        System.out.println("");
        System.out.println("===================");
        Arrays.sort(array);
        System.out.println("Applying Order:");
        for (double value: array){
            System.out.print(value + " ");
        }
    }
}
