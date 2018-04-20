import javax.swing.JOptionPane;

public class Exercicio07{
   public static void main(String[] args){
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
       if(numero ==1){
        JOptionPane.showMessageDialog(null, "Numero igual");
    } else {
         JOptionPane.showMessageDialog(null, "numero diferente");
       }
    }
}