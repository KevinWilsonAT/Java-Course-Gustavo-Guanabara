/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cursoemvideo.ageprogram;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class AgeProgram {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Birth Year:");
        int by = keyboard.nextInt();
        int age = 2024 - by;
        System.out.println("Your age is: " + age);
        if(age >= 18){
            System.out.println("Over 18 years");
        }
        else{
            System.out.println("Under 18 years");
        }
    }
}
