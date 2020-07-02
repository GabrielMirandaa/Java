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
public class VolêiCondicional {

   
    public static void main(String[] args) {
        //Var
        double tamanho;
        int idade;
        
        //Entrada
        tamanho= Double.parseDouble( JOptionPane.showInputDialog("Quantos é o seu tamanho?:"));
        
        idade= Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?:"));
        
        //Processamento
        if ((tamanho>=1.75) && (idade>=18)){

            JOptionPane.showMessageDialog(null, "Você pode participar do campeonato!");
            
        }else{
          
            JOptionPane.showMessageDialog(null, "Você não pode participar do campeonato!");
        }
       
       
    }
    
}
