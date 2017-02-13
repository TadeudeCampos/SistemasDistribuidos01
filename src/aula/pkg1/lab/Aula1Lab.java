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
public class Aula1Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String escola = JOptionPane.showInputDialog("Digite o nome da escola");
          String aluno = JOptionPane.showInputDialog("Informe o nome do aluno");
          
          JOptionPane.showMessageDialog(null, "o nome da escla e "+ escola+" e o nome do aluno e"+ aluno );
    }
    
}
