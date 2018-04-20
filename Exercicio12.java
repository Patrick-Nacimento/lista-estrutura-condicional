import javax.swing.JOptionPane;


public class Exercicio12{
    public static void main(String[] args){
        
        double nota01 = Double.parseDouble(JOptionPane.showInputDialog ("Digite sua primeira nota"));

        double nota02 = Double.parseDouble(JOptionPane.showInputDialog ("Digite sua segunda nota"));

        double nota03 = Double.parseDouble(JOptionPane.showInputDialog ("Digite sua terceira nota"));

        double nota04 = Double.parseDouble(JOptionPane.showInputDialog ("Digite sua quarta nota"));

        double nota05 = Double.parseDouble(JOptionPane.showInputDialog ("Digite sua quinta nota"));

        double media = (nota01+nota02+nota03+nota04+nota05)/5;

        if(media <= 5.99){
            JOptionPane.showMessageDialog(null, "Reprovado");
        }else if(media <= 7.99){
            JOptionPane.showMessageDialog(null, "Recuperação");
        }else if(media <= 10.00){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }

      


    }
}