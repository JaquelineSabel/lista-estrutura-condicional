import javax.swing.JOptionPane;

public class atividade1{

   public static void main (String[] args){
 
   int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero"));
   int antecessor = numero -1;
   int sucessor =  numero +1;
   
   JOptionPane.showMessageDialog(null,
				"Numero:" + numero +
				"\nAntecessor:" + antecessor + 
				"\nSucessor:" + sucessor);
   



   }


}