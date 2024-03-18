/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatornumbers;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class CalculatorNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int number;
                int sum = 0;
                int total = 0;
                int even = 0;
                int odd = 0;
                int abovehundred = 0;
                int qty = 0;
                int avg = 0;
                
        
        do{
            number = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Insert a number: <br><em>(0 ends the program)</em></html>"));
            
            if(number % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
            
            if(number > 100){
                abovehundred++;
            }
            
            sum+= number;
            total++;
            qty++;
            
        } while (number != 0);
        
        
        avg = sum / qty;
        
    JOptionPane.showMessageDialog(null, "<html>Results:<br>"
            + "<hr>"
            + "Total Numbers Inserted: " + total + "<br>"
            + "Even Numbers Inserted: " + even + "<br>"
            + "Odd Numbers inserted: " + odd + "<br>"
            + "Over 100 Numbers inserted: " + abovehundred + "<br>"
            + "Average of Numbers Inserted: " + avg + "</html>");
    }
    
}
