/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author LAB08
 */
public class Calificacion 
{
     public static void main(String[] args)
     {
     float nota1;
     float nota2;
     float nota3;
     float promedio;
     
      nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota1"));
      nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota2"));
      nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese nota3"));
      promedio =Float.parseFloat(JOptionPane.showInputDialog("Ingrese promedio"));
         if (promedio > 4) 
         {
             JOptionPane.showMessageDialog(null, "Aprobo");  
         }
         else
         {
          JOptionPane.showMessageDialog(null, "Reprobo");   
         }
      
        


         
     }
             
}
