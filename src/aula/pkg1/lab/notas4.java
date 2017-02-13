/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg1.lab;

import javax.swing.JOptionPane;
import sun.applet.Main;

/**
 *
 * @author Theparanoic
 */
public class notas4 {
     public static void main(String[] args) {
      Integer nota1 = new Integer (JOptionPane.showInputDialog("Informe a nota"));
      Integer nota2 = new Integer (JOptionPane.showInputDialog("Informe a nota"));
      Integer nota3 = new Integer (JOptionPane.showInputDialog("Informe a nota"));
      Integer nota4 = new Integer (JOptionPane.showInputDialog("Informe a nota"));
      JOptionPane.showMessageDialog(null,"A media das notas é"+ (nota1+nota2+nota3+nota4)/4);
     }
}
