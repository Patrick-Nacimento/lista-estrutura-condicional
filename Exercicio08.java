import javax.swing.JOptionPane;

public class Exercicio08{
   public static void main(String[] args){
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    if(numero % 2 == 0){
        JOptionPane.showMessageDialog(null, "Numero par");
    }else if(numero % 2 != 0){
        JOptionPane.showMessageDialog(null, "Numero impar");
    }else {
        JOptionPane.showMessageDialog(null, "Numero neutro");

    }  

    if(numero <=-1){
        JOptionPane.showMessageDialog(null, "Numero negativo");
    }else {
        JOptionPane.showMessageDialog(null, "Numero positivo");
    
    }

    if(numero > 10){
        JOptionPane.showMessageDialog(null, "Numero maior que 10");
    }else {
        JOptionPane.showMessageDialog(null, "Numero menor que 10");

    }

    if(numero <= 50){
        JOptionPane.showMessageDialog(null, "Numero menor ou igual que 50");
    }else {
        JOptionPane.showMessageDialog(null, "Numero maior que 50");

    }

    if(numero < -10){
        JOptionPane.showMessageDialog(null, "Numero menor que -10");
    }else {
        JOptionPane.showMessageDialog(null, "Numero maior que -10");

    }

    if(numero >= 30){
        JOptionPane.showMessageDialog(null, "Numero maior ou igual a 30");
    }else {
        JOptionPane.showMessageDialog(null, "Numero menor que 30");

    }

    if(numero ==1){
        JOptionPane.showMessageDialog(null, "Numero igual");
    }else {
        JOptionPane.showMessageDialog(null, "Numero diferente");
    }
  }
}

   
