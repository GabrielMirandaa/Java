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
public class CondicionalIMC {

    
    public static void main(String[] args) {
        //Var
        double tamanho,peso,IMC;
        
        //Entrada
        tamanho= Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu tamanho?:"));
        
        peso= Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu peso?:"));
        
        //Processamento
        IMC=(peso/(tamanho*tamanho));
        
        if (IMC<=18.5){
            JOptionPane.showMessageDialog(null, "Seu peso está abaixo do normal!");
        }
        
        if ((IMC>=18.6) && (IMC<=24.9)){
            JOptionPane.showMessageDialog(null, "Seu peso está normal!");
        }
        
        if ((IMC>=25) && (IMC<=29.9)){
            JOptionPane.showMessageDialog(null, "Seu peso está acima do normal!");
        }
        
        if ((IMC>=30) && (IMC<=34.9)){
            JOptionPane.showMessageDialog(null, "Você está no 1º grau de obesidade!");
        }
        
        if ((IMC>=35) && (IMC<=39.9)){
            JOptionPane.showMessageDialog(null, "Você está no 2º grau de obesidade!");
        }
        
        if (IMC>=40){
            JOptionPane.showMessageDialog(null, "Você está no 3º grau de obesidade!");
        }
        
        JOptionPane.showMessageDialog(null, "Seu IMC é: "+IMC);
        
        
        
        
       
        
    }
    
}
