import javax.swing.JOptionPane;

public class atividade2{

   public static void main (String[] args){

      int numeroUm =  Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
      int numeroDois =  Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
      int numeroTres =  Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
	  int numeroQuatro =  Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
	  
	  // Divide os valores informados pelo usuário para saber se tem algum lado com o mesmo valor.
	  int lateralUm = numeroUm/numeroTres;
	  int lateralDois = numerodois/numeroQuatro;
	  
	  // Verifica se lateralUm for igual a zero,quer dizer que dois numeros são iguals, depois verifica se um
	  // numeroUm que é da lateral tem o mesmo valor que o numeroDois que é do topo,
      // e por ultimo, verifica que o numeroDois e numeroQuatro são iguais,
      // se todas as condições forem atendidas então é um retangulo.	  
	  if (lateralUm == 0) && (numeroUm != numeroDois) && (numeroDois == numeroQuatro){
        JOptionPane.showMessageDialog(null,"É um Retangulo");				                           
	  }else
	  {
		if (lateralDois == 0) && (numeroUm != numeroDoi) && (numeroUm == numeroTres){
			JOptionPane.showMessageDialog(null,"É um Retangulo");
		}else{
			JOptionPane.showMessageDialog(null,"Não é um Retangulo");
		}			
		  
	  }

   }


}