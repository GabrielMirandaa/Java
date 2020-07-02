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
public class BoxeCondicional {

    
    public static void main(String[] args) {
        //Var
        double peso;
        
        //Entrada
        peso= Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu peso?:"));
        
        //Processamento
        if (peso<=46.27){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Palha Ligeiro");
        }
        
        if ((peso>=46.28) && (peso<=47.63)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Palha");
        }
        
        if ((peso>=47.64) && (peso<=48.99)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Mosca Ligeiro");
        }
        
        if ((peso>=49) && (peso<=50.35)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Mosca");
        }
        
        if ((peso>=50.36) && (peso<=51.71)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Super Mosca");
        }
        
        if ((peso>=51.72) && (peso<=53.52)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Galo");
        }
        
        if ((peso>=53.53) && (peso<=55.34)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Super Galo");
        }
        
        if ((peso>=55.35) && (peso<=57.15)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Pena");
        }
        
        if ((peso>=57.16) && (peso<=58.97)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Super Pena");
        }
        
        if ((peso>=58.98)  && (peso<=61.23)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Leve");
        }
        
         if ((peso>=61.24) && (peso<=63.5)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Super Leve");
        }
         
         if ((peso>=63.6) && (peso<=66.68)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Meio-Médio");
        }
          
         if ((peso>=66.69) && (peso<=69.85)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Super Meio-Médio");
        }
                
         if ((peso>=69.86) && (peso<=73.03)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Médio");
        }
                      
         if ((peso>=73.04) && (peso<=76.2)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Super Médio");
        }
                            
         if ((peso>=76.3) && (peso<=79.38)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Meio-Pesado");
        }
         
         if ((peso>=79.39) && (peso<=90.72)){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Cruzador");
        }
              
         if (peso>=90.73){
            JOptionPane.showMessageDialog(null, "Sua categoria é: Pesado");
        }
         
         
    }
    
}
