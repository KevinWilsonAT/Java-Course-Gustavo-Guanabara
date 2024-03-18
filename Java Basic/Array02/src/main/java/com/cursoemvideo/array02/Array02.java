/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.array02;

/**
 *
 * @author kevin
 */
public class Array02 {

    public static void main(String[] args) {
        String month[] = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int counter = 0; counter < month.length; counter++){
            System.out.println("The month " + month[counter] + " has " + days[counter] + " days.");
            System.out.println("========================================");
        }
    }
}
