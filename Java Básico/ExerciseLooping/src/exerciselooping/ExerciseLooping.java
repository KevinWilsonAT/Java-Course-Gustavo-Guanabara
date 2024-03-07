/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciselooping;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class ExerciseLooping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number, sum=0;
        
        do{
            number = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Insert a number: <br><em>(0 ends the program)</em></html>"));
            sum+= number;
        } while (number != 0);
        
    JOptionPane.showMessageDialog(null, "<html>Results:<br>"
            + "<hr>"
            + "The Sum is " + sum + "</html>");
    }
    
}
