/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cursoemvideo.RelationalOperators;

/**
 *
 * @author kevin
 */
public class RelationalOperators {

    public static void main(String[] args) {
        
        // Relational Operators
        
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1 > n2) ? 0 : 1;
        System.out.println(r);
        
        // >    greater             5 > 2       true
        // <    lesser              4 < 1       false
        // >=   greater or equal    8 >= 3      true
        // <=   lesser or equal     6 <= 6      true
        // ==   equal               9 == 8      false
        // !=   different           4 == 5      true
    }
}
