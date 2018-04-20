import javax.swing.JOptionPane;
public class atividade8{
   public static void main(String[] args){

       //Pede para o usuário um numero  
       int numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
	   //Pede para o usuário um numero
       int numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
	   /**Inverte os numeros, a variavel numeroAuxiliar recebe o valor da variavel numeroUm,
	      Depois a variavel numeroUm recebe o valor da variavel numeroDois,
		  Depois a variavel numeroDois recebe o valor da variavel numeroAuxiliar,
		  com isso os numeros das variaveis são invertidos.
		  Exemplo:
			numeroUm = 12;
			numeroDois = 15;
			numeroAuxiliar = numeroUm (nessa linha o java esta pegando o valor dentro do numeroUm que é 12 e jogando esse valor para a variavel numeroAuxiliar)
			numeroUm = numeroDois (nessa linha o java esta pegando o valor dentro do numeroDois que é 15 e jogando esse valor para a variavel numeroUm)
			numeroDois = numeroUm (nessa linha o java esta pegando o valor dentro do numeroAuxiliar que é 12 e jogando esse valor para a variavel numeroDois)
		  Abaixo os valores que cada variavel possui depois dessa inversao;	
			numeroUm = 15;
			numeroDois = 12; 
			numeroAuxiliar = 12;		  
	    **/
       int numeroAuxiliar = numeroUm;
           numeroUm = numeroDois;
           numeroDois = numeroAuxiliar;		   

	   JOptionPane.showMessageDialog(null,
                                         "numero Um:" + numeroUm +
                                         "\numero dois:" + numeroDois);
   }
}
