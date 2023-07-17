
package POO;

import javax.swing.JOptionPane;


public class POO1 {

   
    int num1,num2,suma,resta,multiplicacion,division,resultado;
    
    
    public void LEERNUMEROS(){
        num1= Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
  
    }
    
    public void sumar(){
        suma= num1+num2;
    }
    public void restar(){
        resta=num1-num2;
  
    }
    public void dividir(){
        division=num1/num2;
        
    }
    public void multiplicar(){
        multiplicacion= num1*num2;
    }
    
    public void mostrar(){
        System.out.println("la suma es "+suma);
        System.out.println("la resta es "+ resta);
        System.out.println("la division es "+division);
        System.out.println("la multiplicacion es "+multiplicacion);
        
    }
}


    
    
