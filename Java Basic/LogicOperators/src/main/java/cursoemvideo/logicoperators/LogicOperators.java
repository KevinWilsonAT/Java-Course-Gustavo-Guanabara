/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cursoemvideo.logicoperators;

/**
 *
 * @author kevin
 */
public class LogicOperators {

    public static void main(String[] args) {
        int x = 4, y = 7, z = 12;
        boolean r1, r2, r3, r4, r5;
        r1 =(x < y && y < z) ? true : false;
        System.out.println(r1);
        
        r2 =(x < y && y == z) ? true : false;
        System.out.println(r2);
        
        r3 =(x < y || y == z) ? true : false;
        System.out.println(r3);
        
        r4 =(x < y ^ y < z) ? true : false;
        System.out.println(r4);
        
        r5 =(x < y ^ y < z) ? true : false;
        System.out.println(r5);
        
        // Logic Operators
        
        // &&   AND logic operator      returns true when both conditions are true
        // ||   OR logic operator       returns false when both conditions are false
        // ^    XOR logic operator      returns true when both conditions are different
        // !    NOT logic operator      returns true when condition are false and vice versa
    }
}
