import javax.swing.JOptionPane;

public class atividade6{

   public static void main(String[] args){

      double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota1"));
      double nota2 =Double.parseDouble(JOptionPane.showInputDialog("Digite a nota2"));
      double nota3 =  Double.parseDouble(JOptionPane.showInputDialog("Digite a nota3"));
      double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota4"));
      double media = (nota1 + nota2 + nota3 + nota4)/4;
      
      

JOptionPane.showMessageDialog(null,
			      "nota1:" + nota1 + 
			      "\nNota2:" + nota2 + 
			      "\nNota3:" + nota3 + 
			      "\nNota4:" + nota4 + 
			      "\nMedia:" + media);



   }


}