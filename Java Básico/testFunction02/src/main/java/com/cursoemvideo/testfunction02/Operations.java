/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursoemvideo.testfunction02;

/**
 *
 * @author kevin
 */
public class Operations {
    
    public static String counter(int start, int end){
        String string = "";
        
        for(int count = start; count <= end; count++){
            string += count + " ";
        }
        
        return string;
    }
    
}
