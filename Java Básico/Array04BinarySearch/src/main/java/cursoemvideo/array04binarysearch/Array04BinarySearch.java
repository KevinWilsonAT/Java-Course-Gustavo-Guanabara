/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cursoemvideo.array04binarysearch;

import java.util.Arrays;

/**
 *
 * @author kevin
 */
public class Array04BinarySearch {

    public static void main(String[] args) {
        int array[] = {3, 7, 6, 1, 9, 4, 2};
        
        for(int a: array){
            System.out.print(a + " ");
        }
        System.out.println("");
        
        int search = Arrays.binarySearch(array, 1);
        System.out.println("Found the requested value at position " + search);
    }
}
