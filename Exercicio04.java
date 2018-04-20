import javax.swing.JOptionPane;

import com.sun.glass.ui.Menu;
    public class Exercicio04{
        public static void main(String[] args){
            double numero = Double.parseDouble(JOptionPane.showInputDialog ("Escolha um numero"));
            double numero02 = Double.parseDouble(JOptionPane.showInputDialog("Escolha numero 2"));
            int menu = Integer.parseInt     (JOptionPane.showInputDialog("    MENU\n \n1     -    Somar  \n2     -    Subtrair  \n3     -    Multiplicar  \n4     -        Dividir  " ));


            if (menu == 1){
                double soma = numero+numero02;
                JOptionPane.showMessageDialog(null, "A soma é: " + soma);
            }else if (menu == 2){
                double subtracao = numero-numero02;
                JOptionPane.showMessageDialog(null, "A subtracao é: ");
            }else if (menu == 3){
                double multiplicacao = numero*numero02;
                JOptionPane.showMessageDialog(null, "A multiplicacao é: ");
            }else if (menu == 4){    
                double divisao = numero/numero02;
                JOptionPane.showMessageDialog(null, "A divisao é: ");

            }
        }
    }

