import javax.swing.JOptionPane;

public class atividade10{

   public static void main(String[] args){

       int nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento"));
       int ano = nascimento;
       int numero = 2018 - ano; 

       JOptionPane.showMessageDialog(null,
                                         "ano:" + ano +
                                         "\nnumero:" + numero);


   
   
   }


}