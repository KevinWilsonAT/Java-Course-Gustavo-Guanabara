/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cursoemvideo.programaverage;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class ProgramAverage {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1st Rank: ");
        float rank1 = keyboard.nextFloat();
        System.out.println("2nd Rank: ");
        float rank2 = keyboard.nextFloat();
        float avg = (rank1 + rank2) / 2;
        
        System.out.println("Your avrage is " + avg);
        if(avg > 9){
            System.out.println("Congratulations.");
        }
    }
}
