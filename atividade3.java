import javax.swing.JOptionPane;
 
public class atividade3{

  public static void main(String[] args){

     int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
     int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
     int soma = numero + numero2;
     int subtracao = numero - numero2;
     int multiplicacao = numero * numero2;
     double divisao = numero / numero2;
     
  JOptionPane.showMessageDialog(null,
				"Soma:" + soma + 
				"\nSubtracao:" + subtracao + 
				"\nMultiplicacao:" + multiplicacao + 
				"\nDivisao:" + divisao);



  }


}