/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícios.condicionaisse.java;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Miranda
 */
public class ParOuImparCondicional {

    public static void main(String[] args) {
        //Var
        int numero;
        
        //Entrada
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
 
        //Processamento
        if ((numero % 2)==0){
            
            JOptionPane.showMessageDialog(null, "Esse número é par!");
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Esse número é ímpar!");
            
        }
    
    }
}
