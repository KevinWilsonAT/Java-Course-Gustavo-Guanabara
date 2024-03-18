/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.arithmeticoperators;

/**
 *
 * @author kevin
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        int r1 = 3;
        int r2 = 5;
        float avg = (r1 + r2) / 2;
        System.out.println("The Average is " + avg);
        
        int number = 5;
        int value = 5 + number++;
        System.out.println(value);
        
        // a += 1       a = a + 1       a++     
        // a -= 1       a = a - 1       a--     
        // a *= 1       a = a * 1
        // a /= 1       a = a / 1
        // a %= 1       a = a % 1
        
        // Square Root      Math.sqrt(a)
        // Cubic Root       Math.cbrt(a)
        
        // Absolute value   Math.abs(a)
        // Floor rounding   Math.floor(a)
        // Ceil rounding    Math.ceil(a)
        // Auto rounding    Math.round(a)
        
        // Number generator
        
        // Math.random()        Between 0.0 and 1.0
        
        // Customizing generator:
        // <initial_value_of_range> + Math.random() * (<final_value_of_range> - <initial_value_of_range>)
    }
}
