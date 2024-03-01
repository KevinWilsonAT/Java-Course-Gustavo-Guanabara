/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cursoemvideo.legsprogram;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class LegsProgram {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many legs? ");
        
        int leg_number = keyboard.nextInt();
        
        String type;
        System.out.println("This is a ");
        switch(leg_number){
            case 1:
                type = "Saci";
                break;
            case 2:
                type = "Two-Footed / Bipedal";
                break;
            case 3:
                type = "Tripod";
                break;
            case 4:
                type = "Four-Footed / Quadrupedal";
                break;
            case 6:
                type = "Bee";
                break;
            case 8:
                type = "Spider";
                break;
            default:
                type = "Extra Terrestrial";
                break;
        }
        System.out.println(type);
    }
}
