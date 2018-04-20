import javax.swing.JOptionPane;
 
public class atividade4{

  public static void main(String[] args){ 

     int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
     int multiplicacaoZero = 0 * numero;
     int multiplicacaoUm = 1 * numero;
     int multiplicacaoDois = 2 * numero;
     int multiplicacaoTres = 3 * numero;
     int multiplicacaoQuatro = 4 * numero;
     int multiplicacaoCinco = 5 * numero ; 
     int multiplicacaoSeis = 6 * numero;
     int multiplicacaoSete = 7 * numero;
     int multiplicacaoOito = 8 * numero;
     int multiplicacaoNove = 9 * numero;
     int multiplicacaoDez = 10 * numero;
     

JOptionPane.showMessageDialog(null,
                                   "multiplicacao zero:" + multiplicacaoZero +
                                   "\nmultiplicacao um:" + multiplicacaoUm + 
                                   "\nmultiplicacao dois:" + multiplicacaoDois + 
                                   "\nmultiplicacao tres:" + multiplicacaoTres + 
                                   "\nmultiplicacao quatro:" + multiplicacaoQuatro + 
                                   "\nmultiplicacao cinco:" + multiplicacaoCinco + 
                                   "\nmultiplicacao seis:" + multiplicacaoSeis + 
                                   "\nmultiplicacao sete:" + multiplicacaoSete + 
                                   "\nmultiplicacao oito:" + multiplicacaoOito + 
                                   "\nmultiplicacao nove:" + multiplicacaoNove + 
                                   "\nmultiplicacao dez:" + multiplicacaoDez );

 
  }


}