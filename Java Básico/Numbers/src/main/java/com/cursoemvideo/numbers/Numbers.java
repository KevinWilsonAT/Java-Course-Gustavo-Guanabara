/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.numbers;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Numbers {

    public static void main(String[] args) {
        int number, sum=0;
        String option;
        Scanner keyboard = new Scanner(System.in);
        
        do{        
            System.out.println("Insert a number: ");
            number = keyboard.nextInt();
            sum += number;
            
            System.out.println("Continue? [Y/N] ");
            option = keyboard.next().toUpperCase().strip();
        } while (option.equals("Y"));
        
        System.out.println("The addition of all inserted numbers is: "+ sum);
    }
}
