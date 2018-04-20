import javax.swing.JOptionPane;

public class atividade2{

   public static void main (String[] args){

      int quantidadeLitrosIngeridos =  Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de litros ingeridos"));
      int quantidadeAnosConsumidos =  Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de anos ingeridos"));
      double valorPorLitro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago por litro"));

     double quantidadeLitrosConsumidos = quantidadeLitrosIngeridos * quantidadeAnosConsumidos * 365;
     double valorTotalPago = quantidadeLitrosConsumidos * valorPorLitro ;


     JOptionPane.showMessageDialog(null,"quantidade de litros consumido = " + quantidadeLitrosConsumidos + 
				         " valor pago = " + valorTotalPago );

   }


}