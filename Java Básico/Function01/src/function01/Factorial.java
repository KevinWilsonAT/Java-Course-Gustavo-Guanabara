/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function01;

/**
 *
 * @author kevin
 */
public class Factorial {
    private int number = 0;
    private int factorial = 1;
    private String formula = "";
    
    public void setValue(int inputnumber){
        number = inputnumber;
        int factorialop = 1;
        String stringop = "";
        
        for(int count = number; count > 1; count--){
            factorialop *= count;
            stringop += count + " x ";
        }
        
        stringop += "1 = ";
        factorial = factorialop;
        formula = stringop;
    }
    
    public int getFactorial(){
        return factorial;
    }
    
    public String getFormula(){
        return formula;
    }
}
