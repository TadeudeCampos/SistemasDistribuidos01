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
public class ex07 {
     public static void main(String[] args) {
         Integer valor = 1;
         Integer dv = 0;
         Integer cs = 0;
         while(valor > 0){
             valor = new Integer(JOptionPane.showInputDialog("Informe um valor "));
             if(valor >9 && valor <21)
             {
                 dv++;
             }
             else
                 if(valor>49 && valor <61)
                 {
                     cs++;
                 } 
         }
         JOptionPane.showMessageDialog(null, "Os valores maiores que 10 e menores que 20 são :" + dv+ "E os valores maiores que 50 e menores que 60 são :"+ cs);
     }
}
