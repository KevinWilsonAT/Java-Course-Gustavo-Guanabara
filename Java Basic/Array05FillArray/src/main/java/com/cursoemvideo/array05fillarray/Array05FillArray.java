/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.array05fillarray;

import java.util.Arrays;

/**
 *
 * @author kevin
 */
public class Array05FillArray {

    public static void main(String[] args) {
        int array[] = new int[20];
        Arrays.fill(array, 0);
        
        for(int value: array){
            System.out.print(value + " ");
        }
    }
}
