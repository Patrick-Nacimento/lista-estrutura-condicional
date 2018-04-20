import javax.swing.JOptionPane;

public class Exercicio05{
   public static void main(String[] args){
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    if(numero % 2 == 0){
        JOptionPane.showMessageDialog(null, "Numero par");
    } else {
        JOptionPane.showMessageDialog(null, "Numero nao par");
    
      }
   }
}    