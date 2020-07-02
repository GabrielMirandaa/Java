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
public class SalarioCondicional {

    
    public static void main(String[] args) {
        //Var
        double salario,aumento;
        
        //Entrada
        salario= Double.parseDouble(JOptionPane.showInputDialog("Quanto você ganha por mês?:"));
        
        //Processamento
        if (salario<=1500){
            aumento= salario * 1.2;
        }
        
        else if ((salario>1500) && (salario<=3000)){
            aumento= salario * 1.15;
        }
        
        else{
            aumento= salario * 1.1;
        }
        
        JOptionPane.showMessageDialog(null, "O seu aumento é de: R$"+aumento);
        
        
        
  
       
    }
    
}