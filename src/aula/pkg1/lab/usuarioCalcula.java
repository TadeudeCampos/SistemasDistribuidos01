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
public class usuarioCalcula {
     public static void main(String[] args) {
         Integer nun = new Integer(JOptionPane.showInputDialog("Digite um número"));
         JOptionPane.showMessageDialog(null,"O dobro do número"+nun+"é"+(nun*2));
         
         
     }
}
