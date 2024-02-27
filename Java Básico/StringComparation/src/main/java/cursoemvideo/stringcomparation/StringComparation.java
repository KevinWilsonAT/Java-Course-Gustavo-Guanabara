/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cursoemvideo.stringcomparation;

/**
 *
 * @author kevin
 */
public class StringComparation {

    public static void main(String[] args) {
        String name1 = "Kevin";
        String name2 = "Kevin";
        String name3 = new String("Kevin");
        String res;
        
        res = (name1 == name2) ? "Equal" : "Different";
        System.out.println(res);
        
        res = (name2 == name3) ? "Equal" : "Different";
        System.out.println(res);
        
        res = (name3 == name1) ? "Equal" : "Different";
        System.out.println(res);
        
        res = (name1.equals(name3)) ? "Equal" : "Different";
        System.out.println(res);
        
        res = (name2.equals(name3)) ? "Equal" : "Different";
        System.out.println(res);
    }
}
