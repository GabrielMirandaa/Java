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
public class SaldoCondicional {

    
    public static void main(String[] args) {
        //Var
        double saque, saldoinicial, saldofinal, limite;
        
        //Entrada
        saque= Double.parseDouble(JOptionPane.showInputDialog("Quanto dinheiro você quer sacar?:"));
        saldoinicial=1000;
        limite=2000;
        
        //Processamento
        saldofinal= saldoinicial - saque;
        
        if (saldofinal>=0){
        JOptionPane.showMessageDialog(null, "Seu saldo final é positivo e sobrou R$"+saldofinal);
        }
        
        if ((saldofinal<0) && (saldofinal>=(-limite))){
        JOptionPane.showMessageDialog(null, "Seu saldo final é negativo e você deve R$"+saldofinal);
        
        }else{
          JOptionPane.showMessageDialog(null, "Você pasou do seu limite. Seu limite é de R$"+limite);  
        }
        
       
    }
    
}
