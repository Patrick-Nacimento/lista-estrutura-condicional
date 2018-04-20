import javax.swing.JOptionPane;

public class Exercicio06{
   public static void main(String[] args){
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    if(numero % 2 != 0){
        JOptionPane.showMessageDialog(null, "Numero impar");
    } else {
        JOptionPane.showMessageDialog(null, "Numero nao impar");
    
      }
   }
}    