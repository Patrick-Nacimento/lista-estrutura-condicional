import javax.swing.JOptionPane;


public class Exercicio11{
    public static void main(String[] args){

        int numero01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int numero02 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo numero"));
        int numero03 = Integer.parseInt(JOptionPane.showInputDialog("Digite terceiro numero"));
        int numero04 = Integer.parseInt(JOptionPane.showInputDialog("Digite quarto numero"));

        if(numero01 == numero02){
            if(numero03 == numero04){
                JOptionPane.showMessageDialog(null, "É um retângulo");
        }else {
            JOptionPane.showMessageDialog(null, "Não é um retângulo");

          }
        }
    }
}