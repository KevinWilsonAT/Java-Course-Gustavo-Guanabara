/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.primitivetypes;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class PrimitiveTypes {

    public static void main(String[] args) {
        
        // System output types
        
        float rank_out = (float) 8.5;
        String name_out = "Kevin";
        System.out.println("The rank is " + rank_out);
        System.out.printf("The rank is %.2f\n", rank_out);
        System.out.printf("%s's Rank is %.2f\n", name_out, rank_out);
        System.out.format("%s's Rank is %.2f\n", name_out, rank_out);
        
        // System input types
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name_in = keyboard.nextLine();
        System.out.print("Age: ");
        int age_in = keyboard.nextInt();
        System.out.print("Rank: ");
        float rank_in = keyboard.nextFloat();
        System.out.printf("%s's Rank is %.2f and has %d years old\n", name_in, rank_in, age_in);
        System.out.format("%s's Rank is %.2f and has %d years old\n", name_in, rank_in, age_in);
    }
}