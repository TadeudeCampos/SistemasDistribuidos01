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
public class solicitausUario {
     public static void main(String[] args) {
          Integer mes = 0;
         while(mes<=12){
       mes = new Integer(JOptionPane.showInputDialog("Digite o número de um més: "));
        if(mes == 2){
        JOptionPane.showMessageDialog(null, "o més tesm 28 dias ");
        }
        else
            if(mes%2==0){
                  JOptionPane.showMessageDialog(null, "o més tesm 30 dias ");
            }
        else
                if(mes%2==1){
                      JOptionPane.showMessageDialog(null, "o més tesm 31 dias ");
                }}
         
     }
}
