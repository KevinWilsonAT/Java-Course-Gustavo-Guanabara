/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.array01;

/**
 *
 * @author kevin
 */
public class Array01 {

    public static void main(String[] args) {
        int number[] = {3, 2, 8, 7, 5, 4};
        
        System.out.println("The total allocations of the variable 'number' is: " + number.length);
        
        for(int counter = 0; counter < number.length; counter++){
            System.out.println("In the position #" + counter + ", we have the value " + number[counter]);
        }
    }
}
