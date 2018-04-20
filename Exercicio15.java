import javax.swing.JOptionPane;

public class Exercicio15{
    public static main(String[] args){
        int n01 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        int n02 = Integer.parseInt(JOptionPane.showInputDialog("Digite segundo numero"));

        int n03 = Integer.parseInt(JOptionPane.showInputDialog("Digite terceiro numero"));

        if(n01 < n02 && n02 < n03){
            JOptionPane.showMessageDialog(null, n01 + " - " + n02 + " - " + n03);
        }
    }
}