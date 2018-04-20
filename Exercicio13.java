import javax.swing.JOptionPane;


public class Exercicio13{
    public static void main(String[] args){
        int numero01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        int numero02 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo numero"));

        if(numero01 > numero02){
            JOptionPane.showMessageDialog(null, "Numero01 é Maior");
        }else if(numero01 < numero02){
            JOptionPane.showMessageDialog(null, "Numero02 é maior");
        }



    }
}