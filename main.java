
package Cuadilatero;

import javax.swing.JOptionPane;


public class main {
    
    public static void main(String[] args) {
        Cuadrilatero objeto;
        
        float lado1,lado2;
        
        System.out.println("digite los lados");
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("digite el lado 1"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("digite el lado 1"));
        
        if (lado1==lado2){
            objeto=new Cuadrilatero(lado2);
        }
        else{
            objeto=new Cuadrilatero(lado1,lado2);
        }
                
        
        System.out.println("el perimetro es "+objeto.getPerimetro());
        System.out.println("el perimetro es "+objeto.getArea());
                
                
    }
}
