/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB08
 */
public class Semana 
{
    public static void main(String[] args)
{
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        switch(numero)
     {            

      
    
        
case 1://Caso 1 -si el valor es 7
 JOptionPane.showMessageDialog(null, "Lunes");
break;
case 2://Caso 2 -si el valor es 6
JOptionPane.showMessageDialog(null, "Martes");
break;
case 3://Caso 3 -si el valor es 5
JOptionPane.showMessageDialog(null, "Miercoles");
break;
case 4://Caso 4 -si el valor es 4
JOptionPane.showMessageDialog(null, "Jueves");
break;
case 5://Caso 4 -si el valor es 4
JOptionPane.showMessageDialog(null, "Viernes");
break;
case 6://Caso 4 -si el valor es 4
JOptionPane.showMessageDialog(null, "Sabado");
break;
case 7://Caso 4 -si el valor es 4
JOptionPane.showMessageDialog(null, "Domingo");
break;
default:
JOptionPane.showMessageDialog(null, "Insuficiente");
break; 
        
  }

 }

}






          

