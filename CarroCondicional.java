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
public class CarroCondicional {

 
    public static void main(String[] args) {
        //Var
        int idade;
        string habilitação;
        
        //Entrada
        idade= Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?:"));
        
        //Processamento
        if (idade>=18){
        JOptionPane.showInputDialog(null, "Você tem habilitação?");
        
          if (habilitação="sim"){
           JOptionPane.showMessageDialog(null, "Pode continuar!");
          }else{
              JOptionPane.showMessageDialog(null, "Carro apreendido!");
          }
        }else{
              JOptionPane.showMessageDialog(null, "Você está preso!");
        }
        
    }
    
}
