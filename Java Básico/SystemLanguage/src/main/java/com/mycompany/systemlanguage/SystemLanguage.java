/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.systemlanguage;

import java.util.Locale;

/**
 *
 * @author kevin
 */
public class SystemLanguage {

    public static void main(String[] args) {
        Locale lang = Locale.getDefault();
        
        System.out.println("The system language is:");
        System.out.println(lang);
    }
}
