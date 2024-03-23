package main;
import javax.swing.JOptionPane;

import main.calculadora.*;

public class Soma {
    public static void main(String[] args) {
        
      
    	JOptionPane.showMessageDialog(null, "A soma de " + Inserir.numero1 + " e " +Inserir.numero2+ " :" + Somar.somar(Inserir.numero1, Inserir.numero2));
        

    }
}

