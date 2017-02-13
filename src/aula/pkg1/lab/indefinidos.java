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
public class indefinidos {
    public static void main(String[] args) {
     Integer jogadas = new Integer ( JOptionPane.showInputDialog("Por favor informe a quantidades de jogadas: "));
     for(int i=0;i<=jogadas;i++)
     {
         int soma =soma + new Integer(JOptionPane.showInputDialog("Informe um valor: "));
     }
     JOptionPane.showInternalMessageDialog(null,"A soma dos " + jogadas+ "números é: "+ soma);
    }
}
