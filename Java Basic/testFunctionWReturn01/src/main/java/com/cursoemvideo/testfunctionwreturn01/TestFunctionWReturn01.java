/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.testfunctionwreturn01;

/**
 *
 * @author kevin
 */
public class TestFunctionWReturn01 {

    static int addition(int a, int b){
        int add = a + b;
        return add;
    }
    
    public static void main(String[] args) {
        int add = addition(5, 2);
        System.out.println("The sum is: " + add);
    }
}
