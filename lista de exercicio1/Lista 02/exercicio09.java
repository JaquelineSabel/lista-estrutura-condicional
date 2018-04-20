import javax.swing.JOptionPane;

public class atividade2{

   public static void main (String[] args){

      int numeroUm =  Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
      int numeroDois =  Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
      int numeroTres =  Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
	  int numeroQuatro =  Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
	  
	  int lateralUm = numeroUm/numeroTres;
	  int lateralDois = numerodois/numeroQuatro;
	  
	  if (lateralUm == 0) && (lateralDois == 0) && (numeroUm = numeroQuatro){
        JOptionPane.showMessageDialog(null,"É um Quadrado");				                           
	  }else
	  {
		JOptionPane.showMessageDialog(null,"Não é um Quadrado");  
	  }

   }


}