/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cursoemvideo.displayresolution;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author kevin
 */
public class DisplayResolution {

    public static void main(String[] args) {
        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        int w = (int) resolution.getWidth();
        int h = (int) resolution.getHeight();
        System.out.println("Screen size: "+ w +"px x " + h + "px");
    }
}
