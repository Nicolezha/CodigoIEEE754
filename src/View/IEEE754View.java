/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

import Model.IEEE754;

/**
 *
 * @author Nicole Hernandez
 */
public class IEEE754View {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IEEE754 i = new IEEE754();
        i.iEEE32bitsToDecimal("01000000101000000000000000000000");
        
        System.out.println(i.getExpo32bits());
        System.out.println(i.getMantisa32bits());
        System.out.println(i.getSign32bits());
        System.out.println(i.getDecimal32bits());
        
        i.iEEE64bitsToDecimal("1100000000001001000000000000000000000000000000000000000000000000");
        
        System.out.println(i.getExpo64bits());
        System.out.println(i.getMantisa64bits());
        System.out.println(i.getSign64bits());
        System.out.println(i.getDecimal64bits());
       
        i.decimalToIEEE32bits(-3.25);
        System.out.println("DECIMAL A BITS");
        System.out.println(i.getExpo32bits());
        System.out.println(i.getMantisa32bits());
        System.out.println(i.getSign32bits());
        
        i.decimalToIEEE32bits(-3.25);
        System.out.println("DECIMAL A BITS");
        System.out.println(i.getExpo32bits());
        System.out.println(i.getMantisa32bits());
        System.out.println(i.getSign32bits());
        
        
        i.decimalToIEEE32bits(1);
        System.out.println("DECIMAL A BITS");
        System.out.println(i.getExpo32bits());
        System.out.println(i.getMantisa32bits());
        System.out.println(i.getSign32bits());
        
        i.decimalToIEEE64bits(2);
        System.out.println("DECIMAL A BITS");
        System.out.println(i.getExpo64bits());
        System.out.println(i.getMantisa64bits());
        System.out.println(i.getSign64bits());
        
    }
    
}
