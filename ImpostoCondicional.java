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
public class ImpostoCondicional {

    
    public static void main(String[] args) {
        //Var
        double salario, imposto;
        
        //Entrada
        salario= Double.parseDouble(JOptionPane.showInputDialog("Quanto você ganha por mês?:"));
        
        //Processamento
        if (salario<=1903.98){
        imposto = 0;
        }
        
        else if((salario>=1903.99) && (salario<=2826.65)){
        imposto = salario * 0.075;
        }
        
        else if ((salario>=2826.66) && (salario<=3751.05)){
        imposto = salario * 0.15;
        }
        
        else if ((salario>=3751.06) && (salario<=4664.68)){
        imposto = salario * 0.225;
        
        }else{   
        imposto = salario * 0.275;
        }
        
        JOptionPane.showMessageDialog(null, "O custo do imposto de renda é de R$"+imposto);
        
    }
    
}
