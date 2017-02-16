/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg1.lab;

import javax.swing.JOptionPane;

/**
 *
 * @author Theparanoic
 */
public class ex09 {
    
     public static void main(String[] args) {
         Integer valor = 1;
         while(valor >= 0){
             valor = new Integer(JOptionPane.showInputDialog("Informe um valor "));
            for(int i=1;i<=valor;i++ ){
                JOptionPane.showMessageDialog(null, i);
            }
         }
     }
    
}
