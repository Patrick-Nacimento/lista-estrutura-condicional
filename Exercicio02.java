import javax.swing.JOptionPane;

public class Exercicio02{
   public static void main(String[] args){
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
       if(numero>=1){
           JOptionPane.showMessageDialog(null, "Numero positivo");
       } else {
            JOptionPane.showMessageDialog(null, "Não é positivo");
           
       }
    }
}   
